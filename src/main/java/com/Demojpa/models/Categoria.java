package com.Demojpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categoria") // nombre de la tabla en BDD
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public void setNombre(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setDescripcion(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setNombre(String string) {
		// TODO Auto-generated method stub
		
	}
}