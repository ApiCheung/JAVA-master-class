package InheritanceCH;

/**
 * @author Esmee Zhang
 * @date 6/15/20 12:53 下午
 * @projectName JAVA-master-class
 */
public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction){
        this.currentVelocity += direction;
        System.out.println("Vehivle.steer() Steering at " + currentDirection + "degrees.");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("vehicle.move() moving at" + currentVelocity + "in direction" + currentDirection);
    }

    public String getName(){
        return name;
    }

    public String getSize(){
        return size;
    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
