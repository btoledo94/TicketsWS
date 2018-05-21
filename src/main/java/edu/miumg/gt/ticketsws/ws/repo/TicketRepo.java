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
    
   @Query("from Ticket as c where c.departamento.id = :Id1 AND c.active = :Id2 And c.usuarioAsignado = null")
   List<Ticket> findByDepartamentoIdAndActive(@Param("Id1") Integer Id1,@Param("Id2") Boolean Id2);
   
   @Query("from Ticket as c where c.usuarioAsignado.id = :Id1 AND c.active = :Id2")
   List<Ticket> findByUsuarioasignadoId(@Param("Id1") Integer Id1,@Param("Id2") Boolean Id2);
   
}
