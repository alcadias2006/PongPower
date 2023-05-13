import java.awt.event.KeyListener;

public class Enemy {

    private int x;
    private int y;
    private int width;
    private int height;
    private int speed;

    public Enemy(int x, int y, int width, int height, int speed){

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public void move(){

        y += speed;

    }

    /* public void checkCollison(Ball ball){

        if (ball.getX() + ball.getSize() >= x && ball.getX() <= x + width) {

            if(ball.getY() + ball.getSize() >= y && ball.getY() <= y + height){

                ball.setSpeed()

            }


        }

    }*/


}

