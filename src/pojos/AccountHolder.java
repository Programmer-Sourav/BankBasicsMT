package pojos;

public class AccountHolder {
    private String firstName;

    public AccountHolder(String firstName, String lastName, String address, String phNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phNo = phNo;
    }

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    private String address;
    private String phNo;
}
