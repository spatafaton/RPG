import java.util.ArrayList;

public class Axe extends Weapons implements Enchantments {
    private String[] axes = {"Battle Axe", "Hatchet", "Broad Axe"};
    

    public Axe() {
        super();
    }

    @Override
    public ArrayList setDamage() {
        dam1 = (int)(Math.random()*13);
        
        dam.add(dam1);
        
        return dam;
    }

    @Override
    public String setWeapon(int weapon) {

        if (weapon == 0) {
            choice = axes[0];
        } else if (weapon == 1) {
            choice = axes[1];
        } else if (weapon == 2) {
            choice = axes[2];
        } 
        return choice;
    }

    @Override
    public String toString() {

        return "In a rage, you swing your mighty axe for " + dam.get(0) + " damage";
    
    }
}
