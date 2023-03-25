import java.util.Scanner;

public class AgregarElementoYDesplazar {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("ingrese numero");
            a[i] = entrada.nextInt();
        }
        System.out.println();

        System.out.println("ingrese nuevo elemento");
        elemento = entrada.nextInt();

        System.out.println("ingrese la posicion donde agregar el elemento (0-9)");
        posicion = entrada.nextInt();

        for (int i = a.length -2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        a[posicion] = elemento;

        System.out.println("arreglo");
        for (int i = 0; i < a.length; i++){
            System.out.println(i + " : " + a[i]);
        }
    }
}
