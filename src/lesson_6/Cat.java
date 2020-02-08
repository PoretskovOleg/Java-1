package lesson_6;

public class Cat extends Animal{

    public static final float MAX_RUN = 200f;
    public static final float MAX_JUMP = 2f;
    public static final float MAX_SWIM = 0f;
    public static int countCats = 0;

    public Cat(float maxRun, float maxSwim, float maxJump) {
        countCats++;
        super.maxRun = maxRun >= 0 ? maxRun : MAX_RUN;
        super.maxSwim = maxSwim >= 0 ? maxSwim : MAX_SWIM;
        super.maxJump = maxJump >= 0 ? maxJump : MAX_JUMP;
    }
}
