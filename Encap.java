public class Encap {
    public static void main(String[] args) throws Exception {
        Persona andres = new Persona ();
        andres.setNombre("Andres");
        System.out.println (andres.getNombre());

        Persona age = new Persona ();
        andres.setEdad(37);
        System.out.println (andres.getEdad());

        Persona number = new Persona ();
        andres.setTelefono("3175136145");
        System.out.println (andres.getTelefono());


        }
        
    }

class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre () {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad () {
        return this.edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono () {
        return this.telefono;
    }
}
