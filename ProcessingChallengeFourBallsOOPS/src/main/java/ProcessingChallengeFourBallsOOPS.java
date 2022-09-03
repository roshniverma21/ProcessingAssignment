import processing.core.PApplet;

import java.util.ArrayList;

public class ProcessingChallengeFourBallsOOPS extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int radiusOfCircle = 10;

    balls[] circle = new balls[10];

    public static void main(String[] args){
        PApplet.main("ProcessingChallengeFourBallsOOPS",args);
    }

    @Override
    public void setup() {
        super.setup();
        for(int i=1;i<=4;i++) {
            circle[i] = new balls(this,0,i*HEIGHT/5,radiusOfCircle);
        }
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle drawCircle = new drawCircle(this,circle);
        drawCircle.print();
    }
}

