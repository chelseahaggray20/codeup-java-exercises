public class GymMembership {
    private Personal personal;
    private String membershipType;
    private double membershipCost;
    private String subscription;
    private boolean active;


    public GymMembership(Personal personal, String membershipType, double membershipCost, String subscription, boolean active) {
        this.personal = personal;
        this.membershipType = membershipType;
        this.membershipCost = membershipCost;
        this.subscription = subscription;
        this.active = active;
    }


//    Setters
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public void setMembershipCost(double membershipCost) {
        this.membershipCost = membershipCost;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

//    Getters


}
