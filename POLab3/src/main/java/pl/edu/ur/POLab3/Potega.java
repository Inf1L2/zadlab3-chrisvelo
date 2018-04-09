
import java.util.*; 
/**
 *
 * @author krzysiek
 * ZAD 3_3
 */
public class Potega {

    
    public static int rekurencja(int x, int k){
        int a;
        if(k==0) return 1;
        if(k%2!=0)
            return a=x*rekurencja(x,(k-1));
        else a=rekurencja(x,k/2);
        return a*a;
    }
    
    public static void iteracja(){
        int x,k;
        int w=1;
        
        Scanner it = new Scanner(System.in);
        System.out.println("Podaj x - podstawa: ");
    x = it.nextInt(); 
    System.out.println("Podaj k-wykladnik: ");
    k = it.nextInt();
    
        if(k==0) w=1;
        else{
            for(int i=1;i<=k;i++){
                w=w*x;
            }
            System.out.println("Wynik iteracyjnie "+w);
            
        }
    }
    
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
System.out.println("Wersja rekurencyjna\n x - podstawa  k-wykladnik");
System.out.println("Podaj x - podstawa: ");
a = sc.nextInt(); 
System.out.println("Podaj k-wykladnik: ");
b = sc.nextInt(); 
System.out.println("Wynik rekurencyjnie "+rekurencja(a,b));

System.out.println("Wersja iteracyjna\n x - podstawa  k-wykladnik");
iteracja();
    }
    
}
