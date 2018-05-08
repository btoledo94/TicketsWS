package edu.miumg.gt.ticketsws.entities;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class Ticket implements java.io.Serializable{

    private static final long serialVersionUID = -8506294932409247595L;
    
    @Id()
    @Column(name = "ID_Ticket")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String tituloProblema;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
       
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn()
    private TicketEstado ticketEstado;
   
    @ManyToOne()
    @JoinColumn()
    private Usuario usuario;
    
    @ManyToOne()
    private Usuario usuarioAsignado;
    
    @ManyToOne()
    @JoinColumn()
    private Departamento departamento;
    
    @ManyToOne()
    @JoinColumn()
    private AreaTrabajo areaTrabajo;
    
    private Boolean active;

    public Ticket() {
        //Default Constructor
    }

    public Ticket(String tituloProblema, Date fechaInicio, Date fechaFin, TicketEstado ticketEstado, Usuario usuario, Usuario usuarioAsignado, Departamento departamento, AreaTrabajo areaTrabajo, Boolean active) {
        this.tituloProblema = tituloProblema;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ticketEstado = ticketEstado;
        this.usuario = usuario;
        this.usuarioAsignado = usuarioAsignado;
        this.departamento = departamento;
        this.areaTrabajo = areaTrabajo;
        this.active = active;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public TicketEstado getTicketEstado() {
        return ticketEstado;
    }

    public void setTicketEstado(TicketEstado ticketEstado) {
        this.ticketEstado = ticketEstado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuarioAsignado() {
        return usuarioAsignado;
    }

    public void setUsuarioAsignado(Usuario usuarioAsignado) {
        this.usuarioAsignado = usuarioAsignado;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getTituloProblema() {
        return tituloProblema;
    }

    public void setTituloProblema(String tituloProblema) {
        this.tituloProblema = tituloProblema;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.tituloProblema);
        hash = 67 * hash + Objects.hashCode(this.fechaInicio);
        hash = 67 * hash + Objects.hashCode(this.fechaFin);
        hash = 67 * hash + Objects.hashCode(this.ticketEstado);
        hash = 67 * hash + Objects.hashCode(this.usuario);
        hash = 67 * hash + Objects.hashCode(this.usuarioAsignado);
        hash = 67 * hash + Objects.hashCode(this.departamento);
        hash = 67 * hash + Objects.hashCode(this.areaTrabajo);
        hash = 67 * hash + Objects.hashCode(this.active);
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
        final Ticket other = (Ticket) obj;
        if (!Objects.equals(this.tituloProblema, other.tituloProblema)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fechaInicio, other.fechaInicio)) {
            return false;
        }
        if (!Objects.equals(this.fechaFin, other.fechaFin)) {
            return false;
        }
        if (!Objects.equals(this.ticketEstado, other.ticketEstado)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.usuarioAsignado, other.usuarioAsignado)) {
            return false;
        }
        if (!Objects.equals(this.departamento, other.departamento)) {
            return false;
        }
        if (!Objects.equals(this.areaTrabajo, other.areaTrabajo)) {
            return false;
        }
        if (!Objects.equals(this.active, other.active)) {
            return false;
        }
        return true;
    }
    
       
    public static Ticket create(String tituloProblema,Date fechaInicio, Date fechaFin, TicketEstado ticketEstado, Usuario usuario, Usuario usuarioAsignado, Departamento departamento, AreaTrabajo areaTrabajo, Boolean active){
        
        if(null == usuario || null == departamento){
            return null;
        }
        
        return new Ticket(tituloProblema,fechaInicio, fechaFin, ticketEstado, usuario, usuarioAsignado, departamento,areaTrabajo, active);
    }

}