package com.solid.lsp;

public class Square {

    private int area;
    private int side;

    Square(int side) {
        this.side = side;
        this.setSide(side);
    }

    public void setSide(int side) {
        this.area = side * side;
    }

    public int getArea() {
        return this.area;
    }
 
    public int getSide() {
        return this.side;
    }
}
