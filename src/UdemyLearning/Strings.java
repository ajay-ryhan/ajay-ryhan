package UdemyLearning;

public class Strings {

    public static void main(String[] args) {

        //Learn String
        String sampleString = "Natasha Charlotte";
        System.out.println(sampleString);

        //Find the length of the string
        int stringValue = sampleString.length();
        System.out.println(stringValue);

        //upper and lower case
        String upperCase = sampleString.toUpperCase();
        String lowerCase = sampleString.toLowerCase();
        String combinedDisplay = upperCase + lowerCase;
        System.out.println(upperCase);

        //String and Integer
        System.out.println("The length of the string is:" + stringValue);

        //Using "" within the string (\n - next line, \" - to show content within quotes)
        String hobby = "My hobby is to write poem and read books, my favourite song is from the movie \n\"A star is born\"";
        System.out.println(hobby);
    }
}
