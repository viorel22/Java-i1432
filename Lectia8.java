package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lectia8 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Scrie nr de la sarcina 1..7: ");
        int sarcina = key.nextInt();
        if (sarcina == 1) {
            int m,n,s=0;
            System.out.print("Introduce nr de randuri: ");
            m = key.nextInt();
            System.out.print("Introduce nr de coloane: ");
            n = key.nextInt();
            int[][] a;
            a = new int[m][n];
            System.out.println("Matricea");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    try{
                        System.out.print("["+(i+1)+" , "+(j+1)+"]= ");
                        a[i][j] = key.nextInt();
                    }catch (InputMismatchException ex) {
                        System.out.println("Ati introdus ceva gresit scriti alta cifra!!!...");
                        key.nextLine();
                    }
                }
            }

            System.out.println("Matricea are elementele: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++){
                    if(i==j) {
                        System.out.print(a[i][j] + "\t");
                        s +=a[i][j];
                    }
                }
            }
            System.out.println();
            System.out.println("Suma este "+s);
        }
        else if(sarcina==2){
            int m,n,x,s=0;
            System.out.print("Introduce nr de randuri: ");
            m = key.nextInt();
            System.out.print("Introduce nr de coloane: ");
            n = key.nextInt();
            int[][] a;
            a = new int[m][n];
            System.out.println("Matricea");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    try{
                        System.out.print("["+(i+1)+" , "+(j+1)+"]= ");
                        a[i][j] = key.nextInt();
                    }catch (InputMismatchException ex) {
                        System.out.println("Ati introdus ceva gresit scriti alta cifra!!!...");
                        key.nextLine();
                    }
                }
            }
            System.out.println("Matricea are elementele: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++){
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.print("Introduce linia care vei lucra cu ea: ");
            x = key.nextInt();
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++){
                    if(i+1 == x)
                        s +=a[i][j];
                }
            }
            System.out.println();
            System.out.println("Suma pe linea "+x+" este "+s);
        }
        else if(sarcina==3){
            int m,n,p=0;
            System.out.print("Introduce nr de randuri: ");
            m = key.nextInt();
            System.out.print("Introduce nr de coloane: ");
            n = key.nextInt();
            int[][] a;
            a = new int[m][n];
            System.out.println("Matricea");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    try{
                        System.out.print("["+(i+1)+" , "+(j+1)+"]= ");
                        a[i][j] = key.nextInt();
                    }catch (InputMismatchException ex) {
                        System.out.println("Ati introdus ceva gresit scriti alta cifra!!!...");
                        key.nextLine();
                    }
                }
            }
            System.out.println("Matricea are elementele: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++){
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print("Linia "+(i+1));
                for (int j = 0; j < a[i].length; j++){
                    if((a[i][j]%10)%2==0) p++;
                }
                System.out.print(" sunt "+p+" nr pare");
                p=0;
                System.out.println();
            }
        }
        else if(sarcina==4){
            int m,n,s;
            System.out.print("Introduce nr de randuri: ");
            m = key.nextInt();
            System.out.print("Introduce nr de coloane: ");
            n = key.nextInt();
            int[][] a;
            a = new int[m][n];
            System.out.println("Matricea");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    try{
                        System.out.print("["+(i+1)+" , "+(j+1)+"]= ");
                        a[i][j] = key.nextInt();
                    }catch (InputMismatchException ex) {
                        System.out.println("Ati introdus ceva gresit scriti alta cifra!!!...");
                        key.nextLine();
                    }
                }
            }
            System.out.println("Matricea are elementele: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++){
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
            for(int j=0;j<n;j++)
            {
                s=0;
                for(int i=0;i<m;i++)
                    s +=a[i][j];
                System.out.println("Suma elementelor de pe coloana "+(j+1)+" este: "+s);
            }
        }
        else if(sarcina==5){

        }
        else
            System.out.println("Vrei sa fi smecher/a!!!");
    }
}
