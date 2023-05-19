package OOP4;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        ChildTwo childTwo = new ChildTwo();

        child.eat();
        child.sleep();
        System.out.println(child.canWalk);
        System.out.println(child.hairColor);

        childTwo.eat();
        childTwo.sleep();
        System.out.println( childTwo.eyeColor);
        System.out.println(childTwo.canTalk);
        
    }
}
