package controllers;

public class BusquedaBinaria {

    public void sortBubbleMejorado(int[] numeros) {
        boolean intercambiado;

        for (int i = 0; i < numeros.length - 1; i++) {
            intercambiado = false;

            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    intercambiado = true;
                }
            }

            if (!intercambiado) 
            break;
        }
    }

    public Integer busquedaBinaria(int[] numeros, int valor) {
        int izquierda = 0;
        int derecha = numeros.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (numeros[medio] == valor) {
                return medio;
            }

            if (numeros[medio] < valor) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1;
    }
}
