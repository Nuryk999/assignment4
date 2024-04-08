package part2;

public class GameDirector {
    private final MazeBuilder builder;

    public GameDirector(MazeBuilder builder) {
        this.builder = builder;
    }

    public Maze constructMaze() {
        builder.buildRooms();
        builder.buildWalls();
        builder.buildDoors();
        return builder.getMaze();
    }
}