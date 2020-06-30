package Interface;

/**
 * @author Esmee Zhang
 * @date 6/30/20 1:14 下午
 * @projectName JAVA-master-class
 */
public class GearBox {
    private boolean clutchIsIn;

    public void operateClutch(boolean inOrOut){
        this.clutchIsIn = inOrOut;
    }
}
