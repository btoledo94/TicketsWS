package edu.miumg.gt.ticketsws.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private String correo;
    @Column(name = "PrimerNombre", length = 50)
    private String NombreFirst;
    @Column(name = "SegundoNombre", length = 50)
    private String NombreSecond;
    @Column(name = "PrimerApellido", length = 50)
    private String ApellidoFirst;
    @Column(name = "SegundoApellido", length = 50)
    private String ApellidoSecond;
    @Column(name = "Password", length = 50)
    private String Password;

    public Usuario(Integer id, String correo, String NombreFirst, String NombreSecond, String ApellidoFirst, String ApellidoSecond, String Password) {
        this.id = id;
        this.correo = correo;
        this.NombreFirst = NombreFirst;
        this.NombreSecond = NombreSecond;
        this.ApellidoFirst = ApellidoFirst;
        this.ApellidoSecond = ApellidoSecond;
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
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreFirst() {
        return NombreFirst;
    }

    public void setNombreFirst(String NombreFirst) {
        this.NombreFirst = NombreFirst;
    }

    public String getNombreSecond() {
        return NombreSecond;
    }

    public void setNombreSecond(String NombreSecond) {
        this.NombreSecond = NombreSecond;
    }

    public String getApellidoFirst() {
        return ApellidoFirst;
    }

    public void setApellidoFirst(String ApellidoFirst) {
        this.ApellidoFirst = ApellidoFirst;
    }

    public String getApellidoSecond() {
        return ApellidoSecond;
    }

    public void setApellidoSecond(String ApellidoSecond) {
        this.ApellidoSecond = ApellidoSecond;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    
    
}
