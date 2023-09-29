package org.rpg.classes;

import java.util.Random;
import org.rpg.player.Player;

public class Tank extends Player {

  private int stamina;

  public Tank (String name) {
    super(name, 3000, 150, 0.7);
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
    int randomNum = r.nextInt(10) +1;
    if (randomNum == 1) {
      return (int) ( getAtkPoints() * 1.8);
    }
    return getAtkPoints();
  }

  @Override
  public int especialAtk1() {
    if(getStamina() > 0) {
      setAtkPoints((int) (getAtkPoints() + (getAtkPoints() * 0.05)));
      setStamina(getStamina() - 1);
      return getAtkPoints() * 2;
    }
    return 0;
  }

  @Override
  public void especialAtk2() {
    if(getStamina() >= 3){
      setLifePoints((int) (getLifePoints() + (3000 * 0.2)));
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
