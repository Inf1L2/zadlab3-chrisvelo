/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_1;

/**
 *
 * @author krzysiek
 */
//public class Main {

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
        // TODO code application logic here
   // }
    
//}

 
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Podaj liczbę: " ); 
// pobieramy od użytkownika liczbę
int liczba = sc.nextInt(); 
// wyświetlamy na ekranie obliczoną silnię
System.out.println(liczba + "! = " + silnia(liczba));
 }
}