import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.print("Lado 1 --> ");
        lado1 = sc.nextDouble();
        System.out.print("Lado 2 --> ");
        lado2 = sc.nextDouble();
        System.out.print("Lado 3 --> ");
        lado3 = sc.nextDouble();

        if(validar(lado1, lado2, lado3)) {
            classificar(lado1, lado2, lado3);
        }
        else{
            System.out.println("os valores não formam um triângulo");
        }

    }

    public static boolean validar(double l1, double l2, double l3) {
        return (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2);
    }

    public static void classificar(double l1, double l2, double l3) {
        if(l1 == l2 && l2 == l3) {
            System.out.println("Triângulo equilátero");
        }
        else if(l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("Triângulo isósceles");
        }
        else {
            System.out.println("Triângulo escaleno");
        }
    }
}
