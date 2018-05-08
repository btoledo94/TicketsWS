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
    
   // @Query("from ticket as c where c.usuario.areaTrabajo.departamento.id= :Id1 And c.active= :Id2")
   // List<Ticket> findByDepartamentoAndActive(@Param("Id1")Integer Id1, @Param("Id2") Integer Id2);
}
