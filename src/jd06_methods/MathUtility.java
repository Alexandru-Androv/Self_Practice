package jd06_methods;

public class MathUtility {
    public static void main(String[] args) {
        int result = calculate(10, '-',20);
        System.out.println("result = " + result);
        double result2= calculate(2.5,'*',3.0);
        System.out.println("result = " + result2);
        int result3= square(9);
        System.out.println("result3 = " + result3);
        double result4= square(1.5);
        System.out.println("result4 = " + result4);
        int result5= cube(3);
        System.out.println("result5 = " + result5);
        double result6= cube(2.5);
        System.out.println("result6 = " + result6);


    }

    public static int calculate(int num1, char mathOperator,int num2) {
        boolean vallid = mathOperator == '+' || mathOperator == '-' || mathOperator == '*'
                || mathOperator == '/' || mathOperator == '%';
        if (!vallid) {
            return 0;
        }
        int result = (mathOperator == '+') ? num1 + num2 : (mathOperator == '-') ? num1 - num2
                : (mathOperator == '*') ? num1 * num2 : (mathOperator == '/') ? num1 / num2
                : num1 % num2;
        return result;
    }
    public static double calculate(double num1, char mathOperator,double num2) {
        boolean vallid = mathOperator == '+' || mathOperator == '-' || mathOperator == '*'
                || mathOperator == '/' || mathOperator == '%';
        if (!vallid) {
            return 0;
        }
        double result2 = (mathOperator == '+') ? num1 + num2 : (mathOperator == '-') ? num1 - num2
                : (mathOperator == '*') ? num1 * num2 : (mathOperator == '/') ? num1 / num2
                : num1 % num2;
        return result2;
    }
    public static int square(int num){
        int result3 =num*num;
        return result3;
    }public static double square(double num){
        double result4 =num*num;
        return result4;
    }
    public static int cube(int num){
        int result5 =num*num*num;
        return result5;
    }
    public static double cube(double num){
        double result6 =num*num*num;
        return result6;
    }
}
/* 5. Create a class named MathUtility:

	5.1 Create a method named calculate that takes three arguments (Two integers and a char) and returns the result based on the operator.

		If the operator is +:
			The method should return the addition of the two numbers

		If the operator is -:
			The method should return the subtraction of the two numbers

		If the operator is *:
			The method should return the multiplication of the two numbers

		If the operator is /:
			The method should return the multiplication of the two numbers

	for any other operators, the method should return 0
			Example:
				int result = calculate(10, '+', 20);

			Output:
				30
	5.2 Overload the calculate method to handle double numbers.

			Example:
				double result = calculate(2.5, '*', 3.0);

			Output:
				7.5

	5.3 Create a method named square that takes an int and returns the square, hierarchically calling the
	calculate method to calculate the square.

			Example:
				int num = square(8);

			Output:
				64

	5.4 Overload the square method for double numbers.

			Example:
				double num = square(1.5);

			Output:
				2.25

	5.5 Create a method named cube that takes an int and returns the cube, hierarchically calling the
	square method to calculate the cube.

			Example:
				int num = cube(3);

			Output:
				9

	5.6 Overload the cube method for double numbers.

			Example:
				double num = cube(2.5);

			Output:
				15.625

 */
