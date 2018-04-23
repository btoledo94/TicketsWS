/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.impl;

import edu.miumg.gt.ticketsws.entities.AreaTrabajo;
import edu.miumg.gt.ticketsws.ws.inte.AreaTrabajoInt;
import edu.miumg.gt.ticketsws.ws.repo.AreaTrabajoRepo;
import java.util.List;
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
    public ResponseEntity<List<AreaTrabajo>> doGetFindAll(Integer departamentoId) throws Exception {
      return new ResponseEntity<>(areaTrabajoRepo.findByDepartamentoId(departamentoId), HttpStatus.OK);  
    }

    @Override
    public ResponseEntity<AreaTrabajo> doGetById(Integer id) throws Exception {
        
        AreaTrabajo area = areaTrabajoRepo.findOne(id);
        
        if(null == area){
            return new ResponseEntity("Area de Trabajo no Encontrada", HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<>(area, HttpStatus.OK);
        
    }
    
    
}
