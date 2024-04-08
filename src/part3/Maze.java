package part3;

import java.util.HashMap;
import java.util.Map;

public class Maze implements MazePrototype {
    private final Map<Integer, Room> rooms;

    public Maze() {
        rooms = new HashMap<>();
    }

    public void addRoom(Room room) {
        rooms.put(room.getRoomNo(), room);
    }

    public Room roomNo(int roomNumber) {
        return rooms.get(roomNumber);
    }

    @Override
    public MazePrototype clone() {

        Maze maze = new Maze();
        for (Room room : rooms.values()) {
            maze.addRoom(room.clone());
        }
        return maze;
    }
}







