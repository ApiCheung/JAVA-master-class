package GenericChallenge;

/**
 * @author Esmee Zhang
 * @date 7/9/20 5:58 下午
 * @projectName JAVA-master-class
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
