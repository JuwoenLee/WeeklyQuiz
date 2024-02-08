package addressManagementSystem;

import addressManagementSystem.src.*;

import java.util.Scanner;

import static addressManagementSystem.Constant.*;


public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        boolean flag = true;
        for(InitMessages initMessage : InitMessages.values()) {
            System.out.println(initMessage.getOrder() + ". " + initMessage.getMessage());
        }
        System.out.print(CHOOSE_MENU_MESSAGE);

        Scanner scan = new Scanner(System.in);

        while(flag) {
            int menu = scan.nextInt();
            if(menu >= 1 && menu <= 5) {
                if (menu == InitMessages.ADD_BUSINESS_CONTACT_MESSAGE.getOrder()) {
                    addressBook.addContact(new BusinessContact("오르미", "2", "3"));
                } else if (menu == InitMessages.ADD_PERSONAL_CONTACT_MESSAGE.getOrder()) {
                    addressBook.addContact(new PersonalContact("오름이", "5", "6"));
                } else if (menu == InitMessages.PRINT_CONTACT_MESSAGE.getOrder()) {
                    AddressBook.displayContacts();
                } else if (menu == InitMessages.SEARCH_CONTACT_MESSAGE.getOrder()) {
                    System.out.print(SEARCH_NAME_MESSAGE);
                    String search = scan.next();
                    AddressBook.searchContact(search);

                } else if (menu == InitMessages.EXIT_MESSAGE.getOrder()) {
                    flag = !flag;
                }
            }
        }
    }
}