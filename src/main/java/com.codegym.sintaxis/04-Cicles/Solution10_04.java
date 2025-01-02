import java.util.Scanner;

public class Solution10_04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int example = teclado.nextInt();
        if(example>=0 && example < 3 || example>=5 && example < 8 ||
                example>=10 && example < 13 || example>=15 && example < 18 ||
                example>=20 && example < 23 || example>=25 && example < 28 ||
                example>=30 && example < 33 || example>=35 && example < 38 ||
                example>=40 && example < 43 || example>=45 && example < 48 ||
                example>=50 && example < 53 || example>=55 && example < 58){
            System.out.println("green");
        }
        else if(example>=3 && example < 4 || example>=8 && example < 9 ||
                example>=13 && example < 14 || example>=18 && example < 19 ||
                example>=23 && example < 24 || example>=28 && example < 29 ||
                example>=33 && example < 34 || example>=38 && example < 39 ||
                example>=43 && example < 44 || example>=48 && example < 49 ||
                example>=53 && example < 54 || example>=58 && example < 59){
            System.out.println("yellow");
        }
        else{
            System.out.println("red");
        }
    }
}
