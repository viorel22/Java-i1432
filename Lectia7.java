package com.company;
import java.util.Scanner;
public class Lectia7 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Scrie nr de la sarcina 1..9: ");
        int sarcina = key.nextInt();
        if ( sarcina == 1 ) {
            int n;
            String c;
            System.out.print("Cum va numiti ");
            c = key.next();
            System.out.println("Salut "+ c);
            System.out.print("Introduceti va rog diminsiunea vectorului: ");
            n = key.nextInt();
            int[] m;
            m = new int[n];
            System.out.println("Introdu te rog elementele vectorului");
            for (int i = 0; i < m.length; i++) {
                System.out.print("["+i+"]= ");
                m[i] = key.nextInt();
            }
            System.out.println(c+" ati introdus vectorul:");
            for (int i = 0; i < m.length; i++) {
                System.out.print(m[i]+" ");
            }
        }
        else if ( sarcina == 2 ){
            System.out.print("Introduceti va rog diminsiunea vectorului: ");
            int n = key.nextInt();
            int[] m;
            m = new int[n];
            System.out.println("Introdu te rog elementele vectorului");
            for (int i = 0; i < m.length; i++) {
                System.out.print("["+i+"]= ");
                m[i] = key.nextInt();
            }
            System.out.println("Ati introdus vectorul:");
            for (int i = 0; i < m.length; i++) {
                if ( m[i] % 3 == 0 ) {
                    m[i] = 3;
                }
                System.out.print(m[i]+" ");
            }
        }
        else if( sarcina == 3){
            int n;
            System.out.print("Introduce nr de elemente: ");
            n= key.nextInt();
            int[] a;
            a = new int[n];
            System.out.println("Matricea");
            for (int i = 0; i < a.length; i++) {
                System.out.print("["+(i+1)+"]= ");
                a[i] = key.nextInt();
            }
            System.out.println("Matricea modificata: ");
            for (int i = 0; i < a.length; i++) {
                    if(a[i] % 3 == 0) {
                        a[i] = 3;
                        System.out.print(a[i] + "\t");
                    }
                    else
                        System.out.print(a[i]+"\t");
            }
        }
        else if( sarcina == 4) {
            System.out.println("Introduceti elementele vectorului: ");
            String line;
            String[] lineVector;
            line = key.next();
            lineVector = line.split(",");
            int p=0;
            int[] m;
            m = new int[lineVector.length];
            for (int i = 0; i < lineVector.length; i++) {
                m[i]=Integer.parseInt(lineVector[i]);
            }
            System.out.println("===============================================");
            System.out.println("Ati introdus vectorul:");
            for (int i = 0; i < m.length; i++) {
                System.out.print(m[i]+" ");
            }
            System.out.println();
            System.out.println("===============================================");
            System.out.println("Numere   pare: ");
            for (int i = 0; i < m.length; i++) {
                if(m[i]%2==0) {
                    p++;
                    System.out.println("["+i+"]= "+m[i]);
                }
            }
            System.out.println("Nr de elemente pare "+p);
        }
        else if( sarcina == 5){
            System.out.println("Introduceti elementele vectorului: ");
            String line;
            String[] lineVector;
            line = key.next();
            lineVector = line.split(",");
            int[] m;
            m = new int[lineVector.length];
            for (int i = 0; i < lineVector.length; i++) {
                m[i]=Integer.parseInt(lineVector[i]);
            }
            System.out.println("===============================================");
            System.out.println("Ati introdus vectorul:");
            for (int i = 0; i < m.length; i++) {
                System.out.print(m[i]+" ");
            }
            System.out.println();
            System.out.println("===============================================");
            System.out.print("Numere   pare: ");
            for (int i = 0; i < m.length; i++) {
                if(m[i]%2==0)
                    System.out.print(m[i]+" ");
            }
            System.out.println();
            System.out.print("Numere impare: ");
            for (int i = 0; i < m.length; i++) {
                if(m[i]%2!=0)
                    System.out.print(m[i]+" ");
            }
        }
        else if( sarcina == 6){
            int n,d;
            System.out.print("Introduce nr de elemente: ");
            n= key.nextInt();
            System.out.print("Introduce nr la care sa se divida: ");
            d= key.nextInt();
            int[] a;
            a = new int[n];
            System.out.println("Matricea");
            for (int i = 0; i < a.length; i++) {
                System.out.print("["+(i+1)+"]= ");
                a[i] = key.nextInt();
            }
            System.out.println("Elementele vectorului divizibile la "+d+": ");
            for (int i = 0; i < a.length; i++) {
                if(a[i] % d == 0) {
                    System.out.print(a[i] + "\t");
                }
            }
        }
        else if( sarcina == 7){
            int n,max,sum=0,min;
            System.out.print("Introduce nr de elemente: ");
            n = key.nextInt();
            int[] a;
            a = new int[n];
            System.out.println("Matricea");
            for (int i = 0; i < a.length; i++) {
                System.out.print("["+(i+1)+"]= ");
                a[i] = key.nextInt();
            }
            max=a[0];
            System.out.println("Matricea are elementele: ");
            for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i]+"\t");
                    if(a[i]<max)
                        max=a[i];
                    min = max;
                    if(a[i]>0)
                        sum +=a[i];
            }
            min=max;
            for (int i = 0; i < a.length; i++) {
                    if(a[i]<0){
                        if(min<a[i])
                            min=a[i];
                    }
            }
            System.out.println();
            System.out.println("Maximul elementelor negative: "+min);
            System.out.println("Suma elementelor pozitive: "+sum);
        }
        else if( sarcina == 8){
            int n,max,k=1;
            System.out.print("Introduce nr de elemente: ");
            n = key.nextInt();
            int[] a;
            a = new int[n];
            System.out.println("Matricea");
            for (int i = 0; i < a.length; i++) {
                System.out.print("["+(i+1)+"]= ");
                a[i] = key.nextInt();
            }
            max=a[0];
            System.out.println("Matricea are elementele: ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+"\t");
                if(a[i]>max)
                    max=a[i];
            }
            for (int i = 0; i < a.length; i++) {
                k=1;
                if(a[i]==max)
                    k++;
                a[i]=k;
            }
            System.out.println();
            System.out.println("Elementul maxim: "+max);
            System.out.println("NR de apariti: "+k);
        }
        else
            System.out.print("In acest moment sa terminat sarcinele !!!...");
    }
}
