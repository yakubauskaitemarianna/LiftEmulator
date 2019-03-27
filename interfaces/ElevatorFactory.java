package main.java.com.joeblau.ecs.interfaces;

import main.java.com.joeblau.ecs.impl.enums.ElevatorDirection;
import main.java.com.joeblau.ecs.impl.enums.ElevatorStatus;

public interface ElevatorFactory {
  public void moveUp();
  public void moveDown();
  public void addNewDestinatoin(Integer destination);
  public ElevatorDirection direction();
  public ElevatorStatus status();

}
