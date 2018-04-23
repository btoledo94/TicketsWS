package edu.miumg.gt.ticketsws.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author BYRON TOLEDO
 */
@Entity()
@Table(name = "USUARIO", schema = "TICKETS")
public class Usuario implements java.io.Serializable {
 
@Id()
@Column(name = "ID_Usuario")
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "Correo")
    private String correo;
    
   @Column(name = "UsuarioNombre")
    private String nombreUsuario;
   
   @Column(name = "Password")
    private String password;
    
   @ManyToOne
    @JoinColumn(name="AreaTrabajo_id")
    private AreaTrabajo areaTrabajo;

    public Usuario(Integer id, String correo, String nombreUsuario, String password, AreaTrabajo areaTrabajo) {
        this.id = id;
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.areaTrabajo = areaTrabajo;
    }
      
    public Usuario() {
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

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public AreaTrabajo getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(AreaTrabajo areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
        
}
