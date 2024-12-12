import org.skillsmart.lesson4.Stack;

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

    public int listLength(Stack<Integer> list) {
        if (list.pop() == null) {
            return 0;
        }
        return 1 + listLength(list);
    }

    public boolean isPalindrome(String str) {
        char[] chars = str.replaceAll("[^a-zA-Zа-яА-ЯЁё]", "").toLowerCase().toCharArray();
        return isLettersEqual(chars, 0, chars.length - 1);
    }

    private boolean isLettersEqual(char[] chars, int headIndex, int tailIndex) {
        if (headIndex == tailIndex || headIndex + 1 == tailIndex) return chars[headIndex] == chars[tailIndex];
        if (chars[headIndex] != chars[tailIndex]) return false;
        return isLettersEqual(chars, headIndex + 1, tailIndex - 1);
    }
}


