import java.awt.Canvas;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Runner extends Canvas implements Runnable{

    private static JFrame frame;
    private Thread thread;
    private boolean running = false;

    public Runner() {
        frame = new JFrame("Pong");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(this);
        frame.setVisible(true);
        this.start();
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop() {
        try {
            thread.join();
            running = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60; //max frame rate
        double ns = 1000000000/amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime)/ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }
            if (running)
                render();
            if (System.currentTimeMillis() - timer > 1000)
                timer += 1000;
        }
    }

    private void render() {
        BufferStrategy b = this.getBufferStrategy();
        if (b == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = b.getDrawGraphics();
        g.dispose();
        b.show();
    }

    private void tick() {

    }

    public static void main(String[] args) {
        new Runner();
    }
}
