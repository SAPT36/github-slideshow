import java.util.Scanner;

public class TestCourse2 {
	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		//course1
		course1.addStudent("LEWIS MONROE");
		course1.addStudent("JESSE BALLARD");
		course1.addStudent("KNOX MORROW");
		course1.addStudent("HANK WILSON");
		course1.addStudent("TREY MOSLEY");	
		course1.addStudent("TIMOTHY LUCAS");
		course1.addStudent("PATRICK MURPHY");
		course1.addStudent("ARLO BURGESS");
		course1.addStudent("OLIVER GLOVER");
		course1.addStudent("MICAH ARNOLD");
		course1.addStudent("LANDON LOVE");
		course1.addStudent("JASMINE HARRINGTON");
		course1.addStudent("AUDREY WISE");
		course1.addStudent("JESSIE CASTRO");
		course1.addStudent("WREN CLARK");
		course1.addStudent("KAYLA WARD");
		course1.addStudent("ISRAEL YATES");
		course1.addStudent("HAYLEY ABBOTT");
		course1.addStudent("JESSICA GOODWIN");
		course1.addStudent("COLT GLOVER");
		course1.addStudent("SABRINA WILKERSON");
		course1.addStudent("ALICIA MILLS");
		course1.addStudent("BYRON PIERCE");
		course1.addStudent("KING OLSEN");
		course1.addStudent("JASPER DRAKE");
		course1.addStudent("MADDOX MOSS");
		course1.addStudent("MARISSA CALLAHAN");
		course1.addStudent("MACK BARNETT");
		course1.addStudent("BRADY STANLEY");
		course1.addStudent("ADRIANNA GATES");
		course1.addStudent("WADE GLENN");
		course1.addStudent("NICOLE FIELDS");	
		//course2
		course2.addStudent("LEWIS MONROE");
		course2.addStudent("HANK WILSON");
		course2.addStudent("LANDON LOVE");
		course2.addStudent("JASMINE HARRINGTON");
		course2.addStudent("AUDREY WISE");
		course2.addStudent("JESSIE CASTRO");
		course2.addStudent("WREN CLARK");
		course2.addStudent("KAYLA WARD");
		course2.addStudent("ISRAEL YATES");
		course2.addStudent("HAYLEY ABBOTT");
		course2.addStudent("JESSICA GOODWIN");
		course2.addStudent("COLT GLOVER");
		course2.addStudent("SABRINA WILKERSON");
		course2.addStudent("ALICIA MILLS");
		course2.addStudent("BYRON PIERCE");
		course2.addStudent("KING OLSEN");
		course2.addStudent("JASPER DRAKE");
		course2.addStudent("MADDOX MOSS");
		course2.addStudent("MARISSA CALLAHAN");
		course2.addStudent("PHOENIX MEYER");
		course2.addStudent("RYLIE GARZA");
		course2.addStudent("FRANK MIRANDA");
		course2.addStudent("IVY SANTIAGO");
		course2.addStudent("WREN CLARK");
		course2.addStudent("MARY TANNER");
		course2.addStudent("ISRAEL YATES");
		course2.addStudent("TRENTON KIRK");
		course2.addStudent("DESTINY ESTRADA");
		course2.addStudent("COLT GLOVER");
		course2.addStudent("SABRINA WILKERSON");
		course2.addStudent("ALICIA MILLS");
		course2.addStudent("LENNON NEAL");
		course2.addStudent("KING OLSEN");
		course2.addStudent("JASPER DRAKE");
		course2.addStudent("MADDOX MOSS");
		course2.addStudent("MARISSA CALLAHAN");
		
		//input
		Scanner input = new Scanner(System.in);
		//outprint
		System.out.println("Number of students in course1: "
		+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
		System.out.print(students[i] + ", ");
		System.out.println();
		System.out.println("Number of students in course2: "
		+ course2.getNumberOfStudents());
		String[] students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
		System.out.print(students[i] + ", ");
		
		int numberOfPeople = input.nextInt();
	}
}
