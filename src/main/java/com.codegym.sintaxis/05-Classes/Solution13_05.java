/*
* - centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color*/
public class Solution13_05{


public class Circle {
    //write your code here
    private int centerX;
    private int centerY;
    private int radius;
    private String color;
    private int width;

    public Circle(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public Circle(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public Circle(int centerX, int centerY, int radius, int width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}
}