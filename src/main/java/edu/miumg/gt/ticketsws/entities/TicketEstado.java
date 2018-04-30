package edu.miumg.gt.ticketsws.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "Estado_Ticket", schema = "TICKETS")
public class TicketEstado implements java.io.Serializable{

    private static final long serialVersionUID = 8988747743018908883L;
    
    @Id()
    @Column(name = "ID_EstadoTicket")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String estado;

    public TicketEstado() {
    }

    public TicketEstado(String estado) {
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }       
}
