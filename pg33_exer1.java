public class pg33_exer1 {
    public static void main(String[] args) {
        long npar = 1;
        int nimp = 0;    
        int resultado;
       
        System.out.println("");

           for (resultado = 0; resultado <= 30; resultado++) {
                if (resultado % 2 != 0) {  
               nimp += resultado;
           
                } else {
                    if (resultado > 0)
                    npar *= resultado;
            }
        }

        System.out.println(" De 0 a 33: " );
        System.out.println(" - Soma dos números ímpares: " + nimp);
        System.out.println(" - Multiplicação dos números pares: " + npar); 
        System.out.println("");
           
     }
    
}
