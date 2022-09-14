package CollectionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO code application logic here

		ArrayList<Student> studs = new ArrayList<Student>();
		for (int i = 0; i < 3; i++) {
			studs.add(new Student());
		}

		Scanner sc = new Scanner(System.in);

		double max;
		int i;

		for (i = 0; i < 3; i++) {
			System.out.println("Enter name of student: ");
			studs.get(i).setSname(sc.nextLine());
			System.out.println("Enter marks: ");
			studs.get(i).setTotalmarks(sc.nextInt());
			sc.nextLine();
		}
		int position = 0;
		max = studs.get(0).getTotalmarks();
		for (i = 0; i < 3; i++) {
			if (max < studs.get(i).getTotalmarks()) {
				max = studs.get(i).getTotalmarks();
				position = i;

				System.out.println("position=" + position);
			}
		}
		System.out.println("Highest marks:" + studs.get(position).getTotalmarks() + " student name "
				+ studs.get(position).getSname());
		System.out.println("------------------------------");
		int position1 = 0;
		max = studs.get(0).getTotalmarks();
		for (i = 0; i < 3; i++) {
			if (50 > studs.get(i).getTotalmarks()) {
				max = studs.get(i).getTotalmarks();
				position1 = i;

				System.out.println("position=" + position1);
			}
		}
		System.out.println("Highest marks:" + studs.get(position1).getTotalmarks() + " student name "
				+ studs.get(position1).getSname());

	}
}
