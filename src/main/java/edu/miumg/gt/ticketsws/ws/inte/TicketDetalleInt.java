
package edu.miumg.gt.ticketsws.ws.inte;

import edu.miumg.gt.ticketsws.entities.TicketDetalle;
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
@RequestMapping(value = "/api/TicketDetalle",produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public interface TicketDetalleInt {
    
    @Transactional()
    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public ResponseEntity<TicketDetalle> create(
            @RequestParam(value = "asunto", defaultValue = "") String asunto,
            @RequestParam(value = "ticketId", defaultValue = "") Integer ticketId,
            @RequestParam(value = "nombreAsignado", defaultValue = "") String nombreAsignado,
            @RequestParam(value = "nombreDeptoArea", defaultValue = "") String nombreDeptoArea
    ) throws Exception;
    
    @Transactional(readOnly = true)
    @RequestMapping(value ="/getactualizar", method = RequestMethod.GET)
    public ResponseEntity<TicketDetalle> ActualizarDetalle(
            @RequestParam(value = "ticketId", defaultValue = "") Integer ticketId
    ) throws Exception;
    
    
    
}
