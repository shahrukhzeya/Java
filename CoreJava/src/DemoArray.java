class Student
{
	String name;
	int marks;
}
public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		
		st.name = "Atif";
		st.marks = 94;
		
		st2.name = "Akif";
		st2.marks = 95;
		
		st3.name = "Atik";
		st3.marks = 99;
		
		Student std[] = new Student[3];
		std[0] = st;
		std[1] = st2;
		std[2] = st3;
		
//		for(int i =0; i<3; i++) {
//			System.out.println(std[i].name + " "+ std[i].marks);
//		}
		
		for(Student s: std) {
			System.out.println(s.name + " : "+ s.marks);
		}
		
//		System.out.println(st.name +" "+ st.marks);
//		System.out.println(st2.name +" "+ st2.marks);
//		System.out.println(st3.name +" "+ st3.marks);
		



	}

}
