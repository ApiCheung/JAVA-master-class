package InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Esmee Zhang
 * @date 7/1/20 11:11 上午
 * @projectName JAVA-master-class
 */
public interface ISaveable {
    //felxibility any type of the list
    List<String> write();
    void read(List<String> savedValues);
}
