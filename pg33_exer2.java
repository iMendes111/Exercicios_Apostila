public class pg33_exer2 {

    public static void main(String[] args) {    
        System.out.println("");
        System.out.println(" Números primos (1-123): ");
        for (int num = 2; num <= 123; num++) 
            if (Primo(num)) {
            
            System.out.println(" - " + num);
            }
        }
            
       public static boolean Primo(int numero) {
         for (int primo = 2; primo<numero; primo++) {
         if (numero % primo == 0)
         return false;   
         }
        return true;
    }
}
