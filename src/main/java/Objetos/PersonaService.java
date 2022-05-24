package Objetos;

public interface PersonaService {

    String getNombre();
    String getEdad();
    String getCiudad();
    int getId();
    void setNombre(String nombre);
    void setCiudad(String ciudad);
    void setEdad(String edad);
    void setId(int id);
    void set(String key, String value);
    void createPersona(Persona persona);
    public String toString();


}