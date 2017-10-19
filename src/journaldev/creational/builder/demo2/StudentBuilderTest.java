package journaldev.creational.builder.demo2;

public class StudentBuilderTest {

	public static void main(String[] args) {
		Student student1 = new Student.StudentBuilder("Allex","Mengi",
				"435552","amengi@sch.com").setmName("Pepe").build();
		Student student2 = new Student.StudentBuilder("Falisi","Benachi",
				"675652","benachis@sch.com").setPhoneNumber("+25478553395").build();
		System.out.println(student1.toString());
		System.out.println(student2.toString());
	}

}
