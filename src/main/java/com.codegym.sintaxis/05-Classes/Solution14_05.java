public class Solution14_05 {
    //write your code here
    private int top;
    private int left;
    private int width;
    private int height;

    public Solution14_05(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Solution14_05(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public Solution14_05(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = this.width;
    }
    public Solution14_05(Solution14_05 rectangle){
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }
    public static void main(String[] args) {

    }
}