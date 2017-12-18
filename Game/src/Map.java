import java.util.ArrayList;

public class Map {

    private final int x;
    private final int y;
    private final int z;
    private ArrayList<ObjectOnMap> listOfObjectsOnMap;
    private ArrayList<MovableObject> listOfMovableObjects;

    public Map(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.listOfObjectsOnMap = new ArrayList<>();
        this.listOfMovableObjects = new ArrayList<>();
    }

    public void addMoveableObject(String name, int x, int y, int z, int areaRange, int speed, Character charToAdd){
        if(!(x > this.x || y > this.y || z > this.z)) {
            MovableObject newObject = new MovableObject(name, x, y, z, areaRange, speed, charToAdd);
            listOfMovableObjects.add(newObject);
        }
    }

    public void addObjectOnMap (ObjectOnMap objectToAdd){
        if(objectToAdd instanceof Tree){
            Tree tree = (Tree) objectToAdd;
            listOfObjectsOnMap.add(tree);
        }
        else if(objectToAdd instanceof Stone){
            Stone stone = (Stone) objectToAdd;
            listOfObjectsOnMap.add(stone);
        }
    }
}
