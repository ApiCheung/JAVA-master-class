import java.util.ArrayList;

/**
 * @author Esmee Zhang
 * @date 6/25/20 12:28 下午
 * @projectName JAVA-master-class
 */
//wrapper
class IntClass{
    private int myValue;
    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

//autoboxing
public class AutoboxandUnbox {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[]  intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(42));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArralyList = new ArrayList<Integer>();
        for(int i = 0; i <=10 ; i++){
            intArralyList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <=10 ; i++){
            System.out.println(i + "-->" + intArralyList.get(i).intValue());
        }

        Integer myInValue = Integer.valueOf(56);
        int myInt = myInValue;//myInt.intValue((;

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        //boxing
        for(double dbl = 0.0; dbl <= 10.0; dbl+=0.5){
            //没有 double.valueof也能运行， java在后台的工作
            myDoubleValues.add(Double.valueOf(dbl));

        }
        //unboxing

        for(int i =0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " " +  value);
        }






        //intger is a class
    }
}
