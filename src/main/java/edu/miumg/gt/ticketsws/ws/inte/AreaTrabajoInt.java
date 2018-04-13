/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.inte;

import edu.miumg.gt.ticketsws.entities.AreaTrabajo;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BYRON TOLEDO
 */
@RestController()
@RequestMapping(value = "/api/Departamento",produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public interface AreaTrabajoInt {
    
    @Transactional(readOnly = true)
    @RequestMapping(value={"","/getfindByDepartamentoId"},method=RequestMethod.GET)
    public ResponseEntity<AreaTrabajo> findAll(
            @RequestParam(value = "departamentoId" , defaultValue = "0") Integer departamentoId
    ) throws Exception;
}
