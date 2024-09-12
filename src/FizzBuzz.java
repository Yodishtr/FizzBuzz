/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        /*for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }*/

        int i = 0;
        while (i < 100) {
            i = getAnInt(i);
        }

    }

    private static int getAnInt(int i) {
        boolean  divisibleby3 = i % 3 == 0;
        boolean  divisibleby5 = i % 5 == 0;

        if (divisibleby3 && divisibleby5) {
            System.out.println(new String("FizzBuzz"));

        } else if (divisibleby3) {
            System.out.println(new String("Fizz"));
        } else if (divisibleby5) {
            System.out.println(new String("Buzz"));
        } else {
            System.out.println(i);
        }

        i = i + 1;
        return i;
    }
}
