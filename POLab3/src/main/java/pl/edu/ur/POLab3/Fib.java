import java.util.*; 

/**
 *
 * @author krzysiek
 * ZAD 3_4
 */
public class Fib {

   public static int fibonacci(int n){
       if((n==1) || (n==2))
           return 1;
       else
           return fibonacci(n-1)+fibonacci(n-2);
   }
    public static void main(String[] args) {
        // TODO code application logic here
         int n;
        Scanner f = new Scanner(System.in);
        System.out.print("Podaj numer wyrazu ciagu Fibonacciego: " ); 
        n=f.nextInt();
        System.out.println("Wyraz o numerze "+n+" = "+fibonacci(n));
    }
    
}
