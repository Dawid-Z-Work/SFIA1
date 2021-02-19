package sf1;

import java.sql.SQLException;
import java.util.Scanner;


public class runner {

	private static Scanner scan = new Scanner(System.in);
	
	private static String getAction() {
		System.out.println("Enter Table you like to work on");
		return scan.nextLine();
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		sql s = new sql();
		String choosetable = getAction();
		
		try {
			do {
				switch (choosetable) {
				//table employee
				case "employee":
					Employee.employee();
					break;
				
				case "job_title":
					Job_title.job_title();
					break;
				
				case "location":
					Location.location();
					break;
					
				case "restrictions":
					Restrictions.restriction();
					break;
				
				default:
					System.out.println("invalid option");
				}
				choosetable = getAction();
			} while (!choosetable.equals("exit"));
			System.out.println("Goodbye");
		} finally {
		// TODO: handle finally clause
					scan.close();//stop scanner to prevent resource leaked
					s.close();//close connection
		}
		
		
	}

}
