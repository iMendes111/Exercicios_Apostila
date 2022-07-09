
    import java.util.Scanner;

    public class pg33_exer6 {
    
         public static void main(String[] args) {
    
            System.out.println("");
            System.out.print(" Digite uma massa em kg: ");
            try (Scanner quilo = new Scanner(System.in)) {
                float i = quilo.nextFloat();
            double convL = (i * 2.20465f);
            System.out.println(" -> " + i + " kg = " + convL + " lb");
    
            System.out.println("");
            System.out.print(" Digite uma massa em lb (libra): ");
            try (Scanner libra = new Scanner(System.in)) {
                float s = libra.nextFloat();
            double convQ = (s / 2.20465f);
            System.out.println(" -> " + s + " lb = " + convQ + " kg");
            
            }
        } 
    }
    }
    