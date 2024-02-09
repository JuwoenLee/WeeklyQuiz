package addressManagementSystem.src;

import java.util.Scanner;

import static addressManagementSystem.Constant.*;
import static addressManagementSystem.Constant.AddContactMessage.*;

public class PersonalContact extends Contact {
    private String relationship;

    PersonalContact() {

    }

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    public String getRelationship() {
        return this.relationship;
    }

    public static Contact getNewContact() {
        Scanner scan = new Scanner(System.in);
        PersonalContact personalContact = new PersonalContact();

        System.out.print(INPUT_NAME_MESSAGE.getMessage());
        personalContact.name = scan.next();

        System.out.print(INPUT_PHONE_NUMBER_MESSAGE.getMessage());
        personalContact.phoneNumber = scan.next();

        System.out.print(INPUT_RELATIONSHIP_MESSAGE);
        personalContact.relationship = scan.next();

        return personalContact;
    }

    @Override
    public String getProperty() {
        return PRINT_RELATIONSHIP + getRelationship();
    }
}
