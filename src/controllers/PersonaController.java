package controllers;

import models.Persona;

public class PersonaController {
    public void sortBubbleM(Persona[] persona) {
        boolean intercambiado;

        for (int i = 0; i < persona.length - 1; i++) {
            intercambiado = false;

            for (int j = 0; j < persona.length - 1 - i; j++) {
                if (persona[j].getNombre().compareTo(persona[j + 1].getNombre()) > 0) {
                    Persona temp = persona[j];
                    persona[j] = persona[j + 1];
                    persona[j + 1] = temp;
                    intercambiado = true;
                }
            }
            if (!intercambiado)
                break;
        }

    }

    public Persona findByName(Persona[] persona, String nombre) {
        int izquierda = 0;
        int derecha = persona.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            int comparacion = persona[medio].getNombre().compareTo(nombre);

            if (comparacion == 0) {
                return persona[medio];
            }

            if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return null;
    }

}
