public class Herencia {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.nombre = "Andres";
        System.out.println(cliente.nombre);
        cliente.edad = 38;
        System.out.println(cliente.edad);
        cliente.telefono = "3175136145";
        System.out.println(cliente.telefono);
        cliente.credito = 23;
        System.out.println(cliente.credito);



        }
        
    }

class Persona {
     String nombre;
     int edad;
     String telefono;   

    
    }


class Cliente extends Persona {
    int credito;
}
