package AbstrctChallenge;

import java.util.List;

/**
 * @author Esmee Zhang
 * @date 7/3/20 6:11 下午
 * @projectName JAVA-master-class
 */
public interface NodeList {
    List getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void tranverse(ListItem root);
}
