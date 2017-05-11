package se.itu.game.cave;

import java.util.HashMap;
import java.util.Map;

public class RuleBook implements ThingRule{
  private static Map<Thing,ThingRule> rules = new HashMap<Thing, ThingRule>();
  private static Map<Room,RoomRule> roomRules = new HashMap<Room, RoomRule>();

  public static ThingRule getRuleFor(Thing thing){
    ThingRule rule = rules.get(thing);
    if(rule == null){
      rule = () -> {return true;};
    }
    return rule;
  }
  public static RoomRule getRuleFor(Room room){
    RoomRule rule = roomRules.get(room);
    if(rule == null){
      rule = new RoomRule(null,""){@Override public void apply(){}};
    }
    return rule;
  }
  public static void addThingRule(Thing thing, ThingRule rule){
    rules.put(thing, rule);
  }
  public static void addRoomRule(Room room, RoomRule rule){
    roomRules.put(room, rule);
  }
  @Override
  public boolean apply(){
    return true;
  }
}
