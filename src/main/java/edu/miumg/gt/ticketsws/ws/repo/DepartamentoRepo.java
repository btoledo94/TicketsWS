/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.repo;

import edu.miumg.gt.ticketsws.entities.Departamento;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BYRON TOLEDO
 */
@Repository()
public interface DepartamentoRepo extends JpaRepository<Departamento,Integer>{
      @Override()
    List<Departamento> findAll();
}
