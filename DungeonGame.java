
import java.util.Scanner;


public class DungeonGame {
    

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        Dagger myWeapon0 = new Dagger();
        Sword myWeapon1 = new Sword();
        Axe myWeapon2 = new Axe();
        boolean wepLoop = true;
        int wepChoice = 0;
        boolean storyPath = true;
        int fightOrDie = 0;
        boolean enemyEncounter = true;
        int attackEnemy = 0;
        boolean wepLoop2 = true;
        int wepChoice2 = 0;
        int wepEnchant = 0;
        boolean wepEnchantLoop = true;
        String baseWeapon = "";


        System.out.println("You are a lowly soldier facing judgement for desertion.\n");
        System.out.println("In the past, capital punishment was swift for such a crime, but times have changed. \n");
        System.out.println("The legion's numbers have dwindled from years of battle, morale is at a low.");
        System.out.println("There are also whispers of a mysterious enemy lurking to the East... \n");
        System.out.println("One that is rumored to not be of this world. \n");
        System.out.println();
        System.out.println();
        System.out.println("To pay for your crimes, your commander has given you two options: \n");
        System.out.println("Death by hanging or to travel with him to face this enemy.");
        System.out.println();
        System.out.println();
        System.out.println("What is your decision?");

        while (storyPath) {
            System.out.println("Fight [0] or Die [1]\n");
            fightOrDie = keyboard.nextInt();

            switch(fightOrDie) {
            case 0 :
                storyPath = false;
                System.out.println("This could be your path to redemption. You choose to fight.");
                break;
            case 1 :
                storyPath = true;
                System.out.println("You realize that either choice leads to your death, although one is much quicker.");
                break;
            default :
                System.out.println("A true coward, you decide to run. The rest of your days are spent in exile.");

            }

        }

         while (wepLoop) {
            
            System.out.println("Which weapon will you choose?\n");
            System.out.println("Dagger [0], Sword [1], or Axe [2]?\n");
            wepChoice = keyboard.nextInt();

            switch(wepChoice) {
            case 0 :
                
                while (wepLoop2) {
                
                    System.out.println("Daggers are swift and precise, allowing you to strike your opponent twice.\nSelect your dagger:\nHunting Knife [0], Serrated Dagger [1], Dirk [2]");
                    wepChoice2 = keyboard.nextInt();

                    switch(wepChoice2) {
                    case 0 :
                        
                        baseWeapon = myWeapon0.setWeapon(wepChoice2);
                        System.out.println("You choose your fathers old Hunting Knife.\n");
                        wepLoop2 = false;
                    break;

                    case 1 :
                        
                        baseWeapon = myWeapon0.setWeapon(wepChoice2);
                        System.out.println("A Serrated Dagger is quick, concealable, and can do a lot of damage.\n");
                        wepLoop2 = false;
                    break;

                    case 2 : 
                        
                        baseWeapon = myWeapon0.setWeapon(wepChoice2);
                        System.out.println("A Dirk is a good balance between a sword and a dagger. Quicker than a sword, but larger than a dagger");
                        wepLoop2 = false;
                        break;
                    default :
                        System.out.println("Enter [0], [1], or [2]");
                    }
                }
                
                wepLoop = false;
                break;

            case 1 :                
                while (wepLoop2) {
                
                    System.out.println("Reliable and sturdy, swords deal consistent damage.\nChoose your sword: \nShort Sword [0], Broad Sword [1], Great Sword [2]");
                    wepChoice2 = keyboard.nextInt();

                switch(wepChoice2) {
                case 0 :
                    
                    baseWeapon = myWeapon1.setWeapon(wepChoice2);
                    System.out.println("Short swords work well in small spaces.\n");
                    wepLoop2 = false;
                break;

                case 1 :
                    
                    baseWeapon =myWeapon1.setWeapon(wepChoice2);
                    System.out.println("The Broad Sword. Standard issue in the King's Army.\n");
                    wepLoop2 = false;
                break;

                case 2 : 
                    
                    baseWeapon =myWeapon1.setWeapon(wepChoice2);
                    System.out.println("A Great Sword is a fitting weapon for a brave warrior.\n");
                    wepLoop2 = false;
                    break;
                default :
                    System.out.println("Enter [0], [1], or [2]");
                }
                }
            
            wepLoop = false;
            break;

            case 2 :                
                while (wepLoop2) {
                
                    System.out.println("Axes are strong, heavy weapons. While swinging them in a fit of rage, they can deal a lot of damage to an opponent - or completely miss.\nChoose your axe: \nBattle Axe [0], Hatchet [1], Broad Axe [2]");
                    wepChoice2 = keyboard.nextInt();

                switch(wepChoice2) {
                case 0 :
                
                    baseWeapon =myWeapon2.setWeapon(wepChoice2);
                    System.out.println("Battle Axes require great strength to wield.\n");
                    wepLoop2 = false;
                    break;

                case 1 :
                
                    baseWeapon =myWeapon2.setWeapon(wepChoice2);
                    System.out.println("Hatchet's are a lighter version of an axe, making them more versatile.\n");
                    wepLoop2 = false;
                break;

                case 2 : 
                
                    baseWeapon =myWeapon2.setWeapon(wepChoice2);
                    System.out.println("A Broad Axe is not as heavy as Battle Axe, but more threatening than a Hatchet.\n");
                    wepLoop2 = false;
                    break;
            
                default :
                System.out.println("Enter [0], [1], or [2]");
            }
            }
        
                wepLoop = false;
                break;
            default :
                System.out.println("We don't carry that weapon. Choose from one of the three.\n");
            }


        }
        
