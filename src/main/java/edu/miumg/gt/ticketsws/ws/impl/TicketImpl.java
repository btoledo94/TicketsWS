/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.impl;

import edu.miumg.gt.ticketsws.entities.Ticket;
import edu.miumg.gt.ticketsws.ws.inte.TicketInt;
import edu.miumg.gt.ticketsws.ws.repo.TicketRepo;
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
public class TicketImpl implements TicketInt{
    
    @Autowired()
    private TicketRepo ticketRepo;

    @Override
    public ResponseEntity<Ticket> create(Ticket ticket) throws Exception {
        
        ticket.setFechaInicio(new Date());
        ticket.setAreaTrabajo(null);
        ticket.setFechaFin(null);
        ticketRepo.save(ticket);
        return new ResponseEntity(ticket, HttpStatus.OK);
    }
}
