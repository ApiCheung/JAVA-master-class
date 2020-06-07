/**
 * @author Esmee Zhang
 * @date 6/2/20 8:17 下午
 * @projectName learning
 */
public class PrimitiveTypeChanllenge {
    public static void main(String[] args) {
        byte byteVariable = 64;
        short shortVariable = 20;
        int intVariable= 20;
        long longVariable = 50000L + 10L * (byteVariable + shortVariable + intVariable);
        System.out.println(longVariable);

        short shortTotal = (short) (1000 + 10 * (byteVariable + shortVariable));

        int myIntValue=5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;

    }
}
