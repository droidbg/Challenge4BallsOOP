import processing.core.PApplet;

class Ball extends PApplet {

    private static final int DIAMETER = 10;
    private static final int HEIGHT = 480;
    private int ballXPos = 0;

    private final int unitPerFrame;

    Ball(int unitPerFrame) {
        this.unitPerFrame = unitPerFrame;
    }


    public void drawCircle(PApplet pApplet) {
        pApplet.ellipse(ballXPos, (float) (unitPerFrame * HEIGHT) / 5, DIAMETER, DIAMETER);
        ballXPos += unitPerFrame;
    }
}