/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.impl;

import edu.miumg.gt.ticketsws.entities.Departamento;
import edu.miumg.gt.ticketsws.entities.Usuario;
import edu.miumg.gt.ticketsws.ws.inte.UsuarioInt;
import edu.miumg.gt.ticketsws.ws.repo.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class UsuarioImpl implements UsuarioInt{
    @Autowired()
    private UsuarioRepo usuarioRepo;
    @Override
    public ResponseEntity<Usuario> findAll() throws Exception {
        return new ResponseEntity(usuarioRepo.findAll(), HttpStatus.OK);
    }
    
    @Override
    public ResponseEntity<Usuario> create(Usuario usuario) throws Exception {
        Usuario usuar = new Usuario();
        usuar.setCorreo(usuario.getCorreo());
        usuar.setNombreUsuario(usuario.getNombreUsuario());
        usuar.setPassword(usuario.getPassword());
        
        return new ResponseEntity(usuarioRepo.save(usuar), HttpStatus.OK);
    }
    
}
