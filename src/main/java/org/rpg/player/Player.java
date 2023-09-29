package org.rpg.player;

public abstract class Player {

  private String characterName;
  private int lifePoints;
  private int atkPoints;
  private double defPoints;

  protected Player(
    String name,
    int lifePoints,
    int atkPoints,
    double defPoints
  ) {
    this.characterName = name;
    this.lifePoints = lifePoints;
    this.atkPoints = atkPoints;
    this.defPoints = defPoints;
  }
  public String getCharacterName() {
    return characterName;
  }

  public void setCharacterName(String characterName) {
    this.characterName = characterName;
  }
  public float getLifePoints() {
    return lifePoints;
  }
  public void setLifePoints(int lifePoints) {
    this.lifePoints = lifePoints;
  }
  public Integer getAtkPoints() {
    return atkPoints;
  }
  public void setAtkPoints(int atkPoints) {
    this.atkPoints = atkPoints;
  }
  public double getDefPoints() {
    return defPoints;
  }
  public void setDefPoints(Integer defPoints) {
    this.defPoints = defPoints;
  }

  public abstract int basicAtk();
  public abstract int especialAtk1();
  public abstract void especialAtk2();
  public abstract int especialAtkFinal();

}
