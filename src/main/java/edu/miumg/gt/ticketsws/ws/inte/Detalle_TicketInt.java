
package edu.miumg.gt.ticketsws.ws.inte;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author BYRON TOLEDO
 */
@RestController()
@RequestMapping(value = "/api/TicketDetalle",produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public interface Detalle_TicketInt {
    
}
