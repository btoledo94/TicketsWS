/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.impl;

import edu.miumg.gt.ticketsws.entities.AreaTrabajo;
import edu.miumg.gt.ticketsws.ws.inte.AreaTrabajoInt;
import edu.miumg.gt.ticketsws.ws.repo.AreaTrabajoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class AreaTrabajoImpl implements AreaTrabajoInt{
    @Autowired
    private AreaTrabajoRepo areaTrabajoRepo;
    
    @Override
    public ResponseEntity<AreaTrabajo> findAll(Integer departamentoId) throws Exception {
      return new ResponseEntity(areaTrabajoRepo.findByDepartamentoId(departamentoId), HttpStatus.OK);  
    }
}
