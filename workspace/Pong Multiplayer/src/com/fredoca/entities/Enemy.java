package com.fredoca.entities;

import java.awt.*;

public class Enemy {
    private int x, y, width, height;
    //TODO implementar a inteligência artificial do imimgo
    public Enemy(int x, int y, int width, int height){
        this.x =x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void tick(){

    }
    public void render(Graphics g){

    }
}
