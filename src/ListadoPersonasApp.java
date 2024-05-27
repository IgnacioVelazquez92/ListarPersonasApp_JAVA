import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        List<Persona> personas = new ArrayList<Persona>();
     //Definimos el menú

        var salir = false;

        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(consola, personas);
            }
            catch (Exception e) {
                System.out.println("Ocurrio un error : "+ e.getMessage());
            }

            System.out.println();
        }

    }

    private static void mostrarMenu() {
        System.out.println("""
                ....::: Listado de Personas :::....
                1. Agregar Persona
                2. Listar Persona
                3. Eliminar Persona
                4. Salir
                """);

        System.out.print("digite la opcion que desea: ");
    }

    public static Boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {

        int opcion = Integer.parseInt(consola.nextLine());
        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Ingrese el telefono ");
                var telefono = consola.nextLine();
                System.out.print("Ingrese el email: ");
                var email = consola.nextLine();

                //crear el objeto de tipo persona
                 var persona = new Persona(nombre, telefono, email);

                 //agregamos el objeto a la lista de personas
                personas.add(persona);

                System.out.println("la lista tiene  = " + personas.size()  + " personas");

                return false;
            }
            case 2 -> {// Listamos las personas
                System.out.println("Listados de personas : ");
                // usamos lamda y metodo de referencia

                //lamda
                //personas.forEach(persona -> System.out.println(persona));

                //referencia
                personas.forEach(System.out::println);
                return false;
            }
            case 3 -> {
                System.out.println( "a quien eliminaremos ?");
                var eliminado= Integer.parseInt(consola.nextLine()) - 1;

                personas.remove(eliminado);
                return false;
            }
            case 4 -> { // salimos del ciclo
                System.out.println("Hasta prontooo.....");
                return true;
            }
            default -> {
                System.out.println("ups, ingreso una opción invalida...");
            }

        }
        return null;
    }


}