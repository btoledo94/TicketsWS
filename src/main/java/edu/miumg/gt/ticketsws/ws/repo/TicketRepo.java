package edu.miumg.gt.ticketsws.ws.repo;

import edu.miumg.gt.ticketsws.entities.Ticket;
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
public interface TicketRepo extends JpaRepository<Ticket,Integer>{
    
   @Query("from Ticket as c where c.departamento.id = :Id1")
   List<Ticket> findByDepartamentoId(@Param("Id1") Integer Id1);
}
