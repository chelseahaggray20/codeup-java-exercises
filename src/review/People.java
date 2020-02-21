package review;

public class People {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String secondaryStreetAddress; // (This may be blank)
    private String city;
    private String state;
    private String countryCode;
    private String zipCode;
    private String mainPhone;
    private String secondPhone;

    public People(String firstName, String lastName, String streetAddress, String secondaryStreetAddress,
                  String city, String state, String zipCode, String countryCode, String mainPhone, String secondPhone) {
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.streetAddress = streetAddress.trim();
        this.secondaryStreetAddress = secondaryStreetAddress.trim();
        this.city = city.trim();
        this.state = state.trim();
        this.zipCode = zipCode.trim();
        this.countryCode = countryCode.trim();
        this.mainPhone = mainPhone.trim();
        this.secondPhone = secondPhone.trim();
    }

    public String toString() {
        return String.format("[[firstName=%s], [lastName=%s], [streetAddress=%s], [secondaryStreetAddress=%s], " +
                        "[city=%s], [state=%s], [zipCode=%s], [countryCode=%s], [mainPhone=%s], [secondPhone=%s]]\n",
                firstName, lastName, streetAddress, secondaryStreetAddress,
                city, state, zipCode, countryCode, mainPhone, secondPhone);
    }

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

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getSecondaryStreetAddress() {
        return secondaryStreetAddress;
    }

    public void setSecondaryStreetAddress(String secondaryStreetAddress) {
        this.secondaryStreetAddress = secondaryStreetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMainPhone() {
        return mainPhone;
    }

    public void setMainPhone(String mainPhone) {
        this.mainPhone = mainPhone;
    }

    public String getSecondPhone() {
        return secondPhone;
    }

    public void setSecondPhone(String secondPhone) {
        this.secondPhone = secondPhone;
    }
}