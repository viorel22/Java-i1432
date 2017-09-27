package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Studiuindividual1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int k = 0, p = 1, n, nr, c;
        System.out.println("Bun venit :)");
        System.out.print("Introduce elementntul C: ");
        c = key.nextInt();
        System.out.print("Introduce nr de elemente pentru prelucrare: ");
        n = key.nextInt();
        for (int i=1; i<=n; i++){
            try{
                System.out.print("["+i+"]= ");
                nr = key.nextInt();
                if ( nr < c )
                    k++;
                else if( nr >c )
                    p *= nr;
            }catch (InputMismatchException ex){
                System.out.println("Ati introdus ceva gresit scriti alta cifra!!!...");
                key.nextLine();
            }
        }
        System.out.println("Numarul de elemente mai mici ca "+c+" este "+ k);
        System.out.println("Produsul cifrelor mai mari ca "+c+" este "+ p);
    }
}
