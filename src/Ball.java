public class Ball {
    private float px, py;// position
    private float vx, vy;// velocity
    private float size;
    private float speed;
    private float  xDelta;
    private float  yDelta;

    public Ball(float direction) {
        px = 0.0F;
        py = 0.0F;
        vx = 0.0F;
        vy = 0.0F;
        size = 0.0F;
        speed = 0.0F;
        this.xDelta =  speed * (float) Math.cos(Math.toRadians(direction));
        this.yDelta =  -speed * (float) Math.sin(Math.toRadians(direction));
    }

    public void setPosition(float px, float py){
        this.px = px;
        this.py = py;
    }

    public float getXPosition(){
        return px;
    }

    public float getYPosition() {
        return py;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getSize() {
        return size;
    }

    /*public void setSpeed(float speed){
        this.speed =
    }*/

    /*public float getSpeed(){


    }*/

}





