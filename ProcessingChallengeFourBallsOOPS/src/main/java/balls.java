import processing.core.PApplet;
public class balls{
    private final int radiusOfCircle;
    private int xAxis;
    private int yAxis;
    PApplet sketch;

    public balls(PApplet fourBalls, int xAxis, int yAxis, int radiusOfCircle) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.radiusOfCircle = radiusOfCircle;
        this.sketch = fourBalls;
    }

    public int getxAxis() {
        return xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public int getRadiusOfCircle() {
        return radiusOfCircle;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

}