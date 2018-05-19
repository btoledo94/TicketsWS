package edu.miumg.gt.ticketsws.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


/**
 *
 * @author BYRON TOLEDO
 */

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity()
@Table(name = "Sesion", schema = "TICKETS")
public class Sesion implements java.io.Serializable{

    private static final long serialVersionUID = 7182262673923878295L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String token;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
       
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;

    @ManyToOne()
    @JoinColumn()
    private Usuario usuario;
       
}
