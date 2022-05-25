package com.example.demo;

import Objetos.PersonaService;
import Objetos.PersonaServiceImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class Rs1Application {

	public static void main(String[] args) {
		SpringApplication.run(Rs1Application.class, args);
	}
	@Bean(name = "PersonaServiceImp")
	void createPersonaService(){
		PersonaService personaService = new PersonaServiceImp();
	}

	@Bean(name = "personas")
	ArrayList<PersonaService> personas(){
		ArrayList<PersonaService> personas = new ArrayList<>();
		PersonaService p = new PersonaServiceImp();
		p.setId(1312);
		p.setNombre("Enriquinho");
		p.setCiudad("Los Jaenes");
		p.setEdad("26");
		personas.add(p);
		return personas;
	}

	@Bean
	CommandLineRunner ejecutame() { return p -> { System.out.println("Estamos arrrancando shuprimo"); };
	}

	@Bean
	public AppStartUp1 schedulerRunner1() {
		return new AppStartUp1();
	}

	@Bean
	public AppStartUp2 schedulerRunner2() {
		return new AppStartUp2();
	}

}
