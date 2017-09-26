/**
 * Created by calvinwebster on 9/26/17.
 */
public class JUnitDemo {
    public static void main (String[] args) {
        System.out.println("youre in the main method");
        try {
            boolean evenForMe = isEvenUnder100(98);
            System.out.println(evenForMe);

        } catch (BadInputException ex) {
            ex.printStackTrace();
        }

        System.out.println(sum2Numbers(2, 4));
    }

    public static boolean isEvenUnder100(int num) throws BadInputException {
        if(num >= 100) {
            throw new BadInputException();
        }

        return num % 2 == 0;
    }

    public static int sum2Numbers (int num1, int num2) {
        return num1 + num2;
    }
}
