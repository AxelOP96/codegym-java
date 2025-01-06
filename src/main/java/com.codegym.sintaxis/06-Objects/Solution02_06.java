public class Solution02_06 {
    class Cat
    {


        protected void finalize() throws Throwable
        {
            System.out.println("destroyed");
        }
    }
}
