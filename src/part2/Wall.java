package part2;


public class Wall {
    private boolean hasDoor;

    public Wall() {
        this.hasDoor = false;
    }

    public Wall(boolean hasDoor) {
        this.hasDoor = hasDoor;
    }

    public boolean hasDoor() {
        return hasDoor;
    }

    public void make_door(boolean hasDoor) {
        this.hasDoor = hasDoor;
    }
}
