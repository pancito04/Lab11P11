package Ej3;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        Contactos agenda = new Contactos();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Eliminar Contacto");
            System.out.println("3. Mostrar Contactos");
            System.out.println("4. Ver Datos de Contacto");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el DNI del contacto: ");
                    String dniAgregar = scanner.next();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese los datos de la persona: ");
                    String datosAgregar = scanner.nextLine();
                    agenda.agregarContacto(dniAgregar, datosAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese el DNI del contacto a eliminar: ");
                    String dniEliminar = scanner.next();
                    agenda.eliminarContacto(dniEliminar);
                    break;
                case 3:
                    agenda.mostrarContactos();
                    break;
                case 4:
                    System.out.print("Ingrese el DNI del contacto para ver sus datos: ");
                    String dniVerDatos = scanner.next();
                    agenda.verDatosContacto(dniVerDatos);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }
}
