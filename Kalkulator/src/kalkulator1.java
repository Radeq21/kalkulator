
public class kalkulator1 {
 public static void main(String[] args) {
	 double a=3.0;
	 double b=2.0;
	 double c=4.0;
	 double x=(a+b)*c;
	 double y= a-b/c;
	 System.out.println(x= (a+b)*c);
	 System.out.println(y= a-b/c);
	 System.out.println(x=((a++)+(b++))*(c++));//dlaczego tu wynik jest taki sam jak dwie linie wyżej?
	 // bo to jest to samo to wynik taki sam, konstrukcja a = 1+b++ ze a to bedzie teraz 1 + b, a po wykonaniu ten operacji
	 // do b dodaj 1. konstrukcja a = 1+ ++b oznacza ze a to teraz bedzie 1 dodac (b+1), ogolnie ++b i b++ oznaczaja
	 // zwieksz b o 1 ale jesli sa w innym wyrazeniu to ++b najpierw zmien b a potem wykonaj wyrazenie a b++ najpierw wykonaj wyrazenie
	 // a potem zwieksz b
	 System.out.println(y=(a++)-(b++)/(c++));// dlaczego tu nie ma minusa przed wynikiem?
	 // nie ma minusa bo (3-2)/4 to jest 0.25
	 boolean porównanie1= (a+b)>c;
	 boolean porównanie2= a==b;
	 System.out.println(porównanie1);
	 System.out.println(porównanie2);
	 
	
	 
			
 }
}
