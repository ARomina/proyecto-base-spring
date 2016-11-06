package ar.edu.grupoesfera.cursospring.modelo;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonaTest extends SpringTest{
	
	@Test
	@Transactional
	@Rollback(true)
	
	public void TestPersona1(){
		
		Persona persona1 = new Persona();
		persona1.setNombrePersona("Pepe");
		persona1.setApellidoPersona("López");
		persona1.setEdadPersona(18);
		
		//lo guarda en la tabla persona1
		getSession().save(persona1);

		assertThat(getSession().get(Persona.class, persona1.getId())).isNotNull();
		
		System.out.println("Persona 1 \nId: " + getSession().get(Persona.class, persona1.getId()).getId()
				            + " \nNombre: " + getSession().get(Persona.class, persona1.getId()).getNombrePersona()
				            + " \nApellido: " + getSession().get(Persona.class, persona1.getId()).getApellidoPersona()
				            + " \nEdad: " + getSession().get(Persona.class, persona1.getId()).getEdadPersona()); 
		
		//Pongo lo de persona con id 1 en persona2
		Persona persona2 = getSession().get(Persona.class, 1L);
		persona2.setNombrePersona("Pepa");
		System.out.println("Persona 2 \nId: " + getSession().get(Persona.class, persona2.getId()).getId()
	            + " \nNombre: " + getSession().get(Persona.class, persona2.getId()).getNombrePersona()
	            + " \nApellido: " + getSession().get(Persona.class, persona2.getId()).getApellidoPersona()
	            + " \nEdad: " + getSession().get(Persona.class, persona2.getId()).getEdadPersona()); 
		getSession().save(persona2);
		
		
	}

}
