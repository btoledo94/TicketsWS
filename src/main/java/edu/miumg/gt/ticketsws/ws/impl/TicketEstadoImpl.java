/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.impl;

import edu.miumg.gt.ticketsws.entities.TicketEstado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import edu.miumg.gt.ticketsws.ws.inte.TicketEstadoInt;
import edu.miumg.gt.ticketsws.ws.repo.TicketEstadoRepo;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class TicketEstadoImpl implements TicketEstadoInt{
    
    @Autowired()
    private TicketEstadoRepo ticketEstadoRepo;

    @Override
    public ResponseEntity<List<TicketEstado>> doGetAll() throws Exception {
        return new ResponseEntity(ticketEstadoRepo.findAll(), HttpStatus.OK);
    }
    
    
}
