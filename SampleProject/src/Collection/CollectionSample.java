package Collection;
import java.util.List;
import java.util.ArrayList;
public class CollectionSample {

	public static void main(String[] args) {
List<Object> a=new ArrayList();
List<Object> b=new ArrayList();
a.add(3);
a.add(67);
a.add(45);
a.add(5);
a.add(4);
b.add(7);
b.add(null);
b.add("hai");
b.add(true);
b.add(5.5);
b.add('c');
b.add(null);
b.add(null);
System.out.println(a);
a.addAll(b);
System.out.println(a);
//System.out.println("a and b equals");
//System.out.println(a.equals(b));
System.out.println("get value is: " +a.get(0));
System.out.println("a index of b value: " +a.indexOf(999));

System.out.println("last Index of:" +a.lastIndexOf(786));


System.out.println("empty value is: " +a.isEmpty());
System.out.println(a);
System.out.println("");
Object [] o=b.toArray();

for(Object i: o) {
	System.out.println(i);
}
	}
}


