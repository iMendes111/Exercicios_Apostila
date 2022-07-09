import java.util.Scanner;

public class pg33_exer3 {

    public static void main(String[] args) {

        System.out.printf(" Digite um número: ");
        Scanner num = new Scanner(System.in);
        int i = num.nextInt();

        if (i % 2 == 0) {
            System.out.println(" * É par");
        } else {
            System.out.println(" * É ímpar");
            num.close();
        }

        if (Primo(i)) {
            System.out.println(" * É primo");
        } else {
            System.out.println(" * Não é primo");
        }
    }

    public static boolean Primo(int n) {

        for (int num = 2; num < n; num++) {
            if (n % num == 0)
                return false;
        }
        return true;
    }
}