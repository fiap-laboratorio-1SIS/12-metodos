import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1;

        System.out.print("Informe um valor inteiro e positivo: ");
        valor1 = sc.nextInt();
        if(valor1 > 0) {
            imprimirDivisor(valor1);
        }
        else {
            System.out.println("os valores devem ser positivos");
        }
    }

    public static void imprimirDivisor(int valor1) {
        for(int cont = 1; cont <= valor1; cont++) {
            if(valor1 % cont == 0) {
                System.out.println(-cont + "  " + cont);
            }
        }
    }

}
