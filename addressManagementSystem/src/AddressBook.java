package addressManagementSystem.src;

import java.util.ArrayList;

import static addressManagementSystem.Constant.*;

public class AddressBook {
    private static ArrayList<Contact> contacts = null;

    public AddressBook() {
        this.contacts = new ArrayList<>();
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
        boolean isSearch = false;
        if (contacts.isEmpty()) {
            System.out.println(EMPTY_ADDRESS_BOOK_MESSAGE);
            return;
        }

        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                isSearch = true;
                System.out.println(PRINT_NAME + contact.getName() + SEPARATOR + PRINT_PHONE_NUMBER + contact.getPhoneNumber() + SEPARATOR + contact.getProperty());
            }
        }

        if(!isSearch) {
            System.out.println(NOT_FOUND_MESSAGE);
        }
    }
}
