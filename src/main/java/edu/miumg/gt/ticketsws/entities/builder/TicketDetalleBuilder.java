/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.entities.builder;

import edu.miumg.gt.ticketsws.entities.Ticket;
import edu.miumg.gt.ticketsws.entities.TicketDetalle;
import java.util.Date;

/**
 *
 * @author BYRON TOLEDO
 */
public class TicketDetalleBuilder {
    
    private String asunto;
    private Date fechaActualizar;
    private byte[] archivo;
    private Ticket ticket;

    public TicketDetalleBuilder() {
    
    }

    public TicketDetalleBuilder setAsunto(String asunto) {
        this.asunto = asunto;
        return this;
    }

    public TicketDetalleBuilder setFechaActualizar(Date fechaActualizar) {
        this.fechaActualizar = fechaActualizar;
        return this;
    }

    public TicketDetalleBuilder setTicket(Ticket ticket) {
        this.ticket = ticket;
        return this;
    }

    public TicketDetalleBuilder setArchivo(byte[] archivo) {
        this.archivo = archivo;
        return this;
    }
    
    
    
     public TicketDetalle createTicketDetalle(){
       return TicketDetalle.create(asunto,fechaActualizar, archivo,ticket);
   }
     
}
