public class Solution01_06 {
    class Cat
    {
        String name;

        Cat(String name)
        {
            this.name = name;
        }

        protected void finalize() throws Throwable
        {
            System.out.println(name + " destroyed");
        }
    }
}
