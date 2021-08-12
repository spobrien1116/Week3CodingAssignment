public class Week3CodingAssignment {

    public static void main(String[] args) {
        // int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 76};
        System.out.println(ages[ages.length - 1] - ages[0]);
        int averageAge = 0;
        for (int num : ages) {
            averageAge += num;
        }
        System.out.println(averageAge / ages.length);
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        double nameAveLength = 0;
        for (String name : names) {
            nameAveLength += name.length();
        }
        System.out.println(nameAveLength / names.length);
        String allTheNames = new String();
        for (String name : names) {
            allTheNames += name + " ";
        } 
        System.out.println(allTheNames);

        int[] nameLengths = new int[6];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length(); 
        }
        int lengthSum = 0;
        for (int num : nameLengths) {
            lengthSum += num;
        }
        System.out.println(lengthSum);
        String word = "Hello";
        int n = 3;
        System.out.println(wordNumTimes(word, n));
        String firstName = "Shawn";
        String lastName = "O'Brien";
        System.out.println(returnFullName(firstName, lastName));
        int[] pushupsDone = {30, 25, 28, 33};
        System.out.println("Done over 100 pushups this week?: " + isGreaterThan100(pushupsDone));
        double[] scores = {65, 88, 92, 100, 71};
        System.out.println("Average of scores: " + (averageOfDoubles(scores)));
        double[] scoresTeam1 = {64, 14, 93, 52};
        double[] scoresTeam2 = {85, 53, 7, 99};
        System.out.println("Team one scored higher average: " + firstArrayLarger(scoresTeam1, scoresTeam2));
        boolean isHotOutside = true;
        double moneyInPocket = 13.75;
        System.out.println("I will buy a drink: " + (willBuyDrink(isHotOutside, moneyInPocket)));
        int hoursAwake = 11;
        int previousRest = 4;
        isSleepNeeded(hoursAwake, previousRest);
    }

    // Write a method that takes a String word and concatenates itself an int number of times
    public static String wordNumTimes(String phrase, int repeatNum) {
        String finalString = new String();
        for (int i = 0; i < repeatNum; i++) {
            finalString += phrase;
        }
        return finalString;
    }

    // Write a method taking two Strings of first and last name, and returns a String of the two concatenated with a space between
    public static String returnFullName(String first, String last) {
        return first + " " + last;
    }

    // Write a method that takes an array of int and returns true if sum is greater than 100
    public static boolean isGreaterThan100(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return (total > 100);
    }

    // Write a method that takes an array of double and reutnrs the average
    public static double averageOfDoubles(double[] doubles) {
        double sum = 0;
        for (double num : doubles) {
            sum += num;
        }
        return sum / doubles.length;
    }

    // Write a method that takes two arrays of double and returns true if the average of 1st array is greater than 2nd
    public static boolean firstArrayLarger(double[] first, double[] second) {
        double sum1 = 0;
        double sum2 = 0;
        for (double num : first) {
            sum1 += num;
        }
        for (double num : second) {
            sum2 += num;
        }
        return (sum1 / first.length) > (sum2 / second.length);
    }

    // Write a method called willBuyDrink that takes a boolean isHotOutside and a double moneyInPocket and return true
    // if it is hot outside and if moneyInPocket is greater than 10.50.
    public static boolean willBuyDrink(boolean hot, double cash) {
        if (hot == true && cash > 10.5) {
            return true;
        }
        return false;
    }

    // My method that calculates if I need to sleep or if I'm okay for now. Does not return a value.
    public static void isSleepNeeded(int runtime, int rest) {
        if (runtime > 18 && runtime <= 24 && rest >= 6) {
            System.out.println("You can stay up a little longer.");
        } else if (runtime > 24) {
            System.out.println("You've been awake too long, get some sleep!");
        } else if (runtime > 18 && rest < 6) {
            System.out.println("You didn't rest enough yesterday, you need some sleep!");
        } else {
            System.out.println("You are fine for now.");
        }
    }
}