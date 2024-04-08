package part2;

public class Main {
    private final MazeBuilder builder;

    public Main(MazeBuilder builder) {
        this.builder = builder;
    }

    public Maze createGame() {
        builder.buildRooms();
        builder.buildWalls();
        builder.buildDoors();
        return builder.getMaze();
    }

    public static void main(String[] args) {

        MazeBuilder standardBuilder = new StandardMazeBuilder();
        GameDirector gameDirector = new GameDirector(standardBuilder);
        Maze standardMaze = gameDirector.constructMaze();


        Room room1 = standardMaze.roomNo(1);
        Room room2 = standardMaze.roomNo(2);
        DoorWall door = new DoorWall(room1, room2);
    }
}

