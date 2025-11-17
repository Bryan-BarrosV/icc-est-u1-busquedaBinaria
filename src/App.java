import controllers.BusquedaBinaria;
import controllers.PersonaController;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        ShowConsole sC = new ShowConsole();
        BusquedaBinaria bB = new BusquedaBinaria();
        PersonaController pC = new PersonaController();
        int[] arr = new int[] {10, 2, 4, 6, 7, 8, 13, 20};

        bB.sortBubbleMejorado(arr);
        Integer result = bB.busquedaBinaria(arr, 10);
        sC.showResult(result, 10);

        Persona[] people = new Persona[] {
                new Persona("Juan", 25),
                new Persona("Ana", 30),
                new Persona("Pedro", 20),
                new Persona("Maria", 28),
                new Persona("Luis", 22),
                new Persona("Carmen", 27),
                new Persona("Sofia", 24),
        };

        pC.sortBubbleM(people);

        Persona buscado = pC.findByName(people, "Juan");

        sC.showPersonResult(buscado, "Juan");
    }
}
