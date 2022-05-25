package Controladores;

// Borrar (por id). Petición DELETE. http://URL/persona/{id}

import Objetos.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;

@RestController
@RequestMapping("/persona")
public class DELETE {

    @Autowired
    //@Qualifier("personas")
    ArrayList<PersonaService> personas;

    @DeleteMapping("{id}")
    public String borrarPersona(@PathVariable int id){
        Iterator<PersonaService> it = personas.iterator();
        while(it.hasNext()){
            PersonaService p = it.next();
            if(p.getId()==id){
                it.remove();
                return "Persona con id: " + p.getId() + " borrada";
            }
        }
        return "Persona no encontrada";
    }

    // otra forma de hacerlo pero con stream y declarando el array dentro de la implementacion del servicio y aqui hacemos inyecion AUTOWIRED de una UNICA PersonaService
    /*@Autowired
    IPersonaService servicio;

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        if(servicio.eliminar(id)) return "Persona con id: " + id + " borrada del registro";
        else return "No existe la  persona con id: " + id;
    }*/


}
