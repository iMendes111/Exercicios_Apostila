import java.util.Scanner;

public class pg26_exer3{
    public static void main(String[]args)
    {
    
    try (Scanner entrada = new Scanner(System.in)) {
        Integer a, b, c, d;

        a = 3 - 2 - 1 + 2 + 1 + 3;
        b = ((2 * 3) - (4 * 5));
        c = 2 + 6 - (3 / 7) * 9;
        d = (3 % 4) - 8;

        System.out.println("");
        System.out.println(" Resultados:  a = " + a + " | b = " + b + " | c = " + c + " | d = " + d);
        System.out.println("");
    }
    }
}
