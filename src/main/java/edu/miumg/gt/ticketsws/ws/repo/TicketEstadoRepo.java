
package edu.miumg.gt.ticketsws.ws.repo;

import edu.miumg.gt.ticketsws.entities.TicketEstado;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BYRON TOLEDO
 */
@Repository()
public interface TicketEstadoRepo extends PagingAndSortingRepository<TicketEstado,Integer>{
    
    TicketEstado findByEstado(String estado);
    
}
