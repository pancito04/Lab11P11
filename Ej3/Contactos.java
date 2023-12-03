
package Ej3;

public class Contactos {
    private Diccionario<String, String> contactos;

    public Contactos() {
        this.contactos = new Diccionario<>();
    }

    public void agregarContacto(String dni, String datosPersona) {
        contactos.add(dni, datosPersona);
        System.out.println("Contacto agregado exitosamente.");
    }

    public void eliminarContacto(String dni) {
        boolean eliminado = contactos.delete(dni);
        if (eliminado) {
            System.out.println("Contacto eliminado exitosamente.");
        } else {
            System.out.println("No se encontró ningún contacto con el DNI proporcionado.");
        }
    }

    public void mostrarContactos() {
        System.out.println("Lista de Contactos:");
        System.out.println(contactos);
    }

    public void verDatosContacto(String dni) {
        try {
            String datos = contactos.getValue(dni);
            System.out.println("Datos del contacto con DNI " + dni + ": " + datos);
        } catch (Exception e) {
            System.out.println("Error al obtener los datos del contacto: " + e.getMessage());
        }
    }
}