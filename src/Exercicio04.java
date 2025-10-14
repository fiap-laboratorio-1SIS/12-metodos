import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta;
        double[] raiz;

        System.out.print("a --> ");
        a = sc.nextDouble();
        if(a == 0) {
            System.out.println("Não é uma equação do 2o grau");
        }
        else {
            System.out.print("b --> ");
            b = sc.nextDouble();
            System.out.print("c --> ");
            c = sc.nextDouble();
            delta = calcularDelta(a, b, c);
            if(delta < 0) {
                System.out.println("A equação não tem raiz real");
            }
            else {
                raiz = calcularRaiz(a, b, delta);
                System.out.println("x1 = " + raiz[0]);
                System.out.println("x2 = " + raiz[1]);
            }
        }


    }

    public static double calcularDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static double[] calcularRaiz(double a, double b, double delta) {
        double[] raiz = new double[2];
        raiz[0] = (-b + Math.sqrt(delta)) / (2 * a);
        raiz[1] = (-b - Math.sqrt(delta)) / (2 * a);
        return raiz;
    }
}
