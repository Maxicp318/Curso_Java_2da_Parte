import java.util.Scanner;
//Leer 7 números por teclado para llenar un arreglo y a continuación
//calcular el promedio de los números positivos,
//el promedio de los negativos y contar el número de ceros.
public class SistemaEstadisticoDeUnArreglo {
    public static void main(String[] args) {

        int[] numeros = new int[7];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.print("ingrese numero:");
            numeros[i] = entrada.nextInt();
        }

        int sumaTotalPositivo = 0, sumaTotalNegativos = 0;
        int ceros = 0, cantPositivos = 0, cantNegativos = 0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > 0){
                sumaTotalPositivo += numeros[i];
                cantPositivos++;
            } else if (numeros[i] < 0){
                sumaTotalNegativos += numeros[i];
                cantNegativos++;
            } else {
                ceros++;
            }
        }
        double promedioPositivo = (double) sumaTotalPositivo/cantPositivos;
        double promedioNegativo = (double) sumaTotalNegativos/cantNegativos;

        System.out.println("promedio de numeros positivos = " + promedioPositivo);
        System.out.println("promedio de numeros negativos = " + promedioNegativo);
        System.out.println("cantidad de numeros ceros = " + ceros);
    }
}
