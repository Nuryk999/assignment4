package part2;

public class DoorWall extends Wall {
    private final Room r1;
    private final Room r2;
    private  boolean isOpen;

    public DoorWall(Room r1, Room r2) {
        super(true);
        this.r1 = r1;
        this.r2 = r2;
        this.isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }
    public void open_the_door() {
        this.isOpen = true;
    }
    public void close_the_door() {
        this.isOpen = false;
    }
}
