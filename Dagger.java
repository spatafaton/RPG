import java.util.ArrayList;

public class Dagger extends Weapons {
    
    private String[] daggers = {"Hunting Knife", "Serrated Dagger", "Dirk"};
    

    public Dagger() {
        super();
    }

    @Override
    public ArrayList setDamage() {
        dam1 = (int)(Math.random()*4+1);
        dam2 = (int)(Math.random()*4+1);

        dam.add(dam1);
        dam.add(dam2);
        
       return dam;
    }


    @Override
    public String setWeapon(int weapon) {

        if (weapon == 0) {
            choice = daggers[0];
        } else if (weapon == 1) {
            choice = daggers[1];
        } else if (weapon == 2) {
            choice = daggers[2];
        } 
        return choice;
    }

    @Override
    public String toString() {

        return "Your dagger is swift and strikes twice.\nYour first strike deals " + dam.get(0) + " damage and your second strike deals " + dam.get(1) + " damage.";
    }
   

}
