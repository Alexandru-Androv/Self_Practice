package jd06_methods;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        double n= max(10.5, 30.2);
        System.out.println("maximum number is = " + n);
        int m= min(100,200);
        System.out.println("minimum = " + m);
    }
    public static int max(int n, int m){
        if(n>m) {
            return  n;
        }else {
            return m;
        }
    }
    public static double max(double n, double m) {
        if (n > m) {
            return n;
        } else {
            return m;
        }
    }
    public static int min(int n, int m) {
        if (n < m) {
            return n;
        } else {
            return m;
        }
    }
    public static double min(double n, double m) {
        if (n < m) {
            return n;
        } else {
            return m;
        }
    }
}
/* 3. Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.
			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100

 */