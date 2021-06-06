package com.fredoca.entities;

import com.fredoca.main.Main;

import java.awt.*;

public class Player2 extends Player{
    public Player2(int x, int y, int width, int height, int speed) {
        super(x, y, width, height, speed);
    }
    public void tick(){
        if(y < 0) y = 0;
        else if(y + height > Main.height) y = Main.height - height;
        if(u) y-=speed;
        else if(d) y+=speed;

    }
    public void render(Graphics g){
        g.setColor(Color.green);
        g.fillRect(x, y, width, height);
    }
}
