package com.fredoca.entities;

import com.fredoca.main.Main;

import java.awt.*;

public class Player {
    protected int x, y, width, height, speed = 2;
    public boolean u, d;

    public Player(int x, int y, int width, int height, int speed){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void tick(){
        if(y < 0) y = 0;
        else if(y + height > Main.height) y = Main.height - height;
        else if(u) y -= speed;
        else if(d){
            y+=speed;
        }
    }
    public void render(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(x, y, width, height);
    }
}
