package OOP3;

public class Main {
    public static void main(String[] args) {
        Skill skill = new Skill();
        Character character = new Character("Warrior");
        Character character2 = new Character("Mage");

        skill.attack(character2);
        skill.defend(character);

    }
}
