import java.util.ArrayList;

public class Sword extends Weapons implements Enchantments {

    private String[] swords = {"Short Sword", "Broad Sword", "Great Sword"};
    

    public Sword() {
        super();
    }

    @Override
    public ArrayList setDamage() {
        dam1 = 4 + (int)(Math.random()*3+1);
        

        dam.add(dam1);
        
        
       return dam;
    }

    @Override
    public String setWeapon(int weapon) {

        if (weapon == 0) {
            choice = swords[0];
        } else if (weapon == 1) {
            choice = swords[1];
        } else if (weapon == 2) {
            choice = swords[2];
        } 
        return choice;
    }

    @Override
    public String toString() {

        return "Your trusty sword deals " + dam.get(0) + " damage";
    
    }
}
