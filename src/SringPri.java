/**
 * @author Esmee Zhang
 * @date 6/3/20 4:35 下午
 * @projectName learning
 */
public class SringPri {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString =" this is a string";
        System.out.println(myString);
        myString = myString +" and this is more.";
        System.out.println(myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString +myInt;
        System.out.println(lastString);
        //会将int当成string直接加在后面。
    }
}
