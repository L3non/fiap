import java.util.Scanner;

public class First {
	// Variables and public objects.
	public static Scanner input = new Scanner(System.in);
	public static String contacts[][] = new String[10][3];
	
	// Procedure to clear the matrix.
	public static void clearMatrix(String mm[][]) {
		// Inserts blank in all cells of the matrix
		for(int l = 0; l < 10; l++) {
			for(int c = 0; c < 3; c++) {
				mm[l][c] = "";
			}
		}
	}

	// Procedure to register a new contact.
	public static void newContact(String mm[][], int l) {
		// Requeste the edit
		System.out.println("FILL THE NEW CONTACT: ");
		System.out.print("Name.........: ");
		mm[l][0] = input.next();
		System.out.print("Number......: ");
		mm[l][1] = input.next();
		System.out.print("E-mail.......: ");
		mm[l][2] = input.next();
	}

	// Procedure to edit a contact.
	public static void editContact(String mm[][], int l) {
		System.out.println("EDIT THE CONTACT: ");
		System.out.print("Name.........: " + mm[l][0] +"");
		System.out.print("Number......: ");
		mm[l][1] = input.next();
		System.out.print("E-mail.......: ");
		mm[l][2] = input.next();
	}

	// Function to return the matrix next blank line.
	public static int nextContactLine(String mm[][]) {
		for(int l = 0; l < 10; l++)
			if (mm[l][0].equals("")) {
				// If found, return the line number.
				return l;
			}
		// -1 Represents full matrix.
		return -1;
	}

	// Procedure to display a contact.
	public static void displayContact(String mm[][], int line) {
		System.out.println("Name........: " + mm[line][0]);
		System.out.println("Number.....: " + mm[line][1]);
		System.out.println("E-mail......: " + mm[line][2]);
	}
	// Procedure to list all recorded contacts.
	public static void listContacts(String mm[][]) {
		System.out.println("CONTACTS LIST: ");
		for(int l = 0; l < 10; l++) {
			if (mm[l][0] != "") {
				displayContact(mm, l);
				System.out.println("------------------------------------------");
			}
		}
		System.out.println("END OF CONTACTS LIST: ");
	}

	// Function to search the contact and return the line.
	public static int searchContact(String mm[][], String n) {
		for(int l = 0; l < 10; l++)
			if (mm[l][0].equals(n)) {
				return l;
			}
		return -1;
	}

	// Procedure to delete a line.
	public static void deleteLine(String mm[][], int l) {
		mm[l][0] = "";
		mm[l][1] = "";
		mm[l][2] = "";
		System.out.println("Contact deleted");
	}

	// Procedure to search and delete a contact.
	public static void deleteContact(String mm[][], String n) {
		int line = searchContact(mm, n);
		String option;
		if (line != -1) {
			displayContact(mm,line);
			System.out.println("Confirm contact deletion?[Y]es or [N]o?");
			option = input.next();
			if (option.equals("y") || option.equals("Y")) {
				deleteLine(mm, line);
			} else {
				System.out.println("Exclusion canceled!");
			}
		} else {
			System.out.println("Contact not found!");
		}

	}

	public static void displayMenu() {
		System.out.println("********* M E N U ********");
		System.out.println("1 - Add a new contact");
		System.out.println("2 - Edit a contact");
		System.out.println("3 - Search a contact");
		System.out.println("4 - Contacts list");
		System.out.println("5 - Delete a contact");
		System.out.println("6 - Leave");
	}

	public static void main(String[] args) {
		int option, line;
		String name;

		// When starting the application, it is always a good idea to clean the matrix so that the "dirt" from the Buffer does not influence the results.
		clearMatrix(contacts);

		do {
			displayMenu();

			// Collects the option chosen by the user.
			System.out.print("Choose a option:");
			option = input.nextInt();
			System.out.println();

			// Selects the selected option..
			switch(option) {
				case 1:
					newContact(contacts, nextContactLine(contacts));
					break;

				case 2:
					System.out.println("EDITING (SEARCH THE CONTACT): ");
					System.out.print("Enter the name.........:");
					name = input.next();
					line = searchContact(contacts, name);
					if (line == -1) {
						System.out.print("Contact not recorded!");
					} else {
						displayContact(contacts, line);
						editContact(contacts, line);
					}
					break;

				case 3:
					System.out.println("SEARCH THE CONTACT: ");
					System.out.print("Enter the name.........:");
					name = input.next();
				    line = searchContact(contacts, name);
					if (line == -1) {
						System.out.print("Contact not recorded!");
					} else {
						displayContact(contacts, line);
					}
					break;

				case 4:
					listContacts(contacts);
				    break;

				case 5:
					System.out.println("DELETING (SEARCH THE CONTACT): ");
					System.out.print("Enter the name.........:");
					name = input.next();
					deleteContact(contacts, name);
					break;

				case 6:
					System.out.print("THANK YOU FOR USING OUR CALENDAR :)");

			}
			System.out.println();
		}while(option != 6);
	}
}