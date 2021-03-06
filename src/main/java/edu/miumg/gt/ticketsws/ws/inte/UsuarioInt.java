/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.inte;

import edu.miumg.gt.ticketsws.entities.AreaTrabajo;
import edu.miumg.gt.ticketsws.entities.Usuario;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BYRON TOLEDO
 */
@RestController()
@RequestMapping(value = "/api/Usuario",produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public interface UsuarioInt {
    
    @Transactional(readOnly = true)
    @RequestMapping(value={"","/"},method=RequestMethod.GET)
    public ResponseEntity<Usuario> findAll() throws Exception;
    
    @Transactional()
    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public ResponseEntity<Usuario> create(
    // @RequestParam(value = "correo", defaultValue = "") String correo
            @RequestBody Usuario usuario            
    ) throws Exception;
    
    @Transactional(readOnly = true)
    @RequestMapping(value="/getfindByUsuario",method=RequestMethod.GET)
    public ResponseEntity<Usuario> doGetFindAll(
            @RequestParam(value = "correo" , defaultValue = "0") String correo
    ) throws Exception;
    
    
    @Transactional(readOnly = true)
    @RequestMapping(value="/getfindByUsuario2",method=RequestMethod.GET)
    public ResponseEntity<Usuario> mostrarUsuarioArea(
            @RequestParam(value = "idArea" , defaultValue = "") Integer idArea
    ) throws Exception;
    
  //  @Transactional()
   // @RequestMapping(value={"","/login"},method = RequestMethod.GET)
    //public ResponseEntity<Usuario> Login(
      //      @RequestParam(value = "correo", defaultValue = "") String correo,
        //    @RequestParam(value = "password", defaultValue = "") String password
  //  ) throws Exception;
    
}
