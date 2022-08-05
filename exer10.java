import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nmr, antec;

    System.out.println("");
    System.out.print(" Digite um número: ");
    nmr = entrada.nextInt();

    antec = nmr - 1;

    System.out.println("");
    System.out.println(" O antecessor do número digitado é: " + antec);

    entrada.close();

    }
}