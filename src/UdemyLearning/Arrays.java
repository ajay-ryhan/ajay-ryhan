package UdemyLearning;

public class Arrays {

    public static void main(String[] args) {

        String[] students = {"Ajay", "Rifana", "Mirthun", "Raven", "Natasha"};
        int[] numbers = {40, 41, 42, 43, 44};

        for (int i = 0; i < students.length; i++) {
            System.out.println(numbers[i] + " : " + students[i]);
        }

        students[4] = "Natasha Romanah";
        System.out.println(students[4]);
        System.out.println("The total students value in the Array is :" + students.length);
    }
}
