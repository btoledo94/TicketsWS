/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.impl;

import edu.miumg.gt.ticketsws.entities.AreaTrabajo;
import edu.miumg.gt.ticketsws.entities.Departamento;
import edu.miumg.gt.ticketsws.entities.Ticket;
import edu.miumg.gt.ticketsws.entities.TicketEstado;
import edu.miumg.gt.ticketsws.entities.Usuario;
import edu.miumg.gt.ticketsws.entities.builder.TicketBuilder;
import edu.miumg.gt.ticketsws.ws.inte.TicketInt;
import edu.miumg.gt.ticketsws.ws.repo.AreaTrabajoRepo;
import edu.miumg.gt.ticketsws.ws.repo.DepartamentoRepo;
import edu.miumg.gt.ticketsws.ws.repo.TicketEstadoRepo;
import edu.miumg.gt.ticketsws.ws.repo.TicketRepo;
import edu.miumg.gt.ticketsws.ws.repo.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class TicketImpl implements TicketInt{
    
    @Autowired()
    private TicketRepo ticketRepo;
    
    @Autowired()
    private TicketEstadoRepo ticketEstadoRepo;
    
    @Autowired()
    private UsuarioRepo usuarioRepo;
    
    @Autowired()
    private DepartamentoRepo departamentoRepo;
    
    @Autowired()
    private AreaTrabajoRepo areaTrabajoRepo;

    @Override
    public ResponseEntity<Ticket> create(Ticket ticket) throws Exception {
        
        TicketEstado ticketEstado = ticketEstadoRepo.findByEstado("CREADO");
        
        Usuario usuarioCreo = usuarioRepo.findOne(ticket.getUsuario().getId());
        
        Departamento departamento = departamentoRepo.findOne(ticket.getDepartamento().getId());
        
        AreaTrabajo areaTrabajo = areaTrabajoRepo.findOne(ticket.getAreaTrabajo().getId());
        
        if(null == ticketEstado || null == usuarioCreo || null == departamento || null == areaTrabajo){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        Ticket ticketToSave = new TicketBuilder()
                .setUsuario(usuarioCreo)
                .setTicketEstado(ticketEstado)
                .setFechaInicio(ticket.getFechaInicio())
                .setFechaFin(ticket.getFechaFin())
                .setDepartamento(departamento)
                .setAreaTrabajo(areaTrabajo)               
                .setActive(Boolean.TRUE)
                .createTicket();

        return new ResponseEntity(ticketRepo.save(ticketToSave), HttpStatus.OK);
    }
}
