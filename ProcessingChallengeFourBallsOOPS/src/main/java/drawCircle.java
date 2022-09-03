import processing.core.PApplet;

    public class drawCircle {
        balls[] ball;
        PApplet sketch;
        private int speed=0;

        public drawCircle(PApplet sketch, balls[] ball) {
            this.ball = ball;

            this.sketch =  sketch;

            //incrementObject = new IncrementXAxis(circle);
        }

        public void print(){

            for(int i=1;i<=4;i++){
                sketch.ellipse(this.ball[i].getxAxis(),this.ball[i].getyAxis(), this.ball[i].getRadiusOfCircle(), this.ball[i].getRadiusOfCircle());
                this.ball[i].setxAxis(this.ball[i].getxAxis()+i);
            }
        }
    }