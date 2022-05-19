import java.util.ArrayList;

public class Weapons implements Enchantments {

    protected int wepDamage;
    protected int weapon;
    protected String choice;
    protected int dam1;
    protected int dam2;
    protected ArrayList<Integer> dam = new ArrayList<Integer>();
    protected String[] enchantments = {"Fire ", "Frost ", "Shock ", "Rusted "};
    protected String wepEnchant1;
    protected String wepEnchant2;
    


    public Weapons() {
        this.choice = choice; 
        this.weapon = weapon;
        this.wepEnchant1 = wepEnchant1;
    }

    
    public ArrayList setDamage() {
        this.dam = dam;
        
        return dam;
    }

    public String setWeapon(int weapon) {
        return choice;
    }

    public void setEnchantment(int option) {
        int temp = (int)(Math.random()*4);
        
        if (option == 0 && temp == 0) {
            wepEnchant1 = enchantments[0];
        } else if (option == 0 && temp == 1) {
            wepEnchant1 = enchantments[1];
        } else if (option == 0 && temp == 2) {
            wepEnchant1 = enchantments[2];
        } else if (option == 0 && temp == 3) {
            wepEnchant1 = enchantments[3];
        } 
    }

    public String addEnchantment1(String choice) {
        wepEnchant2 = wepEnchant1.concat(choice);

        return wepEnchant2;
    }


    public String toString() {
        return "";
    }
}
