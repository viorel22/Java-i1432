package com.company;
import java.util.Scanner;
public class Lectia4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Scrie nr de la sarcina 1..11: ");
        int sarcina;
        sarcina = key.nextInt();
        if (sarcina == 1) {
            int n=35;
            for (int i=11; i<=n; i++){
                System.out.print(i+i+" ");
            }
        }
        else if (sarcina == 2) {
            int k=0;
            System.out.print("Scrie o cifra: ");
            int n = key.nextInt();
            for (int i=1; i<=n; i++){
                if(i%2 != 0)k += i;
            }
            System.out.print("Suma numerelor impare este "+k);
        }
        else if (sarcina == 3) {
            System.out.print("Scrie o cifra: ");
            int n = key.nextInt();
            System.out.println("Cifrele sunt:");
            for (int i=1; i<=n; i++){
                if(i%5 == 0)System.out.print(i+" ");
            }
        }
        else if ( sarcina == 4 ) {
            int s = 0;
            System.out.print("Scrie un numar: ");
            int n = key.nextInt();
            for ( int i = 1; i <=n; i++) {
                if ( i % 3 == 0 )
                    s = s + i;
            }
            System.out.println("Suma numerelor div. cu 3 = " + s);
        }

        else if ( sarcina == 5 ) {
            int p = 1;
            System.out.print("Scrie un numar: ");
            int n = key.nextInt();
            for (int i = 1; i <= n; i++) {
                if ( i % 2 != 0 )
                    p = p * i;
                i++;
            }
            System.out.println("Produsul = " + p);
        }

        else if ( sarcina == 6 ) {
            int p = 1;
            System.out.print("a = ");
            int a = key.nextInt();
            System.out.print("b = ");
            int b = key.nextInt();
            for ( int i = 1; i<=b; i++)
                p = p * a;
            System.out.println("a^b = " + p);
        }
        else if ( sarcina == 7 ) {
            int f = 10, s = 7, i = 1;
            while (7>=i)
            {
                f += 15;
                i++;
            }
            System.out.println("Intro  saptamana, au inflorit " + f + " flori! :)");
        }
        else if ( sarcina == 8 ) {
            int i = 50;
            double p = 46.20;
            while (1000>=i)
            {
                System.out.printf("%d grame costa %.2f\n",i,(i*p)/1000);
                i += 50;
            }
        }
        else if ( sarcina == 9 ){
            int c=10000,d=5,t=12;
            System.out.print("Peste 10 ani va avea un venit de :"+((c*d*t*365)/(100*360)));
        }
        else if ( sarcina == 10){
            double a,b,c,d,f=1;
            a=b=d=c=0;
            System.out.print("Scrie un numar: ");
            int n = key.nextInt();
            for (int i = 1; i <= n; i++) {
                a += 1/(2*i);
                b += (10*i)+2;
                c += i/(i+1);
                f=f*i;
                d += f;
            }
            System.out.printf("a) %.2f\nb) %.2f\nc) %.2f\nd) %.2f",a,b,c,d);
        }
        else if ( sarcina == 11){
            for ( int i = 1; i<=10; i++)
                System.out.println("1 * "+i+" = "+(1*i)+"\t2 * "+i+" = "+(2*i)+"\t3 * "+i+" = "+(3*i)+"\t4 * "+i+" = "+(4*i)+"\t5 * "+i+" = "+(5*i)+"\t6 * "+i+" = "+(6*i)+"\t7 * "+i+" = "+(7*i)+"\t8 * "+i+" = "+(8*i)+"\t9 * "+i+" = "+(9*i)+"\t10 * "+i+" = "+(10*i));
        }
        else System.out.print("Sarcina alesa sa rezolvat in clasa!!! xD");
    }
}
