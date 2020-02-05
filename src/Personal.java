public class Personal {
    public String firstName;
    public String lastName;
    private int weight;
    private int memberID;
    private String[] goals;


    //    Constructor Method
    public Personal(String first, String last, int weight, int memberID, String[] goals) {


        this.firstName = first;
        this.lastName = last;
        this.weight = weight;
        this.memberID = memberID;
        this.goals = goals;
    }

//    Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;

    }

    public void setLastName(String lastName){
        this.lastName = lastName;

    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setMemberID(int memberID){
        this.memberID = memberID;
    }



//    Getters
    public int getWeight(){
        return this.weight;
    }

    public int getMemberID(){
        return this.memberID;
    }


}