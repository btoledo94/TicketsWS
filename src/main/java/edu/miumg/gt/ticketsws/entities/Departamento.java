package edu.miumg.gt.ticketsws.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "DEPARTAMENTO", schema = "TICKETS")
public class Departamento implements java.io.Serializable{
    @Id
    @Column(name = "ID_Departamento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "NameDepartamento", length = 50)
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
      
}
