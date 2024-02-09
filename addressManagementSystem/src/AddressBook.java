package addressManagementSystem.src;

import java.util.ArrayList;
import java.util.Scanner;

import static addressManagementSystem.Constant.*;

public class AddressBook {
    private static final ArrayList<Contact> contacts = new ArrayList<>();

    public AddressBook() {

    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public static void displayContacts() {

        if (contacts.isEmpty()) {
            System.out.println(EMPTY_ADDRESS_BOOK_MESSAGE);
        } else {
            for (Contact contact : contacts) {
                System.out.println(PRINT_NAME + contact.getName() + SEPARATOR + PRINT_PHONE_NUMBER + contact.getPhoneNumber() + SEPARATOR + contact.getProperty());
            }
        }
    }

    public static void searchContact() {
        Scanner scan = new Scanner(System.in);

        System.out.print(SEARCH_NAME_MESSAGE);

        String name = scan.next();

        if (contacts.isEmpty()) {
            System.out.println(EMPTY_ADDRESS_BOOK_MESSAGE);
            return;
        }

        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(PRINT_NAME + contact.getName() + SEPARATOR + PRINT_PHONE_NUMBER + contact.getPhoneNumber() + SEPARATOR + contact.getProperty());
                return;
            }
        }

        System.out.println(NOT_FOUND_MESSAGE);
    }
}
