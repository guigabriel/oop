package org.rpg.classes;

import java.util.Random;
import org.rpg.player.Player;

public class Warrior extends Player {
  private int stamina;

  public Warrior(String name) {
    super(name, 1000, 300, 0.4);
    this.stamina = 0;
  }

  public int getStamina() {
    return stamina;
  }

  public void setStamina(int stamina) {
    this.stamina = stamina;
  }

  @Override
  public int basicAtk() {
    Random r = new Random();
    int randomNum = r.nextInt(5)+1;
    if (randomNum == 1) {
      return (int) (getAtkPoints() * 1.8);
    }
    return getAtkPoints();
  }

  @Override
  public int especialAtk1() {
    if(getStamina() > 0) {
      setStamina(getStamina() - 1);
      return getAtkPoints() * 2;
    }
    return 0;
  }

  @Override
  public void especialAtk2() {
    if(getStamina() >=3) {
      setLifePoints((int) (1000 * 0.3));
      setStamina(getStamina() - 3);
    }
  }

  @Override
  public int especialAtkFinal() {
    if(getStamina() >= 5) {
      setStamina(getStamina() - 5);
      return getAtkPoints() * 5;
    }
    return 0;
  }
}
