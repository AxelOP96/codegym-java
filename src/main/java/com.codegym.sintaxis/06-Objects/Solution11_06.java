public class Solution11_06 {
    //Distancia=
    //(x2−x1)
    //2
    // +(y2−y1)
    //2
    //
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
    }

    public static void main(String[] args) {

    }
}
