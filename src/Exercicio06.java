import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int[] maior;

        System.out.println(matriz);
        preencher(matriz);
        System.out.println("Dados da matriz");
        imprimir(matriz);
        maior = maiorLinha(matriz);
        System.out.println("\nMaior valor armazenado em cada linha");
        imprimir(maior);
    }

    public static void preencher(int[][] m) {
        Random rd = new Random();
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = rd.nextInt(50);
            }
        }
    }

    public static void imprimir(int[][] m) {
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] maiorLinha(int[][] m) {
        int[] maior = new int[m.length];
        for(int i = 0; i < m.length; i++) {
            maior[i] = Integer.MIN_VALUE;
            for(int j = 0; j < m[i].length; j++) {
                if(m[i][j] > maior[i]) {
                    maior[i] = m[i][j];
                }
            }
        }
        return maior;
    }

    public static void imprimir(int[] v) {
        for(int i : v) {
            System.out.print(i + "\t");
        }
    }
}
