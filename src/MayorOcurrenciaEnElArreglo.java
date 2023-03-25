import java.util.Random;
//Para la tarea se debe crear un arreglo con 10 elementos
//(enteros en el rango de 1 a 9). Escriba un programa
//que imprima el número que tiene más ocurrencias en el arreglo
//y también imprimir la cantidad de veces que aparece en el arreglo.
//Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
//Como resultado debería imprimir lo siguiente:
//La mayor ocurrencias es: 3
//El elemento que mas se repite es: 5
//En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
public class MayorOcurrenciaEnElArreglo {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++){
            Random numeroAzar = new Random();
            numeros[i] = 1 + numeroAzar.nextInt(9);
            System.out.print("[" + numeros[i] + "]");
        }

        int[] arregloCantidad = new int[10];

        for (int i = 0; i < numeros.length; i++){
            int cantidad = 0;
            for (int j = 0; j < numeros.length; j++){
                if (numeros[i] == numeros[j]){
                    cantidad++;
                }
            }
            arregloCantidad[i] = cantidad;
        }

        int posicion = 0, cant = 0;
        for (int i = 0; i < 10; i++){
            if (cant < arregloCantidad[i]){
                cant = arregloCantidad[i];
                posicion = i;
            }
        }

        System.out.println();
        System.out.println("La mayor ocurrencia es: " + cant);
        System.out.println("El elemento mas repetido es: " + numeros[posicion]);
    }
}
