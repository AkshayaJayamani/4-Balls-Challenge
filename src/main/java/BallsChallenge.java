import processing.core.PApplet;

public class BallsChallenge extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;
    int w = 1;
    int x = 1;
    int y = 1;
    int z = 1;

    public static void main(String[] args) {
        PApplet.main("BallsChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        getBall(w, HEIGHT);
        w++;
        getBall(x, 2 * HEIGHT);
        x+=2;
        getBall(y, 3 * HEIGHT);
        y+=3;
        getBall(z, 4 * HEIGHT);
        z+=4;
    }

    private void getBall(int w, int height) {
        ellipse(w, height / 5, DIAMETER, DIAMETER);
    }
}
