import java.util.Scanner;
// dtl
public class ReadNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = (number % 100) % 10;
        System.out.println(readHundreds(hundreds, tens, ones) + readTens(tens, ones));
    }

    private static String readHundreds(int hundreds, int tens, int ones) {
        String result;
        if (hundreds == 0) {
            result = "";
        } else {
            if (tens == 0 && ones == 0) {
                result = readOnes(hundreds) + " hundred";
            } else {
                result = readOnes(hundreds) + " hundred and ";
            }
        }
        return result;
    }

    private static String readTens(int tens, int ones) {
        String result = "";
        if (tens == 0) {
            result = readOnes(ones);
        } else {
            if (tens == 1) {
                switch (ones) {
                    case 1:
                        result = "eleven";
                        break;
                    case 2:
                        result = "twelve";
                        break;
                    case 3:
                        result = "thirteen";
                        break;
                    case 4:
                        result = "forteen";
                        break;
                    case 5:
                        result = "fifteen";
                        break;
                    case 6:
                        result = "sixteen";
                        break;
                    case 7:
                        result = "seventeen";
                        break;
                    case 8:
                        result = "eighteen";
                        break;
                    case 9:
                        result = "nineteen";
                        break;
                }
            } else {
                switch (tens) {
                    case 2:
                        result = "twenty " + readOnes(ones);
                        break;
                    case 3:
                        result = "thirty " + readOnes(ones);
                        break;
                    case 4:
                        result = "forty " + readOnes(ones);
                        break;
                    case 5:
                        result = "fifty " + readOnes(ones);
                        break;
                    case 6:
                        result = "sixty " + readOnes(ones);
                        break;
                    case 7:
                        result = "seventy " + readOnes(ones);
                        break;
                    case 8:
                        result = "eighty " + readOnes(ones);
                        break;
                    case 9:
                        result = "ninety " + readOnes(ones);
                        break;
                }
            }
        }
        return result;
    }

    private static String readOnes(int ones) {
        String result = "";
        switch (ones) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = " three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
        }
        return result;
    }
}