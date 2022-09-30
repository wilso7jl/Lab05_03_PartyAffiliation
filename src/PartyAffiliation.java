public class PartyAffiliation {
    public static void main(String[] args) {
        String partyAffiliation ="";
        System.out.println("What is your party? (D, R, or I?)");
        partyAffiliation = "D";
        if(partyAffiliation == "D"){
            System.out.println("You are a donkey");
        }else if(partyAffiliation == "R"){
            System.out.println("You are an elephant");
        }else if(partyAffiliation == "I"){
            System.out.println("You are an eagle");
        }else{
            System.out.println("invalid response");
        }
    }
}