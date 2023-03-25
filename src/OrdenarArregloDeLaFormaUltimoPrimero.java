import java.util.Scanner;

//Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
// Luego debemos mostrarlos en el siguiente orden:
// el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.
public class OrdenarArregloDeLaFormaUltimoPrimero {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.print("ingrese numero:");
            numeros[i] = entrada.nextInt();
        }

        System.out.println();
        int actual = 0;
        int inverso = 0;
        for (int i = 0; i < numeros.length/2; i++){
            actual = numeros[i];
            inverso = numeros[numeros.length-1-i];
            numeros[i] = inverso;
            numeros[numeros.length-1-i] = actual;
        }

        for (int i = 0; i < numeros.length; i++){
            System.out.println(i + " = " + numeros[i]);
        }
    }
}
