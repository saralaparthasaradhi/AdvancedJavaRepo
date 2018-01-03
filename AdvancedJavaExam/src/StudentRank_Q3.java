import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

class StudentQ {

	String name;
	int regno;
	int marks;
	public StudentQ(String name,int regno,int marks) {
		this.name= name;
		this.regno=regno;
		this.marks=marks;
		
	}@Override
	public String toString() {
		return ("name is: "+this.name+" reg no. is= "+this.regno+" marks is: "+this.marks);
	}@Override
	public int hashCode() {
		//returns this.name.hashcode()+this.regno.hashcode();
		return Objects.hash(this.name,this.regno,this.marks);
	}
	@Override
	public boolean equals(Object arg0) {

		if(arg0 instanceof StudentQ) {
				return (((StudentQ)arg0).name.equals(this.name));
		}
			return (((StudentQ)arg0).name.equals(this.name));
			//return false;
		
	}
	public String getName() {
		return name;
	}
	public int getRegNo() {
		return regno;
	}
	public int getMarks() {
		return marks;
	}
}
//Sorting by Student names
class StudentNamecomp implements Comparator<StudentQ>{
	public int compare(StudentQ a,StudentQ b) {
		return (a.getName().compareTo(b.getName()));
	}
}

//sorting by Reg No.
class StudentRegnocomp implements Comparator<StudentQ>{
	public int compare(StudentQ a, StudentQ b) {
		if(a.getRegNo()> b.getRegNo()) {
			return 1;
		}else if(a.getRegNo()==b.getRegNo()){
			return 0;
		}else {
			return -1;
		}
	}
}

//Sorting by marks
class StudentMarksComp implements Comparator<StudentQ>{
	public int compare(StudentQ a,StudentQ b) {
		if(a.getMarks()> b.getMarks()) {
			return -1;
		}else if(a.getMarks()== b.getMarks()) {
			return 0;
		}else {
			return 1;
		}
	}
}

public class StudentRank_Q3 {

	public static void main(String[] args) {
		
	
	TreeSet<StudentQ> ele = new TreeSet<StudentQ>(new StudentMarksComp());
	
	StudentQ s1 = new StudentQ("ana", 1,80);
	StudentQ s2 = new StudentQ("becky", 5,50);
	StudentQ s3 = new StudentQ("sam", 3,90);
	StudentQ s4 = new StudentQ("john", 4,70);
	StudentQ s5 = new StudentQ("zack", 2,75);

	
	ele.add(s1);
	ele.add(s2);
	ele.add(s3);
	ele.add(s4);
	ele.add(s5);
	
	Iterator <StudentQ> i = ele.iterator();
	int count =1;
	for(int c = count; c<=3;c++)
		System.out.println(i.next());
	
	}
}


