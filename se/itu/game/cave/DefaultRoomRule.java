package se.itu.game.cave;

public class DefaultRoomRule extends RoomRule {
  public DefaultRoomRule() {
    // Call the constructor in the super class
    // so that it stores the room and creatureDescription
    super(null, "");
    // Use null - we don't care to store the Room - and "" - we have no description
  }

  @Override
  public void apply() {} // Do nothing!
}
