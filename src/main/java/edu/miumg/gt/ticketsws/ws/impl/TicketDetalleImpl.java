/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.impl;

import edu.miumg.gt.ticketsws.entities.Ticket;
import edu.miumg.gt.ticketsws.entities.TicketDetalle;
import edu.miumg.gt.ticketsws.entities.Usuario;
import edu.miumg.gt.ticketsws.entities.builder.TicketDetalleBuilder;
import edu.miumg.gt.ticketsws.ws.inte.TicketDetalleInt;
import edu.miumg.gt.ticketsws.ws.repo.TicketDetalleRepo;
import edu.miumg.gt.ticketsws.ws.repo.TicketRepo;
import edu.miumg.gt.ticketsws.ws.repo.UsuarioRepo;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class TicketDetalleImpl implements TicketDetalleInt{

    @Autowired()
    private TicketDetalleRepo ticketDetalleRepo;
    
    Ticket ticket = new Ticket();
    
    @Autowired()
    private TicketRepo ticketRepo;
    
     @Autowired()
    private UsuarioRepo usuarioRepo;
    
    @Override
    public ResponseEntity<TicketDetalle> create(String asunto, Integer ticketId) throws Exception {
        
       ticket = ticketRepo.findOne(ticketId);
       // Usuario usuario = usuarioRepo.findOne(ticket.getUsuario().getId()); 
             
        
       TicketDetalle ticketDetalleSave = new TicketDetalleBuilder()
               .setAsunto(asunto)
               .setFechaActualizar(new Date())
               .setTicket(ticket)
               .createTicketDetalle();
       
        return new ResponseEntity(ticketDetalleRepo.save(ticketDetalleSave), HttpStatus.OK);
    }
    
}
