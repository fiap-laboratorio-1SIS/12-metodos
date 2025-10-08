import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z, maior;

        System.out.print("Primeiro valor --> ");
        x = sc.nextInt();
        System.out.print("Segundo valor --> ");
        y = sc.nextInt();
        System.out.print("Terceiro valor --> ");
        z = sc.nextInt();

        maior = calcularMaior(x, y, z);
        System.out.println("maior valor --> " + maior);

    }

    public static int calcularMaior(int x, int y, int z) {
        if(x > y && x > z) {
            return x;
        }
        else if(y > z) {
            return y;
        }
        return z;
    }
}
