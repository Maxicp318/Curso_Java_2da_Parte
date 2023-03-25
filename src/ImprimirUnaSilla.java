import java.util.Scanner;

public class ImprimirUnaSilla {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int num = entrada.nextInt();

        if (num == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                if (j == 0 || i == num/2 || (j == num-1 && i >= num/2)){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
