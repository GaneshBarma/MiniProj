package Code;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class MiniCal 
{
 private static final Logger logger = LogManager.getLogger(MiniCal.class);
 public MiniCal() {}
 public static void main(String[] args) 
 {
   try
   {
   MiniCal calculator=new MiniCal();
   Scanner scanner=new Scanner(System.in);
   System.out.println("This is a Mini Scientific Calculator.");
   System.out.println("You can use the operations by entering their respective number: ");
   System.out.println("1 - Square Root \n2 - Factorial\n3 - Natural Logarithm\n4 - Power");
   int input=scanner.nextInt();
   if(input==1)
   {
   System.out.println("Enter a number to get the square root.");
   System.out.println("Square root result is : " + calculator.sqroot(scanner.nextDouble()));
   }
   else if(input==2)
   {
   System.out.println("Enter a number to get the factorial");
   System.out.println("Factorial result is : " + calculator.factorial(scanner.nextInt()));
   }
   else if(input==3)
   {
       System.out.println("Enter a number to get the natural logarithm");
       System.out.println("Natural logarithm result is : " + calculator.log(scanner.nextDouble()));
   }
   else if(input==4)
   {
   System.out.println("Enter two numbers that is base and coefficient to get the power");
   System.out.println("Power function result is : " + calculator.power(scanner.nextDouble(),scanner.nextDouble()));
   }
   else
   System.out.println("The range is only from 1-4, other numbers are invalid");
   System.out.println("Sorry, Run Again, :(");
   }
   catch(InputMismatchException error)
   {
   System.out.println("Invalid input, Entered input is not of the expected type");
   logger.error("Invalid input, Entered input is not of the expected type");
//   return;
   }
 }

 public double sqroot(double number1)
 {
  logger.info("[ROOT] - " + number1);
  double return_val = Math.sqrt(number1);
  logger.info("[RESULT - ROOT] - " + return_val);
  return return_val;
 }
 public double factorial(int number1) 
 {
  logger.info("[FACTORIAL] - " + number1);
  if(number1<0)
   return Double.NaN;
  double fact=1;  
  for(int i=1;i<=number1;i++)    
   fact=fact*i;   
  logger.info("[RESULT - FACTORIAL] - " + fact);
  return fact;
 }
 public double log(double number1) 
 {
  logger.info("[LOG] - " + number1);
  double return_val = Math.log(number1);
  logger.info("[RESULT - LOG] - " + return_val);
  return return_val;
 }
 public double power(double number1, double number2) 
 {
  logger.info("[POWER] - " + number1 + ", " + number2);
  double return_val = Math.pow(number1 , number2);
  logger.info("[RESULT - POWER] - " + return_val);
  return return_val;
 }
}
