
package edu.miumg.gt.ticketsws.ws.repo;

import edu.miumg.gt.ticketsws.entities.Ticket;
import edu.miumg.gt.ticketsws.entities.TicketDetalle;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BYRON TOLEDO
 */
@Repository()
public interface TicketDetalleRepo extends JpaRepository<TicketDetalle,Integer>{
  
    @Query("from TicketDetalle as c where c.ticket.id = :Id1")
   List<TicketDetalle> findByTicketId(@Param("Id1") Integer Id1);
    
}
