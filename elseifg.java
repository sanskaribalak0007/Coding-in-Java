public class elseifg {
    public static void main(String[] args) {
        int age = 21;
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        }
        else if(age >= 13 && age <=18){
            System.out.println("You are teenager,not elgible to vote.");
        }
        else{
            System.out.println("you are children.");
        }
    }
}
