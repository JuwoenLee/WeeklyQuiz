package addressManagementSystem.src;

import java.util.Scanner;

import static addressManagementSystem.Constant.*;
import static addressManagementSystem.Constant.AddContactMessage.*;

public class PersonalContact extends Contact {
    private String relationship;


    public PersonalContact(String name, String phoneNumber) {
        super(name, phoneNumber);
    }


    public String getRelationship() {
        return this.relationship;
    }

    public static Contact setNewContact() {
        Scanner scan = new Scanner(System.in);

        String name;
        String phoneNumber;

        System.out.print(INPUT_NAME_MESSAGE.getMessage());
        name = scan.next();

        System.out.print(INPUT_PHONE_NUMBER_MESSAGE.getMessage());
        phoneNumber = scan.next();

        PersonalContact personalContact = new PersonalContact(name, phoneNumber);

        System.out.print(INPUT_RELATIONSHIP_MESSAGE);
        personalContact.relationship = scan.next();

        return personalContact;
    }

    @Override
    public String getProperty() {
        return PRINT_RELATIONSHIP + getRelationship();
    }
}
