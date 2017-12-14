import java.util.ArrayList;

public class Map {

    private int x;
    private int y;
    private int z;
    private ArrayList<Object> listOfObjects;
    private ArrayList<MovableObject> listOfMovableObjects;

    public Map(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.listOfObjects = new ArrayList<>();
        this.listOfMovableObjects = new ArrayList<>();
    }

    public void addMoveableObject(String name, int x, int y, int z, int areaRange, int speed, Character charToAdd){
        MovableObject newObject = new MovableObject(name, x, y, z, areaRange, speed, charToAdd);
        listOfMovableObjects.add(newObject);

    }

    public void addObject(){
        


    }
}
