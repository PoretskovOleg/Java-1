package lesson_6;

public class Dog extends Animal {

    public static final float MAX_RUN = 500f;
    public static final float MAX_JUMP = 0.5f;
    public static final float MAX_SWIM = 10f;

    public Dog(float maxRun, float maxSwim, float maxJump) {
        super.maxRun = maxRun >= 0 ? maxRun : MAX_RUN;
        super.maxSwim = maxSwim >= 0 ? maxSwim : MAX_SWIM;
        super.maxJump = maxJump >= 0 ? maxJump : MAX_JUMP;
    }
}
