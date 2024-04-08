package part2;

import java.util.HashMap;
import java.util.Map;


class Maze {
    private final Map<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room r) {
        rooms.put(r.getRoomNo(), r);
    }

    public Room roomNo(int r) {
        return rooms.get(r);
    }
}








