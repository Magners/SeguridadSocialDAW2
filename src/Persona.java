/**
 * Created by usu26 on 19/09/2016.
 */
public class Persona {

    private String DNI;
    private String SS;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private double Salario;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSS() {
        return SS;
    }

    public void setSS(String SS) {
        this.SS = SS;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public Persona(String DNI, String SS, String nombre, String apellido, int edad, double salario) {
        this.DNI = DNI;
        this.SS = SS;
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
        Salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", SS='" + SS + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Edad=" + Edad +
                ", Salario=" + Salario +
                '}';
    }
}




