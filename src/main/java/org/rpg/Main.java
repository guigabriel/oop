package org.rpg;

import org.rpg.classes.Mage;
import org.rpg.classes.Tank;
import org.rpg.classes.Warrior;

public class Main {

  public static void main(String[] args)  {

    Mage mage1 = new Mage("Gandalf");
    mage1.getAtkPoints();

    Tank tank1 = new Tank("Mountain");
    tank1.getAtkPoints();

    Warrior warriror1 = new Warrior("Guts");
    warriror1.getAtkPoints();
  }

}