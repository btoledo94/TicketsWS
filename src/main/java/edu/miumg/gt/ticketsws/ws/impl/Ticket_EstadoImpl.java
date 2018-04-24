/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.impl;

import edu.miumg.gt.ticketsws.entities.Ticket_Estado;
import edu.miumg.gt.ticketsws.ws.inte.Ticket_EstadoInt;
import edu.miumg.gt.ticketsws.ws.repo.Ticket_EstadoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class Ticket_EstadoImpl implements Ticket_EstadoInt{
    
    @Autowired()
    private Ticket_EstadoRepo ticket_EstadoRepo;

    @Override
    public ResponseEntity<List<Ticket_Estado>> doGetAll() throws Exception {
        return new ResponseEntity<>(ticket_EstadoRepo.findAll(), HttpStatus.OK);
    }
    
    
}
