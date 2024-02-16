package addressManagementSystem.src;

import java.util.Scanner;

import static addressManagementSystem.Constant.AddContactMessage.INPUT_NAME_MESSAGE;
import static addressManagementSystem.Constant.AddContactMessage.INPUT_PHONE_NUMBER_MESSAGE;
import static addressManagementSystem.Constant.INPUT_COMPANY_MESSAGE;
import static addressManagementSystem.Constant.PRINT_COMPANY;

public class BusinessContact extends Contact {
    private String company;

    BusinessContact(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public String getCompany() {
        return this.company;
    }

    public static Contact setNewContact() {
        Scanner scan = new Scanner(System.in);

        String name;
        String phoneNumber;

        System.out.print(INPUT_NAME_MESSAGE.getMessage());
        name = scan.next();

        System.out.print(INPUT_PHONE_NUMBER_MESSAGE.getMessage());
        phoneNumber = scan.next();

        boolean isMatch = pattern.matcher(phoneNumber).find();
        if (!isMatch) {
            System.out.println("잘못된 전화번호 형식입니다.");
            return null;
        }

        BusinessContact businessContact = new BusinessContact(name, phoneNumber);

        System.out.print(INPUT_COMPANY_MESSAGE);
        businessContact.company = scan.next();

        return businessContact;
    }

    @Override
    public String getProperty() {
        return PRINT_COMPANY + getCompany();
    }
}
