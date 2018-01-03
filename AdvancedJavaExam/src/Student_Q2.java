import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;


public class Student_Q2 {
	
	public static void main(String[] args) {
	TreeMap<String, Integer> ele = new TreeMap<String, Integer>();
	ele.put("Ana", 1);
	ele.put("John", 2);
	ele.put("Zack", 3);
	ele.put("Ben", 4);
	ele.put("Elena", 5);
	 System.out.println(ele);
	 Set s=ele.entrySet();
		Iterator e=s.iterator();
		while(e.hasNext()){
			Map.Entry me=(Entry) e.next();
			System.out.println("Student Name: "+me.getKey()+" \t Reg. no.: "+me.getValue());
		}
	
	
}
}
