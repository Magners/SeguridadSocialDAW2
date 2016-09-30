/**
 * Created by usu26 on 23/09/2016.
 */
import java.util.HashMap;
import java.util.Map;


public class SeguridadSocialHashMap {
    private Map<String,Persona> personaMapDni = new HashMap<>();
    private Map<String,Persona> personaMapSS = new HashMap<>();
    private Map<Double,Persona> personaMapSalario = new HashMap<>();
    private Map<Integer,Persona> personaMapEdad = new HashMap<>();

    public void altaPersona(Persona persona){

        if(!personaMapDni.containsKey((persona.getDNI())) && !personaMapSS.containsKey((persona.getSS()))){
            personaMapDni.put(persona.getDNI(),persona);
            personaMapSS.put(persona.getSS(),persona);
            personaMapSalario.put(persona.getSalario(),persona);
            personaMapEdad.put(persona.getEdad(),persona);
        }

        // voy a vincular esta clave con el valor. Entonces a partir de la clave me encontrara el valor (se crea una relacion interna -> puntero

    }
    public void bajaPersona(String DNI){

        personaMapDni.remove(DNI);
    }
    public Persona obtenerPersonaPorDNI(String dni){

        return personaMapDni.get(dni);
    }


}

//obtener todas las llaves:
// personaMapDni.keySet();
// personaMapDni.values();
//personaMapDni.remove(dni);
//return personaMapDni.get(dni);
