package Controladores;


import Objetos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

// Añadir Persona. Petición POST. Body: { “name”:”Jesús” …. } http://URL/persona
@RestController
@RequestMapping("/persona")
public class POST {


    @Autowired
    //@Qualifier("personas")
    ArrayList<PersonaService> personas;

    @PostMapping()
    Persona aniadirPersona(@RequestBody Persona persona){
        PersonaService p = new PersonaServiceImp();
        p.setId(persona.getId());
        p.setNombre(persona.getNombre());
        p.setCiudad(persona.getCiudad());
        p.setEdad(persona.getEdad());
        personas.add(p);
        return persona;
    }

}

