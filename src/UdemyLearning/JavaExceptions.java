package UdemyLearning;

public class JavaExceptions {

    public static void main(String[] args) {

        String[] students = {"Ajay", "Rifana", "Marshal", "Lincoln Burrows", "Jason"};
        try {
            System.out.println("Best student in our class is: " + students [5] );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception fired:" + e.getMessage());
        }

        //CharAt
        String name = "Ajay";
        char x = name.charAt(1);
        System.out.println(x);
    }
}
