package Objetos;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("PersonaServiceImp")
public class PersonaServiceImp implements PersonaService{

    Persona persona = new Persona();

    public void createPersona(Persona persona){
        this.persona.setNombre(persona.getNombre());
        this.persona.setEdad(persona.getEdad());
        this.persona.setCiudad(persona.getCiudad());
    }

    public String getNombre(){
        return persona.getNombre();
    }

    public void setNombre(String nombre){
        persona.setNombre(nombre);
    }

    public void set(String key, String value){
        if(key.equals("nombre")){
            persona.setNombre(value);
        }else if(key.equals("ciudad")){
            persona.setCiudad(value);
        }else if(key.equals("edad")){
            persona.setEdad(value);
        }
    }

    public void setEdad(String edad){
        persona.setEdad(edad);
    }

    public String getEdad(){
        return persona.getEdad();
    }

    public void setCiudad(String ciudad){
        persona.setCiudad(ciudad);
    }

    public String getCiudad(){
        return persona.getCiudad();
    }

    public int getId(){
        return persona.getId();
    }

    public void setId(int id){
        persona.setId(id);
    }

    @Override
    public String toString() {
        return "PersonaServiceImp{" +
                "persona=" + persona +
                '}';
    }
}