public class Solution05_06 {
    public class Cat {
        public static int catCount = 0;

        public Cat(){
            catCount++;
        }
        protected void finalize() throws Throwable
        {
            catCount--;
        }

        public static void main(String[] args) {

        }
    }
}
