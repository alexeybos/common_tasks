public class RecursionFunctions {

    public long power(long base, long pow) {
        if (pow == 0) {
            return 1;
        }
        return base * power(base, pow - 1);
    }

    public long digitSum(long number) {
        long remainingDigits = number / 10;
        if (remainingDigits == 0) {
            return number;
        }
        return number % 10 + digitSum(remainingDigits);
    }

}
