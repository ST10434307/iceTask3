/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.validityofstrings;

//import java.util.Scanner;

/**
 *
 * @author Huawei i5 CCM
 */
import java.util.Scanner;
public class ValidityOfStrings 
{

    public static void main(String[] args)
    {
        //declarations of the cases needed to be tested 
        String testA = "{}{)}";
        String testB = " ";
        String testC = "{[}]";
        String testD = "()";
        String testE = "({[]})";

        System.out.println(testA + "is Invalid:" + isValid(testA));
        System.out.println(testB + "is Invalid:" + isValid(testB));
        System.out.println(testC + "is Invalid:" + isValid(testC));
        System.out.println(testD + "is Valid:" + isValid(testD));
        System.out.println(testE + "is Valid:  " + isValid(testE));
        
        //question2 work and initialising
        int limit = 20;// this value may be changed according to how big or small you want the limit.
        int result = odd_squares_sum(limit);
        System.out.println("The sum of the squares of the odd numbers up to the limit"  +  limit   +  "is : "   + result);
        
        //question 3
        //input your own value and the highest common factor will be given between the two values
        //double value = highestCommonFactor(60,  80);System.out.println("The Highest Common Factor is:  " + value);
        
        Scanner sc = new Scanner(System.in);
        //the following lines of code prompts the user to enter values.
        System.out.println("Input the first number of your choice.");
        double myNum1 = sc.nextDouble();
        System.out.println("The first value you have entered is :" + myNum1);
        
        System.out.println("Input the second number of your choice.");
        double myNum2 = sc.nextDouble();
        System.out.println("The second value you have entered is :" + myNum2);
        
        sc.close();
        //hcf calculation method
        
        double hcf = highestCommonFactor(myNum1, myNum2);
        
        //double hcf = highestCommonFactor(double myNum1,double myNum2);
        //results
        System.out.println("The highest common factor for the numbers" + myNum1 + "and " + myNum2 + "is" + hcf);
        

    
    }

    public static boolean isValid(String Parenthesis)
    {
        //use a scanner to prompt the user
        // The user will input their parenthesis and the scanner will read and implement the users input into the code
        
       
        
        if (Parenthesis == null || Parenthesis.isEmpty())
        {
            return true;
            /* An empty string is a valid "input" */
        }
        StringBuilder sb = new StringBuilder();

        for (char z  : Parenthesis.toCharArray())
        {
            if (z == '(' || z == '{' || z == '[') 
            {
                sb.append(z);
            } 
            else if (z == ')' && sb.length() > 0 && sb.charAt(sb.length() - 1) == '(')
            {
                sb.deleteCharAt(sb.length() - 1);
            } 
            else if (z == '}' && sb.length() > 0 && sb.charAt(sb.length() - 1) == '{') 
            {
                sb.deleteCharAt(sb.length() - 1);
            } 
            else if (z == ']' && sb.length() > 0 && sb.charAt(sb.length() - 1) == '[')
            {
                sb.deleteCharAt(sb.length() - 1);
            } 
            else 
            {
                return false; //if sb happens to be empty, match all the parenthesis
            }
        }
        return sb.length() == 0;//parenthesis will be matched if left empty
    }
    //question 2
    public static int odd_squares_sum(int limit)
    {
        int sum = 0;
        
        for (int a = 1 ; a <= limit ; a++)
        {
           if(a % 2 != 0)
           {
              sum += a * a;
           }
        }
        return sum;
    }
    //question 3
    public static double highestCommonFactor(double myNum1,double myNum2)
    {
        while(myNum2 !=0)
        {
            double temp = myNum2;
            myNum2 = myNum1 % myNum2;
            myNum1 = temp; 
        }
        return myNum1;
    }
    
}
