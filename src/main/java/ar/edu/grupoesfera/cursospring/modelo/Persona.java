package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

   @Column
   private String nombrePersona;
   
   @Column
   private String apellidoPersona;
   
   @Column
   private Integer edadPersona;
   
   //Constructor default
   public Persona(){}

   //Getters y Setters
   public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getApellidoPersona() {
		return apellidoPersona;
	}

	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apellidoPersona;
	}

	public Integer getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(Integer edadPersona) {
		this.edadPersona = edadPersona;
	}

	//HashCode / Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidoPersona == null) ? 0 : apellidoPersona.hashCode());
		result = prime * result + ((edadPersona == null) ? 0 : edadPersona.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombrePersona == null) ? 0 : nombrePersona.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellidoPersona == null) {
			if (other.apellidoPersona != null)
				return false;
		} else if (!apellidoPersona.equals(other.apellidoPersona))
			return false;
		if (edadPersona == null) {
			if (other.edadPersona != null)
				return false;
		} else if (!edadPersona.equals(other.edadPersona))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombrePersona == null) {
			if (other.nombrePersona != null)
				return false;
		} else if (!nombrePersona.equals(other.nombrePersona))
			return false;
		return true;
	}
     
}
