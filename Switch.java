public class Switch {
    public static void main(String[] args) {
        
        int age = 24;
        switch(age){
            case 17:System.out.println("You are young");break;
            case 24:System.out.println("You are adult");break;
            case 60:System.out.println("You are elderly");break;
            default:System.out.println("Provide age");break;
        }
    }
}
