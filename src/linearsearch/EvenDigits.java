package linearsearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(numberEvenDigits(arr));
    }

    public static int numberEvenDigits(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int numberEvenDigits = 0;

        for (int i = 0; i < arr.length; i++) {
            if (String.valueOf(arr[i]).length() % 2 == 0) {
                numberEvenDigits++;
            }
        }

        return numberEvenDigits;
    }

    // Optimal method to find the number of digits of a number
    public static int countDigits(int number) {
        if (number < 0) {
            number = number * (-1);
        }

        return (int) (Math.log10(number));
    }


}
