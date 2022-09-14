package ExceptionHandleing;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentResult sub = new StudentResult();
		sub.setChemestry(40);
		sub.setMath(80);
		sub.setPysics(40);

		Student stu = new Student();
		stu.setRollno(11);
		stu.setSname("ABC");
		stu.setSaddress("Pune");
		stu.setSrobj(sub);

		if ((sub.getMath() < 40 && sub.getChemestry() < 40) || (sub.getChemestry() < 40 && sub.getPysics() < 40)
				|| (sub.getPysics() < 40 && sub.getMath() < 40)) {
			throw new ResultException("Student fail in two subject");
		}

		System.out.println(stu.toString() + " \nTotal Marks: " + sub.result() + "%");

	}

}
