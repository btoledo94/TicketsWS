package edu.miumg.gt.ticketsws.entities;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "DEPARTAMENTO", schema = "TICKETS")
public class Departamento implements java.io.Serializable{

    private static final long serialVersionUID = -4602876523555551831L;
    
    @Id()
    @Column(name = "ID_Departamento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "NameDepartamento")
    private String NombreDepartamento;

    public Departamento(Integer id, String NombreDepartamento) {
        this.id = id;
        this.NombreDepartamento = NombreDepartamento;
    }

    public Departamento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreDepartamento() {
        return NombreDepartamento;
    }

    public void setNombreDepartamento(String NombreDepartamento) {
        this.NombreDepartamento = NombreDepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.NombreDepartamento);
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
        final Departamento other = (Departamento) obj;
        if (!Objects.equals(this.NombreDepartamento, other.NombreDepartamento)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", NombreDepartamento=" + NombreDepartamento + '}';
    }
      
}
