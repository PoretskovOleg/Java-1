package lesson_6;

public abstract class Animal {

    protected float maxRun;
    protected float maxSwim;
    protected float maxJump;
    private boolean isAction;

    public void run(float length) {
        this.isAction = length > 0 && length <= this.maxRun;
        printInfo("run(" + length + ")");
    }

    public void swim(float length) {
        this.isAction = length > 0 && length <= this.maxSwim;
        printInfo("swim(" + length + ")");
    }

    public void jump(float height) {
        this.isAction = height > 0 && height <= this.maxJump;
        printInfo("jump(" + height + ")");
    }

    private void printInfo(String action) {
        System.out.println(action + ": " + this.isAction);
    }
}
