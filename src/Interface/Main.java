package Interface;

/**
 * @author Esmee Zhang
 * @date 6/30/20 4:07 下午
 * @projectName JAVA-master-class
 */
public class Main {
    public static void main(String[] args) {
        ITelephone timesPhone;
        timesPhone= new DeskPhone(12345);
        timesPhone.powerOn();
        timesPhone.callPhone(1234556);
        timesPhone.answer();

        timesPhone = new MobilePhone(23455);
        timesPhone.powerOn();
        timesPhone.callPhone(2135);
        timesPhone.answer();
    }

}
