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
 
@Id
@Column(name = "ID_Usuario")
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "Correo", length = 100)
    private String Correo;
    
   @Column(name = "UsuarioNombre", length = 50)
    private String NombreUsuario;
   
   @Column(name = "Password", length = 50)
    private String Password;
    
  //  @ManyToOne
   // @JoinColumn(name="AreaTrabajo_id", nullable=false)
   // private AreaTrabajo areaTrabajo;

    public Usuario(Integer id, String Correo, String NombreUsuario, String Password) {
        this.id = id;
        this.Correo = Correo;
        this.NombreUsuario = NombreUsuario;
        this.Password = Password;
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
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
            
}
