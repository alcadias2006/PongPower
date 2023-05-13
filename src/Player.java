import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class Player implements KeyListener {
    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private int speed;

    public Player(int x, int y, int w, int h, int s)
    {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
        speed = s;
    }

    public int getxPos()
    {
        return xPos;
    }

    public int getyPos()
    {
        return yPos;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int newS)
    {
        speed = newS;
    }







    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }


    public void keyTyped(KeyEvent e) {

    }

}

