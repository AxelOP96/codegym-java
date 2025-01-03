public class Solution11_02 {
    public static class Cat{
        public Cat(){}
    }
    public static void main(String[] args) {
        Cat kitty = new Cat();
        Cat smokey = null;
        smokey = kitty;
        kitty = null;
          }
}
