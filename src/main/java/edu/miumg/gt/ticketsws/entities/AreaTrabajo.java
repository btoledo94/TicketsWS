package edu.miumg.gt.ticketsws.entities;

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
    @Id
    @Column(name = "ID_Areatrabajo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "NameArea", length = 50)
    private String NombreArea;

    @ManyToOne
    @JoinColumn(name="departamento_id", nullable=false)
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
    
}
