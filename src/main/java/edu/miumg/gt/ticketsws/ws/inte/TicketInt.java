/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.inte;

import edu.miumg.gt.ticketsws.entities.Ticket;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BYRON TOLEDO
 */
@RestController()
@RequestMapping(value = "/api/Ticket",produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public interface TicketInt {
    
    @Transactional()
    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public ResponseEntity<Ticket> create(
            @RequestBody Ticket ticket,
            @RequestParam(value = "correo", defaultValue = "") String correo
                        
    ) throws Exception;
    
    @Transactional(readOnly = true)
    @RequestMapping(value={"","/"},method=RequestMethod.GET)
   public ResponseEntity<Ticket> findAll(
    @RequestParam(value = "idDepartamento", defaultValue = "") Integer idDepartamento
      ) throws Exception;
   
   
   @Transactional()
    @RequestMapping(value ="/encabezadoTicket", method = RequestMethod.POST)
    public ResponseEntity<Ticket> encabezadoUpdate(
            @RequestParam(value = "idTicket", defaultValue = "") Integer idTicket,
            @RequestParam(value = "idUsuarioAsig", defaultValue = "") Integer idUsuarioAsig,
            @RequestParam(value = "idArea", defaultValue = "") Integer idArea,
            @RequestParam(value = "nombreActualizado", defaultValue = "") String nombreActualizado,
            @RequestParam(value = "idDepartamento", defaultValue = "") Integer idDepartamento
                        
    ) throws Exception;
    
     @Transactional(readOnly = true)
    @RequestMapping(value="/myTicket",method=RequestMethod.GET)
   public ResponseEntity<Ticket> myTickets(
    @RequestParam(value = "idUsuario", defaultValue = "") Integer idUsuario
      ) throws Exception;
   
   @Transactional(readOnly = true)
    @RequestMapping(value="/myTicketCreado",method=RequestMethod.GET)
   public ResponseEntity<Ticket> myTicketCreado(
    @RequestParam(value = "idUsuario", defaultValue = "") Integer idUsuario
      ) throws Exception;
}
