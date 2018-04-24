package edu.miumg.gt.ticketsws.ws.repo;

import edu.miumg.gt.ticketsws.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BYRON TOLEDO
 */
@Repository()
public interface TicketRepo extends JpaRepository<Ticket,Integer>{
    
}