        System.out.println("Legion Mages have the ability to channel the power of Deity's to bless your weapon with a random elemental power.\nThe Legion Mages have offered to enchant your weapon, although there is a risk that this process will ruin your blade.\nDo you accept their blessing?\nYes [0], No [1]");
        wepEnchant = keyboard.nextInt();

        while(wepEnchantLoop) {
            switch(wepEnchant) {
                case 0 :
                    switch(wepChoice2) {
                        case 0 :
                        myWeapon0.setEnchantment(wepEnchant);
                        wepEnchantLoop = false;
                        System.out.println("You now wield: " + myWeapon0.addEnchantment1(baseWeapon));
                        break;

                        case 1 :
                        myWeapon1.setEnchantment(wepEnchant);
                        wepEnchantLoop = false;
                        System.out.println("You now wield: " + myWeapon1.addEnchantment1(baseWeapon));
                        break;

                        case 2 :
                        myWeapon1.setEnchantment(wepEnchant);
                        wepEnchantLoop = false;
                        System.out.println("You now wield: " + myWeapon1.addEnchantment1(baseWeapon));
                        break;
                        
                    }
                break;

                case 1 :
                System.out.println("Your distrust for mages and their sorceries makes you ponder their offer.\nYou decide to keep your weapon pure from any magic-meddling.\n");
            }
        }
        
        System.out.println();
        

        while (enemyEncounter) {
            
            System.out.println("You approach an enemy. Do you attack?");
            System.out.println("Attack [0], Run [1]");
            attackEnemy = keyboard.nextInt();

            switch(attackEnemy) {
            case 0 : 
                
                switch(wepChoice) {
                    case 0 :
                    myWeapon0.setDamage();
                    System.out.println("You attack!\n");
                    System.out.println(myWeapon0.toString());
                    break;

                    case 1 :
                    myWeapon1.setDamage();
                    System.out.println("You attack!\n");
                    System.out.println(myWeapon1.toString());
                    break;

                    case 2 :
                    myWeapon2.setDamage();
                    System.out.println("You attack!\n");
                    System.out.println(myWeapon2.toString());
                    break;
                }

                enemyEncounter = false;
                break;
                
            case 1 :
                System.out.println("You stick to the shadows, waiting for the right moment to strike.");
                enemyEncounter = false;
                break;
            default :
                System.out.println("Shhh! You don't want to lose the element of surprise!");
            }
        }


    }
    
}
