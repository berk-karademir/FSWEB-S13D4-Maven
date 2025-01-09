package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int num1, int num2) {
        x = num1;
        y = num2;
    }
    /* getter and setter of X*/
    public int getX() {
        return x;
    }
    public void setX(int num) {
        this.x = num;
    }
    /* getter and setter of Y*/

    public int getY() {
        return y;
    }
    public void setY(int num){
        this.y = num;
    }

    public double distance() {
        return distance(0,0);
    }
    public double distance(Point p) {
        return distance(p.getX(), p.getY());
    }
    public double distance(int a, int b) {
        //√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
      return Math.sqrt(((this.x - a) * (this.x - a)) + ((this.y - b) * (this.y - b)));
    }
}

