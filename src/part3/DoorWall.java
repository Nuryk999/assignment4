package part3;

public class DoorWall extends Wall {
    private Room r1;
    private Room r2;
    private boolean isOpen;

    public DoorWall(Room r1, Room r2) {
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
    @Override
    public DoorWall clone() {

        return new DoorWall(r1, r2);
    }
}

