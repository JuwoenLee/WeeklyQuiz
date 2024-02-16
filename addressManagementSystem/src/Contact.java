package addressManagementSystem.src;

import java.util.regex.Pattern;

public class Contact {
    private String name;
    private String phoneNumber;
    public static Pattern pattern = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getProperty() {
        return "";
    }


}
