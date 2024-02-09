package addressManagementSystem.src;

import java.util.ArrayList;
import java.util.List;

import static addressManagementSystem.Constant.*;

public class AddressBook {
    private static List<Contact> contacts = new ArrayList<>();

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

    public static void searchContact(String name) {
        if (contacts.isEmpty()) {
            System.out.println(EMPTY_ADDRESS_BOOK_MESSAGE);
        }
        else {
            for (Contact contact : contacts) {
                if (contact.getName().equals(name)) {
                    System.out.println(PRINT_NAME + contact.getName() + SEPARATOR + PRINT_PHONE_NUMBER + contact.getPhoneNumber() + SEPARATOR + contact.getProperty());
                }
            }
            return;
        }
        System.out.println(NOT_FOUND_MESSAGE);
    }
}
