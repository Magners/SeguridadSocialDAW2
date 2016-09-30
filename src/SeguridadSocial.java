/**
 * Created by usu26 on 19/09/2016.
 */
import java.util.ArrayList;
import java.util.List;

public class SeguridadSocial {

    private List<Persona> personasList;
    int i=0;

    public SeguridadSocial() {

        personasList = new ArrayList<>();

    }

// Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social

    public void altaPersona(Persona persona) {

       /* System.out.println("Introduce DNI: ");

        for(i=0;i<personasList.size();i++){
            if(persona.getDni().equals(personasList.get(i).getDni())){
                System.out.println("DNI EN USO");
                    break;
            }
            if(i==personasList.size()){  // fuera es menos uso de memòria
                //whatever
            }
        }
        System.out.println("Introduce nº SS: ");

        for(i=0;i<personasList.size();i++){
            if(persona.getSS().equals(personasList.get(i).getSS())){
                System.out.println("DNI EN USO");
                break;
            }
            if(i==personasList.size()){
                //whatever
            }
        }
        System.out.println("Introduce el nombre");
        System.out.println("Introduce el apellido");
        System.out.println("Introduce la edad: ");
        System.out.println("Introduce el salario: ");*/
       boolean repetida = false;

        for(Persona personaActual : personasList){
            if(personaActual.getDNI().equals(persona.getDNI())|| personaActual.getSS().equals(persona.getSS())){
                repetida = true;
                break;
            }
        }
        if(!repetida){
            personasList.add(persona);
        }

    } // boolean repe = personasList.stream().anyMatch(p -> p.getDni().equals(persona.getDni())|| p.getSS().equals(p.getSS());

    public void bajaPersona(String DNI) {
        Persona aux = null;

        for(Persona personaActual : personasList){
            if(personaActual.getDNI().equals(DNI)){         // JAVA 8 THE GOD
                aux = personaActual;                        // personasList.removeIf(persona -> persona.getDni().equals(DNI));
                break;
            }
        }
        if(aux!=null){
            personasList.remove(aux);
        }


        System.out.println("Introduce el DNI de la persona que deseas dar de baja:");

    }

   public Persona obtenerPersonaPorDNI(String DNI) {
       for(Persona personaActual : personasList){
           if(personaActual.getDNI().equals(DNI)){
               return personaActual;
           }
       }
       return null;

    }

    public Persona obtenerPersonaPorNumSS(String SS) {
        for(Persona personaActual : personasList){
            if(personaActual.getSS().equals(SS)){
                return personaActual;
            }
        }
        return null;

    }


    public List<Persona> obtenerPersonasRangoSalarial(double min, double max) {
        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual : personasList) {
            if (personaActual.getSalario()>=min && personaActual.getSalario()<=max) {
                aux.add(personaActual);
            }
        }
        return aux;

    }

    public List<Persona> obtenerPersonasMayoresQue(int edad) {
        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual : personasList) {
            if (personaActual.getEdad()>edad) {
                aux.add(personaActual);
            }
        }
        return aux;

    }

    public List<Persona> obtenerTodas() {

        return personasList;
    }

    public SeguridadSocial(List<Persona> personasList) {

        this.personasList = personasList;
    }

    public List<Persona> getPersonasList() {

        return personasList;
    }

    public void setPersonasList(List<Persona> personasList) {

        this.personasList = personasList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeguridadSocial that = (SeguridadSocial) o;

        return personasList != null ? personasList.equals(that.personasList) : that.personasList == null;

    }

    @Override
    public int hashCode() {
        return personasList != null ? personasList.hashCode() : 0;
    }
}