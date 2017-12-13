import java.util.ArrayList;

public class Map {

    private int x;
    private int y;
    private int z;
    private ArrayList<Object> listOfObjects;
    private ArrayList<MovableObject> listOfMovableObjects;

    public Map(int x, int y, int z, ArrayList<Object> listOfObjects, ArrayList<MovableObject> listOfMovableObjects) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.listOfObjects = listOfObjects;
        this.listOfMovableObjects = listOfMovableObjects;
    }

    public void addMoveableObject(){

    }
    public void addObject(){

    }
}
