package Collection;

import java.util.Map;
import java.util.HashMap;

public class MapDemo {

	public static void main(String[] arg)
	{
		MapDemo obj=new MapDemo();
		obj.search();
	}
	public void search()
	{
	Map<Integer,String> m=new HashMap();
	m.put(1,null);//Associates the specified value with the specified key in this map
	m.put(2,null);
	m.put(3,"sewtha");
    m.put(4,"sarath");
	m.put(3,"ashwin");
	m.put(5,"geetha");
	m.put(6, "satya");
	m.putIfAbsent(2, "kavitha");
	m.putIfAbsent(1,"thiya");//If the specified key is not already associated with a value associates it with the given value and returns null

	System.out.println(m);
	Map<Integer,String> m1=new HashMap(m);
	System.out.println(m.get(1));//Returns the value to which the specified key is mapped,
	
	System.out.println(m.isEmpty());//Returns true if this map contains no key-value mappings.
	System.out.println(m.containsKey(7));//Returns true if this map contains a mapping for the specified key.
	System.out.println(m.containsValue("kavitha"));//Returns true if this map maps one or more keys to the specified value.
	System.out.println(m.equals(m1));//Compares the specified object with this map for equality.
	//m.clear();
	System.out.println(m.remove(1));//Removes the mapping for a key from this map if it is present (optional operation).
	System.out.println(m.remove(2, "kavitha"));//Removes the entry for the specified key only if it is currently mapped to the specified value.
	System.out.println(m.replace(4, "deva"));//Replaces the entry for the specified key only if it is currently mapped to some value.
	System.out.println(m.replace(6,"satya", "pavithra"));//Replaces the entry for the specified key only if currently mapped to the specified value.
	System.out.println(m);
	System.out.println(m.size());//Returns the number of key-value mappings in this map.
    System.out.println(m.entrySet());//Returns a Set view of the mappings contained in this map.
    System.out.println(m.keySet());//Returns a Set view of the keys contained in this map.
    System.out.println(m.values());//Returns a Collection view of the values contained in this map.
	}

}
