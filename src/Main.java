import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    public static int getRandomIntInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static double getRandomDoubleInRange(double min, double max) {

        Random random = new Random();
        return random.nextDouble()*(max - min) + min;
    }

    public static String inputCheckString(String[] strings) {
        String input;

        while (true) {
            Scanner myInput = new Scanner(System.in);

            input = myInput.nextLine();

            try {
                if (Arrays.stream(strings).anyMatch(input::equals))
                    break;
                else
                    throw new WrongInputException("Wrong input");
            } catch (WrongInputException e) {
                System.out.println(e.getMessage());
            }
        }
        return input;
    }

    public static int inputCheckNumberInRange(int min, int max) {

        int number;

        while (true) {
            Scanner myInput = new Scanner(System.in);
            try {
                number = myInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input must be an Integer");
                continue;
            }
            try {
                if (number > min && number <= max)
                    break;
                else
                    throw new WrongInputException("Wrong number");
            } catch (WrongInputException e) {
                System.out.println(e.getMessage());
            }
        }
        return number;
    }

    public static int[] getRandomArrayOfNIntsInRange(int n, int min, int max) {
       int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomIntInRange(min,max);
        }
        return array;
    }


}