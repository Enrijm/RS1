package Controladores;

// Consultar por id y por nombre. Petición GET http://URL/persona/{id} y http://URL/persona/nombre/{nombre}1

import Objetos.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@RestController
@RequestMapping("/persona")
public class GET {


    @Autowired
    //@Qualifier("personas")
    ArrayList<PersonaService> personas;


    @GetMapping("{id}")
    public String getPersonaId(@PathVariable int id){
        for(PersonaService p : personas){
            if(p.getId() == id){
                return p.toString();
            }
        }
        return "No encontrado";
    }

    @GetMapping("/{nombre}")
    public String getPersonaNombre(@PathVariable String nombre){
        String resultado = "";
        boolean alguien = false;
        for(PersonaService p : personas){
            if(p.getNombre().equals(nombre)){
                resultado+= p.toString() + " ";
                alguien = true;
            }
        }
        if(alguien){
            return resultado;
        }else{
            return "No encontrado";
        }
    }

    @PostConstruct
    public void doLog() {
        System.out.println("Hola desde la clase inicial");
    }

    // otra forma de hacerlo pero con stream y declarando el array dentro de la implementacion del servicio y aqui hacemos inyecion AUTOWIRED de una UNICA PersonaService
    /*
    @Autowired
    IPersonaService servicio;

    @GetMapping("/nombre/{nombre}")
    public Persona getPersonaByNombre(@PathVariable("nombre") String nombre) {
        return servicio.findPersona(nombre);
    }

    @GetMapping("/{id}")
    public Persona getPersonaById(@PathVariable("id") Long id) {
        return servicio.findPersona(id);
    }*/
}

