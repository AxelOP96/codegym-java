public class Solution10_06 {
    public class Cat {
        private static int catCount = 0;

        public Cat() {
            catCount++;
        }

        public static int getCatCount() {
            return Cat.catCount;

        }

        public static void setCatCount(int catCount) {
            Cat.catCount = catCount;

        }

        public static void main(String[] args) {

        }
    }
}
