
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
    
                
    @ManyToOne()
    private Ticket ticket;

    public TicketDetalle() {
        //Default Constructor
    }

    public TicketDetalle(String asunto, Date fechaActualizar, Ticket ticket) {
        this.asunto = asunto;
        this.fechaActualizar = fechaActualizar;
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    
   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Date getFechaActualizar() {
        return fechaActualizar;
    }

    public void setFechaActualizar(Date fechaActualizar) {
        this.fechaActualizar = fechaActualizar;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.asunto);
        hash = 53 * hash + Objects.hashCode(this.fechaActualizar);
        hash = 53 * hash + Objects.hashCode(this.ticket);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TicketDetalle other = (TicketDetalle) obj;
        if (!Objects.equals(this.asunto, other.asunto)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fechaActualizar, other.fechaActualizar)) {
            return false;
        }
        if (!Objects.equals(this.ticket, other.ticket)) {
            return false;
        }
        return true;
    }
    

    public static TicketDetalle create(String asunto, Date fechaActualizar, Ticket ticket){
        
        if(null == asunto){
            return null;
        }
        
        return new TicketDetalle(asunto,fechaActualizar, ticket);
    }
        
}
