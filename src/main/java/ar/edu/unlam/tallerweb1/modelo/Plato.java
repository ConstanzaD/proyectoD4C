package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 

@Entity
@Table(name = "platos")

public class Plato {

	// La anotacion id indica que este atributo es el utilizado como clave primaria de la entity, se indica que el valor es autogenerado.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_plato;
	private String nombre; 
	private String calorias; 
	private String descripcion; 
  

    public Long getId_plato() {
		return id_plato;
	}


	public void setId_plato(Long id_plato) {
		this.id_plato = id_plato;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Plato(){}
    public Plato(String nombre){
		this.nombre = nombre;

	}
 
}
