import processing.core.PApplet;

import java.util.ArrayList;


public class ChallengeBalls extends PApplet {
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int noOfBalls = 4;
    private static ArrayList<Ball> ballArrayList;

    public static void main(String[] args) {
        PApplet.main("ChallengeBalls", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }


    @Override
    public void setup() {
        ballArrayList = new ArrayList<>();
        for (int unit = 1; unit <= noOfBalls; unit++)
            ballArrayList.add(new Ball(unit));
    }


    //    @Override
    public void draw() {
        for (int index = 0; index < noOfBalls; index++) {
            ballArrayList.get(index).drawCircle(this);
        }
    }


}


