package addressManagementSystem.src;

public class Contact {
    protected String name;
    protected String phoneNumber;

    Contact() {

    }

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
