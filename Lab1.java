import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input

        System.out.println("Input first number:");
        int firstNumber = input.nextInt();
        System.out.println("Input second number:");
        int secondNumber = input.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        System.out.println(firstNumber + " mod " + secondNumber + " = " + (firstNumber % secondNumber));

        // ---------------------------------------------------------------------------------------------------

//        2. Write a Java program that takes a number as input and prints its multiplication table up to
//        10.

//        System.out.println("Enter a number: ");
//        int number = input.nextInt();
//        for(int i = 1; i <= 10; i++){
//            System.out.println(number + " * " + i + " = " + (number*i));
//        }

        // ----------------------------------------------------------------------------------------------------

//        3. Write a Java program to print the area and perimeter of a circle.
//        double radius = 7.5;
//        double pi = Math.PI;
//        System.out.println("Perimeter: " + (2 * pi * radius));
//        System.out.println("Area: " + (pi * radius * radius));

        // -----------------------------------------------------------------------------------------------------------

//        4. Java program to find out the average of a set of integers

//         System.out.println("Please enter count of numbers: ");
//         int countOfNumbers = input.nextInt();
//         int number;
//         double average = 0;
//
//        // Loop through countOfNumbers, with each iteration it counts the sum of numbers and then assign the total to the average
//         for(int i = 1; i <= countOfNumbers; i++) {
//             System.out.println("Enter an integer: ");
//             number = input.nextInt();
//             average = average + number;
//         }
//
//        System.out.println(average / countOfNumbers);

        // ----------------------------------------------------------------------------

//        5. Write a Java program that accepts three integers as input, adds the first two integers
//        together, and then determines whether the sum is equal to the third integer.

//        System.out.println("Input first number: ");
//        int number1 = input.nextInt();
//        System.out.println("Input second number: ");
//        int number2 = input.nextInt();
//        System.out.println("Input third number: ");
//        int number3 = input.nextInt();
//
//        int sum = number1 + number2;
//        if(sum == number3) {
//            System.out.println("The result is: true");
//        } else{
//            System.out.println("The result is: false");
//        }

        // ---------------------------------------------------------------------------------

//        6. Write a Java program to reverse a word.

//        System.out.println("Input a word: ");
//        String word = input.nextLine();
//
//        String reverse = "";
//        char ch;
        // The loop start from last index to the first, and by using the charAt method we can take each character and put them in the reverse variable in a reversed order.
//        for(int i = word.length() - 1; i >= 0; i--) {
//            ch = word.charAt(i);
//            reverse = reverse + ch;
//        }
//        System.out.println(reverse);

// -----------------------------------------------------------------------------------------------

//        7 - Java program to check whether the given number is even or odd

//        System.out.println("Enter a number: ");
//        int number = input.nextInt();
//
//        if(number % 2 == 0){
//            System.out.println("The number is even");
//        } else
//            System.out.println("The number is odd");


        // --------------------------------------------------------------------------------------------------

//        8 - Java program to convert the temperature in Centigrade to Fahrenheit

//        System.out.println("Enter a Centigrade: ");
//        double centigrade = input.nextDouble();
//
//        double conversion = (centigrade * 1.8) + 32;
//        System.out.println("Temperature in Fahrenheit is: " + conversion);


        // -----------------------------------------------------------------------------------------------------

//        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.

//        System.out.println("Input a String: ");
//        String text = input.nextLine();
//        System.out.println("Input a number: ");
//        int number = input.nextInt();
//
//        char ch = text.charAt(number);
//        System.out.println(ch);


        // -----------------------------------------------------------------------------------------------------------

//        10. Write a Java program to print the area and perimeter of a rectangle.

//        double width = 5.5;
//        double height = 8.5;
//
//        System.out.println("Area is " + width + " * " + height + " = " + (width*height));
//        System.out.println("Perimeter is " + 2 + " * " + " (" + width + "+" + height + ") " + " = " + 2 *(width+height));


        // ------------------------------------------------------------------------------------------------------------------------

//        11. Write a Java program to compare two numbers.

//        System.out.println("Input first integer: ");
//        int first = input.nextInt();
//        System.out.println("Input second integer: ");
//        int second = input.nextInt();
//
                // if first not equal second then there's only one operator to print, that's why we put it in an if statement by itself.
//            if(first != second) {
//            System.out.println(first + " != " + second);
//            }

//            if (first > second) {
//                System.out.println(first + " > " + second);
//                System.out.println(first + " >= " + second);
//            } else if (first < second) {
//                System.out.println(first + " < " + second);
//                System.out.println(first + " <= " + second);
//            }  else {
//                System.out.println(first + " == " + second);
//            }


        // ----------------------------------------------------------------------------------------------------------------------

