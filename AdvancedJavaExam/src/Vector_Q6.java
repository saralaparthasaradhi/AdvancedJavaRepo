import java.util.Vector;

public class Vector_Q6 {

	public static void main(String[] args) {
		Vector<Character> ele=new Vector<Character>();
		ele.add(0,'t');
		ele.add(1,'e');
		ele.add(2,'k');
		ele.add(3,'a');
		ele.add(4,'r');
		ele.add(5,'c');
		ele.add(6,'h');
		
		for(int i=0;i<5;i++) {
		ele.add(2,'z');
		}

		System.out.println(ele);
		for(int i=0;i<5;i++) {
		ele.remove(6);
		}
		
		System.out.println(ele);	

		
	}

}
