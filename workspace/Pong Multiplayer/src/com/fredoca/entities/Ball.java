package com.fredoca.entities;

import com.fredoca.main.Main;

import java.awt.*;
import java.util.Random;
//TODO melhorar a mecânica de movimentação da bola
//TODO implementar a colisão com a bola
public class Ball {
    private int width, height;
    private double x, y, speed;

    public Ball(double x, double y, int width, int height, double speed){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public void tick(){
        double vx, vy;
        Random rand = new Random();
        int ang = rand.nextInt(45);
        double rad = Math.toRadians(ang);
        x+=(speed*Math.sin(rad));
        y+=(speed * Math.cos(rad));
        if(y <= 0 || y >= Main.height -16) speed *=-1;

    }
    public void render(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillRect((int)x, (int)y, width, height);
    }

}
