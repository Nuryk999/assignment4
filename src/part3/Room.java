package part3;

import java.util.HashMap;
import java.util.Map;

public class Room implements MazePrototype {
    private Map<Direction, Wall> sides;
    private final int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
        sides = new HashMap<>();
    }

    public Wall getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, Wall wall) {
        sides.put(direction, wall);
    }

    public int getRoomNo() {
        return roomNo;
    }

    @Override
    public Room clone() {

        Room room = new Room(roomNo);
        room.sides = new HashMap<>(sides);
        return room;
    }
}