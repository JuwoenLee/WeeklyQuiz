package addressManagementSystem.src;

import java.util.Scanner;

import static addressManagementSystem.Constant.*;
import static addressManagementSystem.Constant.AddContactMessage.*;

public class BusinessContact extends Contact {
    private String company;

    BusinessContact() {

    }

    public String getCompany() {
        return this.company;
    }

    public static Contact setNewContact() {
        Scanner scan = new Scanner(System.in);
        BusinessContact businessContact = new BusinessContact();

        System.out.print(INPUT_NAME_MESSAGE.getMessage());
        businessContact.name = scan.next();

        System.out.print(INPUT_PHONE_NUMBER_MESSAGE.getMessage());
        businessContact.phoneNumber = scan.next();

        System.out.print(INPUT_COMPANY_MESSAGE);
        businessContact.company = scan.next();

        return businessContact;
    }

    @Override
    public String getProperty() {
        return PRINT_COMPANY + getCompany();
    }
}
