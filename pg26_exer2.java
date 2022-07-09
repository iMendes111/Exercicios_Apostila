import java.util.Scanner;

public class pg26_exer2{
    public static void main(String[]args)
    {
    
    Scanner entrada = new Scanner(System.in);
    
    float h, b, B, area;

    System.out.println("");
    System.out.print(" Digite a altura do trapézio: ");
    h = entrada.nextFloat();
    System.out.print(" Digite a base menor do trapézio: ");
    b = entrada.nextFloat();
    System.out.print(" Digite a base maior do trapézio: ");
    B = entrada.nextFloat();

    area = (h * (b + B))/ 2;

    Math.log(area);
    System.out.println("");
    System.out.println(" A área do trapézio é " + area);
    System.out.println(" Número arredondado: " + Math.ceil(area));
    System.out.println("");

    entrada.close();
    }
}
