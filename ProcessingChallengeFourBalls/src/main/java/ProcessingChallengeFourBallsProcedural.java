import processing.core.PApplet;

public class ProcessingChallengeFourBallsProcedural extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int Diameter = 10;
    int speed1=0, speed2=0,speed3=0, speed4=0;

    public static void main(String args[])
    {
        PApplet.main("ProcessingChallengeFourBallsProcedural",args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    public void draw(){
        paintWhite();
        drawEllipseMovingOne();
        drawEllipseMovingTwo();
        drawEllipseMovingThree();
        drawEllipseMovingFour();
    }

    private void drawEllipseMovingOne() {

        ellipse(speed1,(height)/5,Diameter,Diameter);
        speed1++;
    }
    private void drawEllipseMovingTwo() {
        ellipse(speed2,(height*2)/5,Diameter,Diameter);
        speed2+=2;
    }
    private void drawEllipseMovingThree() {
        ellipse(speed3,(height*3)/5,Diameter,Diameter);
        speed3+=3;
    }
    private void drawEllipseMovingFour() {
        ellipse(speed4,(height*4)/5,Diameter,Diameter);
        speed4+=4;
    }

    private void paintWhite() {
        background(255);
    }

}