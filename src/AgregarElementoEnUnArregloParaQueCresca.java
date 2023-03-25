import java.util.Scanner;

public class AgregarElementoEnUnArregloParaQueCresca {
    public static void main(String[] args) {

        int[] a = new int[10];
        int numero, posicion, ultimo;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("ingrese un numero: ");
            a[i] = entrada.nextInt();
        }
        System.out.println();

        System.out.println("ingrese el numero a insertar");
        numero = entrada.nextInt();

        System.out.println("ingrese la posicion (0-9)");
        posicion = entrada.nextInt();

        ultimo = a[a.length-1];
        while (posicion < 6 && numero > a[posicion]){
            posicion++;
        }

        for (int i = a.length-2; i >= posicion; i--){
            a[i+1] = a[i];
        }

        int[] b = new  int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);
        a = b;
        a[posicion] = numero;
        a[a.length] = ultimo;

        System.out.println("nuevo arreglo ordenado");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " : " + a[i]);
        }
    }
}
