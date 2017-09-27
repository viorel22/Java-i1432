package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lectia6 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Scrie nr de la sarcina 1..5: ");
        int sarcina = key.nextInt();
        if ( sarcina == 1 ) {
            double sum = 0;
            double nr;
            int n;
            System.out.print("n = ");
            try {
                n = key.nextInt();
                if (n < 0) throw new InputMismatchException();

                System.out.println("Introdu numere reale!");
                for ( int i = 0; i < n; i++) {
                    try {
                        nr = key.nextDouble();
                        sum = sum + nr; }
                    catch (InputMismatchException e){
                        System.out.println("Introduceti un numar real!");
                        key.nextLine();
                    }
                }
            }
            catch (InputMismatchException e){
                System.out.println("Introdu un numar pozitiv ! ");
                key.nextLine();
            }finally {
                System.out.println("Suma = " + sum);
            }
        }
        else if ( sarcina == 2 ) {
            int a,b,c;
            double delta;
            try {
                System.out.print("Ecuatia de gr II :");
                System.out.print("\na = ");
                a = key.nextInt();
                System.out.print("b = ");
                b = key.nextInt();
                System.out.print("c = ");
                c = key.nextInt();

                if ( a == 0 && b == 0 && c == 0 )
                    System.out.println("Orice valoare reala este radacina !");
                else if ( a == 0 && b == 0 && c != 0 )
                    System.out.println("Ecuatia nu are solutii ! :(");
                else if ( a == 0 && b != 0 ) {
                    System.out.println("x = " + (-1*c/b));
                }
                else if (a != 0){
                    try{
                        double x1,x2;
                        delta = Math.pow(b,2)-4*a*c;
                        if(delta < 0) throw new Exception("Valoarea delta este prea mica");
                        else{
                            x1=(-b+Math.sqrt(delta))/2*a;
                            x2=(-b-Math.sqrt(delta))/2*a;
                            System.out.printf("x1= %5.2f\nx2= %5.2f",x1,x2);
                        }

                    }catch (Exception ex){
                        System.out.println(ex.getMessage());
                    }
                }
            }catch (InputMismatchException e) {
                System.out.println("Ati introdus ceva gresit!!!");
                key.nextLine();
            }
        }
        else if (sarcina == 3){
            double sum = 0,nr;
            int n;
            System.out.print("n = ");
            try {
                n = key.nextInt();
                if (n < 0) throw new InputMismatchException();

                System.out.println("Introdu numere reale!");
                for ( int i = 0; i < n; i++) {
                    try {
                        nr = key.nextDouble();
                        sum = sum + nr; }
                    catch (InputMismatchException e){
                        System.out.println("Introduceti un numar real!");
                        key.nextLine();
                    }
                }
            }
            catch (InputMismatchException e){
                System.out.println("Introdu un numar pozitiv ! ");
                key.nextLine();
            }finally {
                System.out.println("Suma = " + sum);
            }
        }
        else{
            System.out.println("Ai fost smecher!!!");
        }
    }
}




