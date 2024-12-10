public class Solution25 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String name1 = teclado.nextLine();
        String name2 = teclado.nextLine();

        if(name1.equals(name2)){
            System.out.println("The names are identical");
        }
        else if(name1.length == name2.length){
            System.out.println("The names are the same length");
        }
    }
}
