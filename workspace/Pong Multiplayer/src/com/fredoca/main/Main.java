package com.fredoca.main;

import com.fredoca.entities.Ball;
import com.fredoca.entities.Enemy;
import com.fredoca.entities.Player;
import com.fredoca.entities.Player2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Main extends Canvas implements Runnable, KeyListener {

    public JFrame frame;
    private Thread thread;
    public boolean isRunning;
    public static Player player;
    public static Enemy enemy;
    public static Ball ball;
    public static Player2 player2;

    public static boolean isMultiplayer;
    public static final int width = 1000;
    public static final int height = 600;
    public static final int scale = 1;

    public BufferedImage image;

    public Main(){
        this.addKeyListener(this);
        image = new BufferedImage(width*scale, height*scale, BufferedImage.TYPE_INT_RGB);
        setPreferredSize(new Dimension(width*scale, height*scale));
        player = new Player(0, (height - 150)/2, 20, 150, 2);
        ball = new Ball((width-16)/2, (height-16)/2, 16, 16, 5);
        player2 = new Player2(width - 20, (height - 150)/2, 20, 150, 2);
        initFrame();
    }

    public void initFrame(){
        frame = new JFrame("Pong");
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Você irá jogar multiplayer? (s ou n)");
        String answer = "s";
        if(answer.equals("s")) isMultiplayer = true;
        else isMultiplayer = false;
        Main main = new Main();
        main.start();
    }

    private void start() {
        thread = new Thread(this);
        isRunning = true;
        thread.start();
    }

    public void tick(){
        player.tick();
        if(isMultiplayer) player2.tick();
        else enemy.tick();
        ball.tick();
    }
    public void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            createBufferStrategy(3);
            return;
        }
        Graphics g = image.getGraphics();
        g.setColor(Color.black);
        g.fillRect(0, 0, width*scale, height*scale);
        player.render(g);
        if(isMultiplayer) player2.render(g);
        else enemy.render(g);
        ball.render(g);
        g.dispose();
        g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0, width*scale, height*scale, null);
        bs.show();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W) player.u = true;
        else if(e.getKeyCode() == KeyEvent.VK_S) player.d = true;
        if(e.getKeyCode() == KeyEvent.VK_UP) player2.u = true;
        else if(e.getKeyCode() == KeyEvent.VK_DOWN) player2.d = true;

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W) player.u = false;
        else if(e.getKeyCode() == KeyEvent.VK_S) player.d = false;
        if(e.getKeyCode() == KeyEvent.VK_UP) player2.u = false;
        else if(e.getKeyCode() == KeyEvent.VK_DOWN) player2.d = false;
    }

    @Override
    public void run() {
        requestFocus();
        while(isRunning) {
            tick();
            render();
            try {
                Thread.sleep(1000 / 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
