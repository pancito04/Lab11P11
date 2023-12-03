package Ej2;

public class Main {
    public static void main(String[] args) {
        Diccionario<String, Integer> dictionary = new Diccionario<>();

        // Agregar pares al diccionario
        dictionary.add("Uno", 1);
        dictionary.add("Dos", 2);
        dictionary.add("Tres", 3);

        // Imprimir el diccionario
        System.out.println(dictionary.toString());

        // Eliminar un par del diccionario
        if (dictionary.delete("Dos")) {
            System.out.println("Se eliminó el par con clave 'Dos'.");
        } else {
            System.out.println("No se encontró el par con clave 'Dos'.");
        }

        // Obtener el valor de un par
        try {
            int value = dictionary.getValue("Tres");
            System.out.println("El valor del par con clave 'Tres' es: " + value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Imprimir el diccionario después de las operaciones
        System.out.println(dictionary.toString());
    }
}
