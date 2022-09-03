import processing.core.PApplet;

public class TryProcessingDemo extends PApplet{
    public static final int WIDTH = 650;
    public static final int HEIGHT = 500;
    public static final int Diameter = 100;
    int x = 0;

    public static void main(String args[])
    {
        PApplet.main("TryProcessingDemo",args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);//used command + alt/options+c to refractor them and bring variables over there
    }

    @Override
    public void setup(){
        //this method is called once
        //ellipse(width,height,100,100);
    }
    public void draw(){

        //super.draw();//this method called many times
        //paintWhite();//if you remove this multiple circle will come on grey screen
        //drawEllipseXAxis();//to move mouse on x
        //drawEllipseBothAxis();//to move mouse in all directions
        drawEllipseMoving();//moving ellipse form left
    }

    //as these all were creating code smell so we extracted the method - because
    // you dont know what 255 s - white color
    private void paintWhite() {
        background(255);
    }
    private void drawEllipseXAxis() {
        ellipse(mouseX,height/2, Diameter, Diameter);
    }
    private void drawEllipseBothAxis() {
        ellipse(mouseX,mouseY,Diameter,Diameter);
    }
    private void drawEllipseMoving() {
        ellipse(x,mouseY,Diameter,Diameter);
        x++;
    }
}
