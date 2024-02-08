package addressManagementSystem.src;

import java.util.ArrayList;
import java.util.List;

import static addressManagementSystem.Constant.*;

public class AddressBook {
    private static List<Contact> contacts = new ArrayList<>();

    public AddressBook() {
//        contacts.add(contact);
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public static void displayContacts() {

        if (contacts.isEmpty()) {
            System.out.println(EMPTY_ADDRESS_BOOK_MESSAGE);
        } else {
            for (Contact contact : contacts) {
                System.out.println(PRINT_NAME + contact.getName() + SEPARATOR + PRINT_PHONE_NUMBER + contact.getPhoneNumber() + SEPARATOR);
            }
        }
    }

    public static Contact searchContact(String name) {
        if (contacts.isEmpty()) {
            System.out.println(EMPTY_ADDRESS_BOOK_MESSAGE);
            return null;
        }

        for(Contact contact : contacts) {
            if(contact.getName().equals(name)) {
                System.out.println(PRINT_NAME + contact.getName() + SEPARATOR + PRINT_PHONE_NUMBER + contact.getPhoneNumber() + SEPARATOR);
                return contact;
            }
        }
        System.out.println(NOT_FOUND_MESSAGE);
        return null;
    }
}
