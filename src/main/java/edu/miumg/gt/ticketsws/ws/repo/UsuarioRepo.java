/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.repo;

import edu.miumg.gt.ticketsws.entities.Usuario;
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
public interface UsuarioRepo extends JpaRepository<Usuario,Integer>{
    
    Usuario findByCorreo(String correo);
    
     @Override()
    List<Usuario> findAll();
    
    @Query("from Usuario as c where c.areaTrabajo.id = :idArea")
    List<Usuario> findByAreatrabajoId(@Param("idArea") Integer idArea);
       
}
