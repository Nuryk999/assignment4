package part3;

public class MazeGame {
    public static void main(String[] args) {
        MazePrototype prototypeMaze = createPrototypeMaze();
        Maze newGameMaze = (Maze) prototypeMaze.clone();
        Room room1 = newGameMaze.roomNo(1);
    }

    private static MazePrototype createPrototypeMaze() {
        Maze maze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        DoorWall d = new DoorWall(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.NORTH, d);
        r1.setSide(Direction.EAST, new Wall());
        r1.setSide(Direction.SOUTH, new Wall());
        r1.setSide(Direction.WEST, new Wall());
        r2.setSide(Direction.NORTH, new Wall());
        r2.setSide(Direction.EAST, new Wall());
        r2.setSide(Direction.SOUTH, d);
        r2.setSide(Direction.WEST, new Wall());
        return maze;
    }
}
