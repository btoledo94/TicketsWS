
package edu.miumg.gt.ticketsws.entities;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Data
@Entity()
@Table(schema = "TICKETS")
public class TicketDetalle implements java.io.Serializable{

    private static final long serialVersionUID = -2206214849087814743L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String asunto;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizar;
    
    private byte[] archivo;    
                
    @ManyToOne()
    private Ticket ticket;

    public TicketDetalle() {
        //Default Constructor
    }

    public TicketDetalle(String asunto, Date fechaActualizar, byte[] archivo, Ticket ticket) {
        this.asunto = asunto;
        this.fechaActualizar = fechaActualizar;
        this.archivo = archivo;
        this.ticket = ticket;
    }
   
    public static TicketDetalle create(String asunto, Date fechaActualizar, byte[] archivo,Ticket ticket){
        
        if(null == asunto){
            return null;
        }
        
        return new TicketDetalle(asunto,fechaActualizar,archivo,ticket);
    }
        
}
