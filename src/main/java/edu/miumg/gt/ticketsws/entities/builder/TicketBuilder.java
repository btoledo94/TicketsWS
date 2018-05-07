/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.entities.builder;

import edu.miumg.gt.ticketsws.entities.AreaTrabajo;
import edu.miumg.gt.ticketsws.entities.Departamento;
import edu.miumg.gt.ticketsws.entities.Ticket;
import edu.miumg.gt.ticketsws.entities.TicketEstado;
import edu.miumg.gt.ticketsws.entities.Usuario;
import java.util.Date;

/**
 *
 * @author BYRON TOLEDO
 */
public class TicketBuilder {
    
   private Date fechaInicio;
   private String tituloProblema;
   private Date fechaFin;
   private TicketEstado ticketEstado;
   private Usuario usuario;
   private Usuario usuarioAsignado;
   private Departamento departamento;
   private AreaTrabajo areaTrabajo;
   private Boolean active;

    public TicketBuilder() {
        //Default Constructor
    }

    public TicketBuilder setTituloProblema(String tituloProblema) {
        this.tituloProblema = tituloProblema;
        return this;
    }
       

    public TicketBuilder setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
        return this;
    }

    public TicketBuilder setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
        return this;
    }

    public TicketBuilder setTicketEstado(TicketEstado ticketEstado) {
        this.ticketEstado = ticketEstado;
        return this;
    }

    public TicketBuilder setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    public TicketBuilder setUsuarioAsignado(Usuario usuarioAsignado) {
        this.usuarioAsignado = usuarioAsignado;
        return this;
    }

    public TicketBuilder setDepartamento(Departamento departamento) {
        this.departamento = departamento;
        return this;
    }

    public TicketBuilder setAreaTrabajo(AreaTrabajo areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
        return this;
    }

    public TicketBuilder setActive(Boolean active) {
        this.active = active;
        return this;
    }
       
   public Ticket createTicket(){
       return Ticket.create(tituloProblema,fechaInicio, fechaFin, ticketEstado, usuario, usuarioAsignado, departamento, areaTrabajo, active);
   }
    
}
