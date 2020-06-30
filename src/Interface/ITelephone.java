package Interface;

/**
 * @author Esmee Zhang
 * @date 6/30/20 3:20 下午
 * @projectName JAVA-master-class
 */
public interface ITelephone {
    //define the methond return type only int the interface
     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();
}
