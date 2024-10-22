package org.example.animals;

import org.example.area.Overland;
import org.example.wayOfEating.Herbivorous;

public class Tiger extends Animals implements Herbivorous, Overland{
  @Override
  public void walk() {
    System.out.println("Tiger walk");
  }
  @Override
  public void printEat() {
    System.out.println("Tiger eat beef");
  }
  @Override
  public void eat(String food) {
    if (food.equals("beef") || food.equals("Beef")) {
      System.out.println("Tiger eat beef");
    } else {
      System.out.println("Tiger doesn't eat it");
    }
  }
}