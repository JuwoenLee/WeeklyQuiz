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

        while(isRun) {
            printInitMessages();

            Scanner scan = new Scanner(System.in);
            int menu = scan.nextInt();

            switch(menu) {
                case 1 :
                    Contact businessContact = BusinessContact.setNewContact();
                    addressBook.addContact(businessContact);
                    break;

                case 2 :
                    Contact personalContact = PersonalContact.setNewContact();
                    addressBook.addContact(personalContact);
                    break;

                case 3 :
                    AddressBook.displayContacts();
                    break;

                case 4 :
                    AddressBook.searchContact();
                    break;

                case 5 :
                    isRun = false;
                    break;
            }
        }
    }
}
