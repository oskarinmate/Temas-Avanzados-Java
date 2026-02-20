import java.util.HashMap;
import java.util.Map;
public class Mapa {
    public static void main(String[] args) {
        Map<String,String> persona = new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31");
        persona.put("edad", "31"); // no se permiten valores repetidos
        System.out.println("Valores del mapa");
        persona.entrySet().forEach(System.out::println);
        persona.put("edad", "35");// Modificar el valor de la llave existente
        persona.remove("apellido");
        System.out.println("\nNuevos valores del Map");
        persona.entrySet().forEach(System.out::println);


        // Iterar sobre los elementos del map por separado
        System.out.println("\nIterando los elementos (llave, valor)");
        persona.forEach((llave, valor) ->  System.out.println("llave: " + llave + " valor: " + valor) );

    }
}
