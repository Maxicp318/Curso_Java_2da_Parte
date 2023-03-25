import java.util.Random;
//Escriba un programa que imprima el número más alto de un arreglo de 7 elementos
//(de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43},
// si se repite un valor considerar uno solo.
public class NumeroMasAltoArreglo {
    public static void main(String[] args) {

        int[] numeros = new int[7];

        for (int i = 0; i < numeros.length; i++){
            Random numAzar = new Random();
            numeros[i] = 11 + numAzar.nextInt(99-10);
            System.out.print("[" + numeros[i] + "]");
        }
        System.out.println();

        int mayor = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > mayor && numeros[i] != mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("el numero mayor es: " + mayor);
    }
}
