
import java.util.ArrayList;
import java.util.Iterator;

public class A {

     private int x;

 

     public A() {

     }

 

     public static void main(String[] args) {

//           A a = new A();
//
//           a.x = 5;
//
//           A b = new A();
//
//           b.x = 5;
//
//           System.out.println(a == b);

//ArrayList<String> lista = new ArrayList<String>();
//
//lista.add("A");
//
//lista.add("B");
//
//lista.add("C");
//
//System.out.println(lista.get(1));

ArrayList<Integer> lista = new ArrayList<Integer>();

lista.add(10);

lista.add(20);

lista.add(30);

Iterator<Integer> it = lista.iterator();

it.next();

System.out.println(it.next());

     }

}
