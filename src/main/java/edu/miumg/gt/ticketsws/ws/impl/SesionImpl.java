/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.impl;

import edu.miumg.gt.ticketsws.entities.Sesion;
import edu.miumg.gt.ticketsws.entities.Usuario;
import edu.miumg.gt.ticketsws.ws.inte.SesionInt;
import edu.miumg.gt.ticketsws.ws.repo.SesionRepo;
import edu.miumg.gt.ticketsws.ws.repo.UsuarioRepo;
import edu.miumg.gt.ticketsws.ws.security.Md5Encrypt;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class SesionImpl implements SesionInt{
    @Autowired()
    private UsuarioRepo usuarioRepo;
    
    @Autowired()
    private SesionRepo sesionRepo;
    
    @Override
    public ResponseEntity<Sesion> login(String correo, String password) throws Exception {
        
        Usuario usuarioEntity = usuarioRepo.findByCorreo(correo);
        
        if(usuarioEntity == null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        
       if(!usuarioEntity.getPassword().equals(Md5Encrypt.get_md5(password))){
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }
        
        Sesion sesion = new Sesion();
        sesion.setFechaInicio(new Date());
        sesion.setUsuario(usuarioEntity);
        sesion.setToken(Md5Encrypt.get_md5(usuarioEntity.getId().toString() + new Date().getTime()));
        
        return new ResponseEntity(sesionRepo.save(sesion), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Sesion> logout(String token) throws Exception {
        
        Sesion sesion = sesionRepo.findByToken(token);
        sesion.setFechaFin(new Date()); 
              return new ResponseEntity(sesionRepo.save(sesion), HttpStatus.OK);
    }
    
    
}
