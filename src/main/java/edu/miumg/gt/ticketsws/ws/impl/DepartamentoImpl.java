/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.impl;

import edu.miumg.gt.ticketsws.entities.Departamento;
import edu.miumg.gt.ticketsws.ws.inte.DepartamentoInt;
import edu.miumg.gt.ticketsws.ws.repo.DepartamentoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class DepartamentoImpl implements DepartamentoInt {
    @Autowired()
    private DepartamentoRepo departamentoRepo;
    
    @Override
    public ResponseEntity<Departamento> findAll() throws Exception {
        return new ResponseEntity(departamentoRepo.findAll(), HttpStatus.OK);
    }
            
}
