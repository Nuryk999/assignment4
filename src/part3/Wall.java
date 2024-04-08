package part3;

public class Wall implements MazePrototype {

    @Override
    public Wall clone() {
        return new Wall();
    }
}
