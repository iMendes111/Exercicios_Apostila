
    import java.util.Scanner;

    public class pg33_exer4 {
        
        static float Vhora = 10.25f;
        static float Salario;
    
            public static void main(String[] args) {
    
                System.out.print(" Número de horas trabalhadas: ");
                try (Scanner horas = new Scanner(System.in)) {
                    int i = horas.nextInt();
    
                    Salario = Vhora * i;
                }
                System.out.println(" O valor diário a ser recebido é de R$" + Salario);
            
        }
    }
    
    