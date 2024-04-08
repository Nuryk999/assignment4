package part2;

public interface MazeBuilder {
    void buildRooms();
    void buildWalls();
    void buildDoors();
    Maze getMaze();
}