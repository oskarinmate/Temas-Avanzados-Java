import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        // ArrayList permite elementos duplicados y tiene un orden
        List<String>miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Esto es un String");


        for(String elemento : miLista ){
            System.out.println("Dia de la semana: " + elemento);
        }

        // Funciones Lambda funcion anonima de un codigo muy compacto
        miLista.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });
    }
}
