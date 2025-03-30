public class Assignment1 {
    //    1
    //    linear - O(N)
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    //    2
    //    linear - O(N)
    public static double findAverage(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] * 1.0 / arr.length + findAverage(arr, n - 1);
    }

    //    3
    //    linear - O(N)
    private static boolean isPrimeRecursive(int n, int divisor) {
        if (divisor == 1) {
            return true;
        } else if (n % divisor == 0) {
            return false;
        }
        return isPrimeRecursive(n, divisor - 1);
    }

    public static boolean isPrime(int n) {
        return isPrimeRecursive(n, n / 2);
    }

    //    4
    //    linear - O(N)
    public static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }

    //    5
    //    exponential - O(2^N)
    public static int findFibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    //    6
    //    linear - O(N)
    public static int findDegree(int a, int n) {
        if (n == 1) {
            return a;
        }
        return a * findDegree(a, n - 1);
    }

    //    7
    //    ? - O(N!)
    private static String findPermutationsRecursive(char[] tabs, int index) {
        if (index == tabs.length - 1) {
            return new String(tabs) + "\n";
        }
        StringBuilder result = new StringBuilder();
        for (int i = index; i < tabs.length; i++) {
            char temp = tabs[index];
            tabs[index] = tabs[i];
            tabs[i] = temp;
            result.append(findPermutationsRecursive(tabs, index + 1));
            tabs[i] = tabs[index];
            tabs[index] = temp;
        }
        return result.toString();
    }

    public static String findPermutations(String tab) {
        return findPermutationsRecursive(tab.toCharArray(), 0);
    }

    //    8
    //    linear - O(N)
    private static boolean isDigitRecursive(String s, int n) {
        if (n == s.length()) {
            return true;
        } else if (!Character.isDigit(s.charAt(n))) {
            return false;
        }
        return isDigitRecursive(s, n + 1);
    }

    public static boolean isDigit(String s) {
        return isDigitRecursive(s, 0);
    }

    //    9
    //    exponential - O(2^N)
    public static int findBinomicalCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return findBinomicalCoefficient(n - 1, k - 1) + findBinomicalCoefficient(n - 1, k);
    }

    //    10
    //    logarithmic - O(logN)
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(findGCD(10, 7));
    }
}
