package org.rpg.classes;

import java.util.Random;
import org.rpg.player.Player;

public class Mage extends Player {

  private Integer mana;

  public Mage(String name) {
   super(name, 800, 450, 0.15);
   this.mana = 0;
  }

  public Integer getMana() {
    return mana;
  }

  public void setMana(Integer mana) {
    this.mana = mana;
  }
  @Override
  public int basicAtk() {
    Random r = new Random();
    int randomNum = r.nextInt(2) +1;
    if (randomNum == 1) {
      return (int)(super.getAtkPoints() * 1.8);
    }
    return super.getAtkPoints();
  }
  @Override
  public int especialAtk1() {
    if(getMana() > 0) {
      setAtkPoints((int) (getAtkPoints() + (getAtkPoints() * 0.05)));
      setMana(getMana() - 1);
      return getAtkPoints() * 2;
    }
    return 0;
  }
  @Override
  public void especialAtk2() {
    if(getMana() >= 3) {
      setLifePoints((int) (getLifePoints() + (getLifePoints() * 0.75)));
      setMana(getMana() - 3);
    }
  }
  @Override
  public int especialAtkFinal() {
    if(getMana() >= 5) {
      setAtkPoints((int) ( getAtkPoints() + (getAtkPoints() *0.20)));
      setMana(getMana() - 5);
      return getAtkPoints() * 5;
    }
    return 0;
  }


}
