import java.util.Scanner;

public class pg33_exer5 {

    static float Vhora = 10.25f;
    static float Salario;

        public static void main(String[] args) {

            System.out.println("");
            System.out.print(" Número de horas trabalhadas: ");
            try (Scanner horas = new Scanner(System.in)) {
                int i = horas.nextInt();

                Salario = Vhora * i;
                if (Salario < 50.00f) {
                    System.out.println("");
                    System.out.println(" Atenção, dirija-se à direção do Hotel!");
                } else {
            System.out.println("");
            System.out.println(" O valor diário a ser recebido é de R$" + Salario);
            System.out.println("");

                }
            }
           
                
    }
}