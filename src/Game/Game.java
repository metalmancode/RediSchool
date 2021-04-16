package Game;

import java.util.Random;

public class Game {
    public static void main(String[] args) {
        String winner="";
        int max = 0;
        Gun gun = new Gun();
        Reporter p = new Reporter();
        Sword sword = new Sword();
        Warior human1 = new Warior();
        Warior human2 = new Warior();
        Warior human3 = new Warior();
        Warior human4 = new Warior();
        Warior human5 = new Warior();
        Warior[] human = new Warior[5];
        human1.setName("Reza");
        human2.setName("Alex");
        human3.setName("John");
        human4.setName("Tom");
        human5.setName("Sam");
        human[0] = human1;
        human[1] = human2;
        human[2] = human3;
        human[3] = human4;
        human[4] = human5;


        for (int i = 0; i < 20; i++) {
            Random rand = new Random();
            int upperbound = 5;
            int attacker = rand.nextInt(upperbound);
            int defender = rand.nextInt(upperbound);
            if (attacker != defender) {
                System.out.println(human[attacker].getName() + " is attacking");
                System.out.println(human[defender].getName() + " is defending");
                for (int j = 0; j < 2; j++) {
                    Random weaponSelect = new Random();
                    int upperSelect = 2;
                    int selected = weaponSelect.nextInt(upperSelect);
                    switch (selected) {
                        case 1:
                            human[j].setWeapon(gun);
                            break;
                        case 2:
                            human[j].setWeapon(sword);
                            continue;
                    }


                }
                human[attacker].attack(human[defender]);
            } else continue;


        }
        for (int i = 0; i < human.length; i++) {
            p.Report(human[i].getName(), human[i].health);


            if (max < human[i].health) {
                max = human[i].health;
                winner = human[i].getName();
            }

        }
        System.out.println(winner + " is the winner and his final point is " + max);

    }

}
