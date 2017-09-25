package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lectia5 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Scrie nr de la sarcina 1..11: ");
        int sarcina;
        sarcina = key.nextInt();
        if ( sarcina == 1){
            try{
                int value = 6;
                if(value < 40) throw new Exception("Valoarea prea mica");
            }catch (Exception ex){
                System.out.println(ex.getMessage());
                System.out.println("Cotinuare dupa blocul catch");
            }
        }
        else if(sarcina == 2){
            try {
                int numitor = 0, numaratorul = 3;
                int fractie = numitor / numitor;
                System.out.println("Rezultat : "+ fractie);
            }catch (ArithmeticException e1){
                System.out.println("Numitorul nu poate fi 0!");
            }
        }
        else if(sarcina == 3){
            int div = 0;
            int nr = 2;
            do {
                try{
                    System.out.print("Introduce un nr diferit de 0: ");
                    nr = key.nextInt();
                    if ( nr % 3 == 0 )
                        div = div + 1;
                }catch (InputMismatchException ex){
                    System.out.println("Ati introdus ceva gresit scriti alta cifra!!!...");
                    key.nextLine();
                }
            }while (nr!=0);
            System.out.println("Numarul de cifre div la 3 este "+ div);
        }
        else if(sarcina == 4){
            int s = 0;
            int nr = 2;
            do {
                try{
                    System.out.print("Introduce un nr diferit de 0: ");
                    nr = key.nextInt();
                    if ( nr%2 != 0 )
                        s = s + nr;
                }catch (InputMismatchException ex){
                    System.out.println("Ati introdus ceva gresit scriti alta cifra!!!...");
                    key.nextLine();
                }
            }while (nr!=0);
            System.out.println("Suma cifrelor impare este "+ s);
        }
        else if(sarcina == 5){
            int s = 0;
            int nr = 2;
            try{
                System.out.print("Introduce o cifra : ");
                nr = key.nextInt();
                if ( nr%2 != 0 )
                    s = s + nr;
            }catch (InputMismatchException ex){
                System.out.println("Ati introdus ceva gresit scriti alta cifra!!!...");
                key.nextLine();
                }
            }
        }
        else {
            System.out.println("Ai fost smecher!!!");
        }
    }
}
