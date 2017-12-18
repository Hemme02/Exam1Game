public class MovableObject extends ObjectOnMap{

    private int areaRange;
    private boolean alive;
    private int speed;
    private Character character;

    public MovableObject(String name, int x, int y, int z, int areaRange, int speed, Character character) {
        super(name,x,y,z);

        this.areaRange = areaRange;
        this.alive = true;
        this.speed = speed;
        this.character = character;
    }

    public void spawn(){

    }
}
