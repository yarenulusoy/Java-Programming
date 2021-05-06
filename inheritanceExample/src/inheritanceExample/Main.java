package inheritanceExample;

public class Main {

	public static void main(String[] args) {
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Yaren");
		student.setLastName("Uulsoy");
		student.setMail("ab");
		student.setCourseScore(60);
		
		Instructor instructor=new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setMail("a");
		instructor.setPassword(123);
		instructor.setBranshName("Java");
		
		StudentManager studentManager = new StudentManager();
		studentManager.bestStudent();


		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse();

		
	

	}

}
