package finalstatement;

/**
 * @author Esmee Zhang
 * @date 8/27/20 1:42 下午
 * @projectName JAVA-master-class
 */
public class Main {
    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());;
    }


}
