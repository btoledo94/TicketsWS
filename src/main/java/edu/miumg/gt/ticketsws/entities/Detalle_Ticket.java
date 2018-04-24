
package edu.miumg.gt.ticketsws.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity()
@Table(name = "Detalle_Ticket", schema = "TICKETS")
public class Detalle_Ticket implements java.io.Serializable{
    
    @Id()
    @Column(name = "ID_DetalleTicket")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "Asunto")
    private String asunto;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizar;
    
                
    @JoinColumn()
    @Column(name = "usuario_Asignado")
    private Usuario usuario;

    public Detalle_Ticket() {
    }

    public Detalle_Ticket(String asunto, Date fechaActualizar, Usuario usuario) {
        this.asunto = asunto;
        this.fechaActualizar = fechaActualizar;
        this.usuario = usuario;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        
}
