package pl.codegym.task.task13.task1328;

public class Robot extends AbstractRobot implements CanAttack, CanDefend{
    private String name;
    public Robot(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
