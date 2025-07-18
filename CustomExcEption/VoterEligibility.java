package ExcEption.CustomExcEption;

public class VoterEligibility extends Exception {

    String message;

    public VoterEligibility(String message){
       this.message= message;
    }

    public String  getInfo(){
        return message;
    }
}
