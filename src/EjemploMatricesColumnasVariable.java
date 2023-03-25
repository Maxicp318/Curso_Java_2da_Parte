public class EjemploMatricesColumnasVariable {
    public static void main(String[] args) {

        int[][] matriz = new int[3][];

        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
