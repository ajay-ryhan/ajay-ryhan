package UdemyLearning;

public class ConditionChecker {

    public static void main(String[] args) {

        int compareValue = 15;
        int anotherValue = 45;
        boolean isTrue = compareValue < 40;

        if (isTrue){
            System.out.println("The condition satisfied for 'if' condition");
        } else if (anotherValue == compareValue ){
            System.out.println("The condition satisfied for 'else if' condition");
        } else {
            System.out.println("The condition satisfied for 'else' condition");
        }
    }
}
