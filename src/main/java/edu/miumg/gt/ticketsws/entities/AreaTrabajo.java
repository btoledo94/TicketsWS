package edu.miumg.gt.ticketsws.entities;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity()
@Table(name = "AreaTrabajo", schema = "TICKETS")
public class AreaTrabajo implements java.io.Serializable{
    @Id()
    @Column(name = "ID_Areatrabajo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "NameArea")
    private String NombreArea;

    @ManyToOne
    @JoinColumn(name="departamento_id")
    private Departamento departamento;

    public AreaTrabajo(Integer id, String NombreArea, Departamento departamento) {
        this.id = id;
        this.NombreArea = NombreArea;
        this.departamento = departamento;
    }

    
    public AreaTrabajo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreArea() {
        return NombreArea;
    }

    public void setNombreArea(String NombreArea) {
        this.NombreArea = NombreArea;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.NombreArea);
        hash = 97 * hash + Objects.hashCode(this.departamento);
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
        final AreaTrabajo other = (AreaTrabajo) obj;
        if (!Objects.equals(this.NombreArea, other.NombreArea)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.departamento, other.departamento);
    }

    @Override
    public String toString() {
        return "AreaTrabajo{" + "id=" + id + ", NombreArea=" + NombreArea + ", departamento=" + departamento + '}';
    }
    
}
