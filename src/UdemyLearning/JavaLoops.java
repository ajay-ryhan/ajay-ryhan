package UdemyLearning;

public class JavaLoops {

    public static void main(String[] args) {
        //Normal 'for' loop
        for (int x = 0; x <= 10; x++) {
            System.out.println("The value for " + x + " loop is: " + x );
        }

        //for each
        String[] studentNames = {"Ajay", "Rifana", "Sara", "Andrew", "Merlin"};
        for (String variableStudent:studentNames){
            System.out.println("The student of our academy:" + variableStudent);
        }

        //while loop
        int y = 0;
        while ( y < 5){
            System.out.println("While Now value is: " + y);
            y++;
        }

        //do while loop
        do {
            System.out.println("Do while value is: " + y);
            y--;
        } while (y > 0);

        //Break condition
        for (int z = 0; z <= 10; z++) {
            System.out.println("Value: " + z);
            if (z == 4) {
                System.out.println("<------------TERMINATE THE LOOP----------->");
                break;
            }
        }

        //Continue
        for (int k = 0; k< 3; k++ ){
            if ( k == 1){
                System.out.println("Skipping:" + k);
                continue;
            }
            System.out.println("Loop for continue statement" + k);
        }
    }
}

