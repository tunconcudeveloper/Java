package OOP2;

public class Main {
    public static void main(String[] args) {
        
        Character character = new Character("Warrior",50,200,"Fire");
        Character character1 = new Character("Mage",120,60,"Ice");
        Character character2 = new Character("Archer",150,40,"Earth");
        Character character3 = new Character("Priest",100,100,"Air");


        System.out.println(character.toString());
        System.out.println(character1.toString());
        System.out.println(character2.toString());
        System.out.println(character3.toString());

        character.attack();

        


    }
}
