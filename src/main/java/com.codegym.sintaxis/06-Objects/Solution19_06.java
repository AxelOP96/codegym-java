public class Solution19_06 {
    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    //write your code here
    public static class Idea{
        private String description;

        public String getDescription(){
            return this.description;
        }
    }
}
