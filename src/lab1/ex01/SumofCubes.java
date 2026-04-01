package lab1.ex01;

public class SumofCubes {
    public static void main(String[] args) {
        int number = 153;
        int sum = 0;

        // 1. Convert the number to text (String)
        String numberText = String.valueOf(Math.abs(number));

        // 2. Go through each character one by one
        for (int i = 0; i < numberText.length(); i++) {
            
            // 3. Turn the character back into a single digit
            int digit = Character.getNumericValue(numberText.charAt(i));

            // 4. Cube it and add to the total
            sum += (digit * digit * digit);
        }

        System.out.println("The sum is: " + sum);
    }
}
