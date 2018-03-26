
package lab3;
import java.util.Scanner;
/**
 *
 * @author krzysiek
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //zad 1_1
        double a=12.12;

	System.out.println(a--); //operator dekrementacji postfixowy, zmienia wartość po przypisaniu
	System.out.println(a++); //operator inkrementacji postfixowy, zmienia wartość po przypisaniu
	System.out.println(--a); //operator dekrementacji preixowy, zmienia wartość przed przypisaniem
	System.out.println(++a); //operator inkrementacji preixowy, zmienia wartość przed przypisaniem
//zad 1_2
        int c = 2;
    int b=4;
    if ((c==b)&&(c>b))
    {
        System.out.println("c jest wieksze lub rowne");   
    }
   
    if ((b==c)||(b>c))
           System.out.println("b jest wieksze lub rowne"); 
   
   // ZAD 1_3
   boolean v1=true;
    boolean v2=false;
    boolean v3= v1 || v2;
    boolean v31= v1 | v2;
    boolean v4=v1 && v2;
    boolean v41=v1 & v2;
    System.out.println(v3);
     System.out.println(v4);
     System.out.println(v31);
     System.out.println(v41);
 //operatory bitowe
   int x=1; int y=2;
   System.out.println(x&y);
    System.out.println(x|y);
      
      //ZAD 1_4
    int c=11;
      int a=3;
     int b;
    
     System.out.print("Przesuwana liczba to "+c+"\nprzesuwamy zawsze o 3 bity\n");
     System.out.print("Przesuniecie w lewo ze znakiem: ");
     b=c<<a;
     System.out.print(b+"\n");
      b=c>>a;
       System.out.print("Przesuniecie w prawo ze znakiem: ");
     System.out.print(b);
     b=c>>a;
       System.out.print("\nPrzesuniecie w prawo bez znaku: ");
     System.out.print(b);
    
    //ZAD 1_5 operatory przypisania
   int a = 17;
double b = 4.0;
System.out.println(a += b); // 21 a=a+b
System.out.println(a -= b); // 17 a=a-b
System.out.println(a *= b); // 68 a=a*b
System.out.println(a /= b); // 17 a=a/b
System.out.println(a %= b); // 1  a=a%b 
  
 //ZAD 1_6
 
 int a = 5;
int b = 3;
int c = a+b++;
int d =(a++)+b;
 System.out.println(c); //najpierw suma a+b
 System.out.println(d); //najpierw inkrementacja a */
 
 //ZAD 1_7
 int a=1,b=2,c=1;
 
 if(a !=b){System.out.println("a i b są różne od siebie");}
  if(a==1 ^ c==1){System.out.println("a lub b jest 1");}
  else System.out.println("a i b sa 0 lub 1"); 

//ZAD 2_2
String k= new String("Krzysztof Klosek");
String m = new String("Programowanie Obiektowe");
System.out.println(k.toCharArray()); //konwertuje stringa na nowa tablice znakow
System.out.println(k.getBytes());//koduje stringa w sekwencje bajtów z uzyciem domyslnych znakow, przechowuje wynik w nowej tablicy bajtow
System.out.println(k.equals(m));
System.out.println(k.equals(k)); //porównuje 2 stringi i daje wynik true lub false
System.out.println(k.equalsIgnoreCase(m)); //też porownanie tylko bez wgzledu na wielkosc liter
System.out.println(k.compareTo(m)); //porownuje 2 stringi leksykograficznie, zwraca int
System.out.println(k.compareToIgnoreCase(m));//to samo porownanie bez wgledu na wielkosc liter
System.out.println(k.indexOf('o')); //zwraca indeks pierwszego napotkanego znaku
System.out.println(k.lastIndexOf('k'));
System.out.println(k.lastIndexOf('k'));// zwraca indeks ostatniego napotkanego znaku
System.out.println(k.substring(9)); //dzieli string na substring od indeksu w nawiasie
System.out.println(k.substring(0,9)); //dzieli string pomiedzy podanymi indeksami
System.out.println(k.replace('K','S')); // podmiana liter w calym stringu
System.out.println(k.trim()); //usuwa poczatkowe i koncowe biale znaki
System.out.println(k.toLowerCase()); //zamienia wszystkie litery na male
System.out.println(k.toUpperCase()); //zamienia wszystkie litery na duze


   //dzieli string na 2 czesci z wycieciem znakow podanych w cudzyslowiu
String[] dzielony = k.split("Klo");
String dzielony1 = dzielony[0];
String dzielony2 = dzielony[1];
 System.out.println(dzielony1);
System.out.println(dzielony2);
  
}

}
