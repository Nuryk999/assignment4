package part2;

public class StandardMazeBuilder implements MazeBuilder {
    private final Maze maze;

    public StandardMazeBuilder() {
        this.maze = new Maze();
    }

    @Override
    public void buildRooms() {

        for (int i = 1; i <= 4; i++) {
            maze.addRoom(new Room(i));
        }
    }

    @Override
    public void buildWalls() {

        for (int i = 1; i <= 4; i++) {
            Room room = maze.roomNo(i);

            room.setSide(Direction.NORTH, new Wall());
            room.setSide(Direction.EAST, new Wall());
            room.setSide(Direction.SOUTH, new Wall());
            room.setSide(Direction.WEST, new Wall());
        }
    }

    @Override
    public void buildDoors() {

        Room room1 = maze.roomNo(1);
        Room room2 = maze.roomNo(2);
        Room room3 = maze.roomNo(3);
        Room room4 = maze.roomNo(4);


        room1.setSide(Direction.NORTH, new DoorWall(room1, room2));
        room2.setSide(Direction.SOUTH, new DoorWall(room2, room1));
        room2.setSide(Direction.EAST, new DoorWall(room2, room3));
        room3.setSide(Direction.WEST, new DoorWall(room3, room2));
        room3.setSide(Direction.SOUTH, new DoorWall(room3, room4));
        room4.setSide(Direction.NORTH, new DoorWall(room4, room3));
    }

    @Override
    public Maze getMaze() {
        return this.maze;
    }
}



