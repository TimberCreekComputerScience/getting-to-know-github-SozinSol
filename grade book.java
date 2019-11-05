import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {

	public static void main(String[] args) {
	 
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> classRoster = new ArrayList<Student>();
		int option =-1;
		while (option != 5){
			
			System.out.println("Welcome to the GradeBook!\n"
					+ "1) Add New Student\n"
					+"2) Add New Assingnment\n"
					+"3) Print Roster\n"
					+"4) Drop Lowest Grade\n"
					+"5) Exit\n");
			
			option = scan.nextInt();
			scan.nextLine();
			if (option == 1){
				System.out.println("What is the new student's name?");
				String name = scan.nextLine();
				System.out.println("What is their grade level?");
				int grade = scan.nextInt();
				classRoster.add(new Student(name, grade));
			}else if ( option == 2){
				System.out.println("Mass Assign Grade:");
				int grade = scan.nextInt();
				classRoster.add(new S)
			}else if (option == 3){
				for (int i =0; i < classRoster.size(); i++){
					System.out.println(classRoster.get(i).toString());
				}
				System.out.println();
			}else if (option == 4){
				
				
				
			}
			
			
		}
		
		
		

	}

}
