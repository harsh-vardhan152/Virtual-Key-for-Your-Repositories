package CompanyLockers;

import java.util.*;

public class Menu {

	void screen() {
		System.out.println();
		System.out.println("      DEVELOPED BY HARSH VARDHAN     ");
		System.out.println();
		System.out.println("               LOCKEDME.COM                    ");
		System.out.println();
		System.out.println("   Directory: " + Main.path + "    ");
		System.out.println();
		System.out.println("\n");

	}

	void mainmenu() {
		operations obj = new operations();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter the operation that you want to performed");
			System.out.println("press-1 Display all the file that you created in ascending order");
			System.out.println("press-2 Create the file.");
			System.out.println("press-3 Delete the file that you want to delete");
			System.out.println("press-4 Searching the file that you want to search ");
			System.out.println("press-5 Exit");

			int n = sc.nextInt();
			switch (n) {
			case 1:
				obj.display();
				break;
			case 2:
				obj.create();
				break;
			case 4:
				ArrayList<String> a = obj.search();
				if (a.size() > 0) {

					// System.out.println(a);
					System.out.println("File exists: " + a);

				} else {
					System.out.println("File didn't found ");
				}
				break;
			case 3:
				obj.delete();
				break;
			case 5:

				obj.endScreen();
				break;

			}

		}

	}

}
