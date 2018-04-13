/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.repo;

import edu.miumg.gt.ticketsws.entities.AreaTrabajo;
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
public interface AreaTrabajoRepo extends JpaRepository<AreaTrabajo , Integer> {
    @Query("from AreaTrabajo as c where c.departamento.id = :departamentoId")
    List<AreaTrabajo> findByDepartamentoId(@Param("departamentoId") Integer departamentoId);
}
