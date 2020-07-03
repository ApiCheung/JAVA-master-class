package Abstract;

/**
 * @author Esmee Zhang
 * @date 7/3/20 5:05 下午
 * @projectName JAVA-master-class
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
        Parrot parrot = new Parrot("parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Bird penguin = new Penguin("penpen");
        penguin.fly();
    }


}
