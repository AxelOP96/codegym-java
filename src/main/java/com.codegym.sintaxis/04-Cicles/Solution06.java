public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        Cat.fullName = fullName;
    }

    public static void main(String[] args) {

    }
}
