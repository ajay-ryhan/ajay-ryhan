package UdemyLearning;

public class operators {

    public static void main(String[] args) {

        int a = 400;
        int b = 20;
        //Arithmetic operators
        System.out.println("Add: " + (a + b));
        System.out.println("Sub :" + (a - b));
        System.out.println("Divide: " + a / b);
        System.out.println("Multiply: " + a * b);

        //Increment and Decrement operators
        System.out.println(--a);
        System.out.println(--a);

        System.out.println(++b);
        System.out.println(++b);

        //Assignment operators
        int c = 40;
        c = c + 10;
        System.out.println(c);

        //Alternate
        c += 20;
        System.out.println(c);

        //Comparator
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a != b);

        //logical
        String result = (1000 < 50 && 90 > 70) ? "AND Operator" : (101 < 20 || 60 > 100) ? "OR Operator" : "Confused operator";
        System.out.println(result);
    }
}
