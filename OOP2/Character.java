package OOP2;

public class Character {
    
    String type;
    int damage;
    int defense;
    String element;
    
    Character(String type,int damage,int defense,String element){
        this.type = type;
        this.damage = damage;
        this.defense = defense;
        this.element = element;
    }
    void attack(){
        System.out.println(this.type +" is attacking.");
    }

    public String toString(){
        return "Type :"+type +"\nDamage :"+ damage +"\nDefense :"+ defense +"\nElement :"+ element;
    }
}
