package addressManagementSystem.src;

public class BusinessContact extends Contact {
    private String company;
    public BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }
}