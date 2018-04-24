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
@Table(name = "TICKET", schema = "TICKETS")
public class Ticket implements java.io.Serializable{
    
    @Id()
    @Column(name = "ID_Ticket")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Correo")
    private String correo;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
       
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    
    @JoinColumn()
    @Column(name = "Estado")
    private Ticket_Estado ticket_Estado;
   
    @JoinColumn()
    @Column(name = "usuario_creado")
    private Usuario usuario;
    
    @JoinColumn()
    @Column(name = "departamento")
    private Departamento departamento;
    
    @JoinColumn()
    @Column(name = "areaTrabajo")
    private AreaTrabajo areaTrabajo;

    public Ticket() {
    }

    public Ticket(String correo, Date fechaInicio, Date fechaFin, Ticket_Estado ticket_Estado, Usuario usuario, Departamento departamento, AreaTrabajo areaTrabajo) {
        this.correo = correo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ticket_Estado = ticket_Estado;
        this.usuario = usuario;
        this.departamento = departamento;
        this.areaTrabajo = areaTrabajo;
    }

    public Ticket_Estado getTicket_Estado() {
        return ticket_Estado;
    }

    public void setTicket_Estado(Ticket_Estado ticket_Estado) {
        this.ticket_Estado = ticket_Estado;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public AreaTrabajo getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(AreaTrabajo areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }    
    
}
