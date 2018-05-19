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

    private static final long serialVersionUID = -1903979388821696834L;
        
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nombreArea;

    @ManyToOne
    private Departamento departamento;

    public AreaTrabajo(Integer id, String nombreArea, Departamento departamento) {
        this.id = id;
        this.nombreArea = nombreArea;
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
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
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
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.nombreArea);
        hash = 23 * hash + Objects.hashCode(this.departamento);
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
        if (!Objects.equals(this.nombreArea, other.nombreArea)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.departamento, other.departamento)) {
            return false;
        }
        return true;
    }

   

    @Override
    public String toString() {
        return "AreaTrabajo{" + "id=" + id + ", nombreArea=" + nombreArea + ", departamento=" + departamento + '}';
    }
    
}
