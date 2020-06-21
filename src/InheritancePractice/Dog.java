package InheritancePractice;

/**
 * @author Esmee Zhang
 * @date 6/13/20 2:15 下午
 * @projectName JAVA-master-class
 */
public class Dog extends Animal{
    //use the animal class need to call the constructor class
    //all the paameter will be created
    //unique character
    private int eyes, legs, tail, teeth;
    private String coat;

    public Dog(String name, int brain, int weight,  int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, weight, brain);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("dog. chew called");

    }

    @Override
    public void eat() {
        System.out.println("dog. eat called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("dog. walk is called");
        super.move(5);

    }

    public void run(){
        System.out.println("dog run is called");
        move(10);
    }

    public void movelegs(int speed){
        System.out.println("dog move legs called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog move called");
        movelegs(speed);
        super.move(speed);
    }
}
