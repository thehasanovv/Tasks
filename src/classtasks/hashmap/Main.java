package classtasks.hashmap;

import java.util.Arrays;
import java.util.Scanner;

import static classtasks.hashmap.Util.contacts;

public class Main {

    public static void main(String[] args) {

        ContactApp contactApp = new ContactApp(contacts);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Add Contact" +
                    "\n2. Remove contact" +
                    "\n3. Display all contacts" +
                    "\n4. Find contact" +
                    "\n5. Exit");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("Add contact name");
                    String name = sc.nextLine();
                    System.out.println("Add contact number");
                    String number = sc.nextLine();
                    contactApp.addContact(name, number);
                }
                case 2 -> {
                    System.out.println("Add contact name to remove");
                    String name = sc.nextLine();
                    contactApp.removeContact(name);
                }
                case 3 -> {
                    contactApp.findAllContacts();
                }
                case 4 -> {
                    System.out.println("Add contact name to find");
                    String name = sc.nextLine();
                    contactApp.findByContactName(name);
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
