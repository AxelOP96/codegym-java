public class Solution03_06 {
    public class Cat {
        public static void main(String[] args) {

        }

        //write your code here
        protected void finalize() throws Throwable
        {
            System.out.println("A Cat was destroyed");
        }
    }
    public class Dog{

        protected void finalize() throws Throwable
        {
            System.out.println("A Dog was destroyed");
        }
    }

}
