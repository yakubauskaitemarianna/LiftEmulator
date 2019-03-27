package main.java.com.joeblau.ecs.interfaces;

public interface ElevatorControlSystemFactory {
  public void pickUp(Integer pickUpFloor);
  public void destination(Integer elevatorId, Integer destinationFloor);
  public void step();

}
