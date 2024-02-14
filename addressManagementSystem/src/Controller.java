package addressManagementSystem.src;

import addressManagementSystem.Constant;

import java.util.Scanner;

import static addressManagementSystem.Constant.*;

public class Controller {

    private static void printInitMessages() {
        System.out.println();
        for(Constant.InitMessages initMessage : Constant.InitMessages.values()) {
            System.out.println(initMessage.getOrder() + ". " + initMessage.getMessage());
        }
        System.out.print(CHOOSE_MENU_MESSAGE);
    }

    public Controller() {
        AddressBook addressBook = new AddressBook();
        boolean isRun = true;

        try(Scanner scan = new Scanner(System.in)) {
            while (isRun) {
                printInitMessages();

                switch (scan.nextInt()) {
                    case 1:
                        Contact businessContact = BusinessContact.setNewContact();
                        addressBook.addContact(businessContact);
                        break;

                    case 2:
                        Contact personalContact = PersonalContact.setNewContact();
                        addressBook.addContact(personalContact);
                        break;

                    case 3:
                        addressBook.displayContacts();
                        break;

                    case 4:
                        System.out.print(SEARCH_NAME_MESSAGE);
                        addressBook.searchContact(scan.next());
                        break;

                    case 5:
                        isRun = false;
                }
            }
        }
    }
}
