package com.company;
import java.util.Scanner;

public class Lectia3 {
    public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
	System.out.print("Scrie nr de la sarcina 1..11: ");
	int sarcina;
	sarcina = key.nextInt();
	if(sarcina == 1){
	    double kg, imc, in;
	    System.out.print("Scrie greutatea corpului tau: ");
	    kg = key.nextInt();
	    System.out.print("Scrie inaltimea corpului tau: ");
	    in = key.nextInt();
	    imc = kg/Math.pow(in,2);
	    if(imc<18.5){
            System.out.print("Subponderal");
        }
        else if(18.5 <=imc && imc<=24.9){
            System.out.print("Normal");
        }
        else if(25.0 <=imc && imc<=29.9){
            System.out.print("Supraponderal");
        }
        else if(imc>30){
            System.out.print("Obez");
        }
        else{
            System.out.print("Ati introdus ceva gresit");
        }
    }
    else if(sarcina == 2){
        int an,r;
        System.out.print("Scrie nr anului : ");
        an = key.nextInt();
        r = an%12;
        switch (r) {
            case 0 : System.out.println("maimuță"); break;
            case 1 : System.out.println("cocoș"); break;
            case 2 : System.out.println("câine"); break;
            case 3 : System.out.println("purcel"); break;
            case 4 : System.out.println("șobolan"); break;
            case 5 : System.out.println("taur"); break;
            case 6 : System.out.println("tigru"); break;
            case 7 : System.out.println("iepuraș"); break;
            case 8 : System.out.println("dragon"); break;
            case 9 : System.out.println("șarpe"); break;
            case 10 : System.out.println("cal"); break;
            case 11 : System.out.println("capra"); break;
            default: System.out.println("Varianta nu exista");
        }
    }
    else if(sarcina == 3){
        int a, b, x;
        System.out.print("Scrie numar A: ");
        a = key.nextInt();
        System.out.print("Scrie numar B: ");
        b = key.nextInt();
        x=(-1)*(b/a);
        System.out.println(a+"x+"+b+"=0");
        System.out.println("x="+x);
    }
    else if(sarcina == 4){
        int zi;
        System.out.print("Scrie o zi a saptamini : ");
        zi = key.nextInt();
        switch (zi) {
            case 1 : System.out.println("luni"); break;
            case 2 : System.out.println("marti"); break;
            case 3 : System.out.println("miercuri"); break;
            case 4 : System.out.println("joi"); break;
            case 5 : System.out.println("vineri"); break;
            case 6 : System.out.println("sambata"); break;
            case 7 : System.out.println("duminica"); break;
            default: System.out.println("Nu exista asa zi a saptamini");
        }
    }
    else if(sarcina == 5){
        double a, b, c, x ,x1,x2,delta;
        System.out.print("Scrie numar A: ");
        a = key.nextInt();
        System.out.print("Scrie numar B: ");
        b = key.nextInt();
        System.out.print("Scrie numar C: ");
        c = key.nextInt();
        if(a==0)
            if(b==0)
                if(c==0)
                    System.out.println("Exista o infinitate de solutii!");
                else
                    System.out.println("Ecuatie imposibila!");
            else
            { System.out.println("Ecuatie de gr I cu solutia ");
                x=-c/b;
                System.out.println(x);
            }
        else
        { delta=Math.pow(b,2)-4*a*c;
            if(delta<0)
                System.out.println("Ecuatia nu are solutii reale!");
            else
            if(delta==0)
            { System.out.println("Ecuatia are solutii egale!");
                    System.out.println("x1=x2="+ (-b/(2*a)));}
            else
                { x1=(-b+Math.sqrt(delta))/2*a;
                    x2=(-b-Math.sqrt(delta))/2*a;
                    System.out.println("Ecuatia are solutii reale!");
                    System.out.println("x1="+x1);
                    System.out.println("x2="+x2);
                }
        }
    }
    else if(sarcina == 6){
        double a, b, c, e;
        System.out.print("Scrie numar A: ");
        a = key.nextInt();
        System.out.print("Scrie numar B: ");
        b = key.nextInt();
        System.out.print("Scrie numar C: ");
        c = key.nextInt();
        if(c>0){
            e = Math.sqrt(a+b);
            System.out.print("Solutia este "+e);
        }
        else if(c==0){
            e = a*b;
            System.out.print("Solutia este "+e);
        }
        else if(c<0){
            e = 1/(a-b);
            System.out.print("Solutia este "+e);
        }
    }
    else if(sarcina == 7){
        int nota;
        System.out.print("Scrie numar A: ");
        nota = key.nextInt();
        switch (nota) {
            case 1 :
            case 2 :
            case 3 :
            case 4 : System.out.println("repetent"); break;
            case 5 :
            case 6 :
            case 7 : System.out.println("slab"); break;
            case 8 :
            case 9 : System.out.println("bine"); break;
            case 10 : System.out.println("excelent"); break;
            default: System.out.println("Nota nu exista");
        }
    }
    else if(sarcina == 8){
        int x, y, z;
        System.out.print("Scrie numar X: ");
        x = key.nextInt();
        System.out.print("Scrie numar Y: ");
        y = key.nextInt();
        System.out.print("Scrie numar Z: ");
        z = key.nextInt();
        if(x>0 && y>0 &&z>0){
            if (y>z)
                System.out.print("y mai mare ca z");
            else
                System.out.print("z mai mare ca y");
        }
        else{
            System.out.print("Se contine nr negativ");
        }

    }
    else if(sarcina == 9){
    int venit;
    final int profit_minim= 50;
    System.out.print("Scrie venitul anual: ");
    venit = key.nextInt();
    if(venit > profit_minim)
        System.out.print("Profitul este mare in acest an");
    else
        System.out.print("Profitul este mic in acest an");
    }
    else if(sarcina == 10){
        int a,b;
        char c;
        System.out.print("Scrie numar A: ");
        a = key.nextInt();
        System.out.print("Scrie numar B: ");
        b = key.nextInt();
        System.out.print("Scrie operatorul: ");
        c = key.next().charAt(0);
        switch (c) {
            case '+': System.out.println("a+b= "+(a+b)); break;
            case '-' : System.out.println("a-b= "+(a-b)); break;
            case '*' : System.out.println("a*b= "+(a*b)); break;
            case '/' : System.out.println("a/c= "+a/b); break;
            default: System.out.println("nu se poate face operatiea data");
        }
    }
    else if (sarcina == 11) {
            System.out.print("Latura A = ");
            int a = key.nextInt();
            System.out.print("Latura B = ");
            int b = key.nextInt();
            System.out.print("Latura C = ");
            int c = key.nextInt();
            if ( ( a + b ) > c && ( a + c ) > b && ( b + c ) > a) {
                if ( a == b  && a == c && c == b )
                    System.out.println("Echilateral");
                else if ( a ==
                        b || b == c || a == c )
                    System.out.println("Isoscel");
                else System.out.println("Triunghi oarecare");
            }
            else System.out.println("Error in introducere");
    }
    else System.out.print("Sarcina alesa sa rezolvat in clasa!!! xD");
    }
}