//         12.Write a Java program to convert seconds to hours, minutes and seconds.

//        System.out.println("Input seconds: ");
//        int inputSeconds = input.nextInt();
//
//        int hours = inputSeconds / 3600; // divide the inputSeconds by 3600 (60 minutes * 60 seconds) to get the total hours
//        int minutes = (inputSeconds / 60) % 60; // converts total seconds into minutes then takes the remaining minutes within one hour (minutes % 60)
//        int seconds = inputSeconds % 60; // calculating the remaining seconds after extracting the minutes
//
//        System.out.println(hours + ":" + minutes + ":" + seconds);

        // --------------------------------------------------------------------------------------------------------------------

//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.

//        System.out.println("Input first number: ");
//        int number1 = input.nextInt();
//        System.out.println("Input second number: ");
//        int number2 = input.nextInt();
//        System.out.println("Input third number: ");
//        int number3 = input.nextInt();
//        System.out.println("Input fourth number: ");
//        int number4 = input.nextInt();
//
//        // split the numbers entered by the user into three sets
//        boolean firstCompare = (number1 == number2);
//        boolean secondCompare = (number3 == number4);
//        boolean thirdCompare = (number2 == number3);
//
//
//        // check if all three sets are equal
//        if(firstCompare && secondCompare && thirdCompare ) {
//            System.out.println("Numbers are equal");
//        } else
//            System.out.println("Numbers are not equal");


        // --------------------------------------------------------------------------------

//    14. Write a Java program that reads an integer and check whether it is negative, zero, or
//    positive.

//        System.out.println("Input a number: ");
//        int number = input.nextInt();
//
//        if (number > 0){
//            System.out.println("Positive number");
//        } else if(number == 0) {
//            System.out.println("Zero");
//        } else {
//            System.out.println("Negative number");
//        }

        // ------------------------------------------------------------------------------------------

//        15.Write a program to enter the numbers till the user wants and at the end it
//        should display the count of positive, negative and zeros entered (End loop use -1 , Don’t count -1).

//        int number;
//        int positiveCounter = 0;
//        int negativeCounter = 0;
//        int zeroCounter = 0;
//       do{
//           System.out.println("Enter any numbers, enter 0 to exit:");
//            number= input.nextInt();
//           if(number > 0){
//               positiveCounter++;
//           } else if(number < 0 && number != -1){
//               negativeCounter++;
//           } else {
//               zeroCounter++;
//           }
//
//       } while(number != -1);
//        System.out.println("Positive numbers: " + positiveCounter);
//        System.out.println("Negative numbers: " + negativeCounter);
//        System.out.println("Zeros: " + zeroCounter);

        // ---------------------------------------------------------------------------------------

//        16 - Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed.

//        System.out.println("Input numbers to reverse: ");
//        int number = input.nextInt();
//
//        int reminder;
//        int reverse = 0;
//
//        while(number != 0) {
//            reminder = number % 10; // extract the last digit of the number
//            reverse = reverse * 10 + reminder; // add a new digit and shift previous digit to the left
//            number = number / 10; // remove the last digit of number
//        }
//
//        System.out.println(reverse);
// ----------------------------------------------------------------------------------------------------------

//        17 - Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.

//        System.out.println("Enter count of numbers: ");
//        int countNumbers = input.nextInt();
//
//        System.out.println("Enter a number: ");
//        int number = input.nextInt(); // read first number
//        int largest = number; // initialize the largest with the first input value
//        int smallest = number; // initialize the smallest with the first input value
//
//
//        // This for loop starts from the second input
//        for (int i = 1; i < countNumbers; i++) {
//            System.out.println("Enter a number: ");
//            number = input.nextInt();
//
//            // update largest if current number is greater
//            if (number > largest) {
//                largest = number;
//            }
//            // update smallest if current number is smaller
//            if (number < smallest) {
//                smallest = number;
//            }
//        }
//
//        System.out.println("Largest: " + largest);
//        System.out.println("Smallest: " + smallest);




//        18 - Determine and print the number of times the character ‘a’ appears in the input
//        entered by the user.

//        System.out.println("Enter String: ");
//        String text = input.nextLine();
//
//        int aCounter = 0;
//        char ch;
//        for(int i = 0; i < text.length(); i++) {
//            ch = text.charAt(i);
//            if(ch == 'a'){
//                aCounter++;
//            }
//        }
//
//        System.out.println("Number of a's: " + aCounter);
//

    }

}
