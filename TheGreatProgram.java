import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class TheGreatProgram
{
   public static void main(String[ ] args)
   {
      Random gen = new Random();
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("Welcome to The Great Program, designed by XXXXXXXXXXXXXXXXXXX.");
      System.out.println("What would you like to go to today? (options: \"fate\", \"advice\", or \"gen\" (just pure random))");
      System.out.println(" ");
      
      String locationInput = in.nextLine();
      
      if (locationInput.equals("fate"))
      {
         System.out.println(" ");
         System.out.println("This part of the program is designed to give good hope to people through messages randomly chosen");
         System.out.println("Type in \"What is my fate?\" to continue");
         System.out.println(" ");
      
         String input = in.nextLine();
      
         System.out.println(" ");
      
         for (int i = 0; i < 1; i++)
         {
            if (input.equals("what is my fate?") || input.equals("what is my fate"))
            {
               int decide = gen.nextInt(4) + 1;
         
               if (decide == 0)
               {
                  System.out.println("I do not feel like talking right now, but try again later on (1 second from now).");
               }
         
               else if (decide == 1)
               {
                  System.out.println("You will help others, you will understand more about yourself, you will go forward and go where you want");
               }
         
               else if (decide == 2)
               {
                  System.out.println("You will live on, and do something with your life");
               }
         
               else if (decide == 3)
               {
                  System.out.println("You will live on, however you will always stay with your parents, no matter how much you hate them.");
               }
         
               else if (decide == 4)
               {
                  System.out.println("You will live on to become one of the best coders out there, yet this seems illogical but you understand basically");
               }
            }
      
            else
            {
               System.out.println(" ");
               System.out.println("Please do not mess with me.");
            }
         }
      
         System.out.println(" ");
      
         if (input.equals("what is my fate?") || input.equals("what is my fate"))
         {
               System.out.println("Your fate has been decided, good day.");
         }
      
         else
         {
            System.out.println("Without correct input I cannot run properly, try again.");
         }
      }
   
      else if (locationInput.equals("advice"))
      {
         Scanner in3 = new Scanner(System.in);
         
         System.out.println(" ");
         System.out.println("What do you need help with? (Choices are: \"depression\", \"sadness\", \"actual advice\", \"trust issues\"");
         
         String adviceInput = in3.nextLine();
         
         if (adviceInput.equals("depression"))
         {
            System.out.println(" ");
            System.out.println("Here are some genral links that could help you out: (click on them to see them)");
            System.out.println("https://www.webmd.com/depression/features/natural-treatments#1");
            System.out.println("https://www.helpguide.org/articles/depression/coping-with-depression.htm");
            System.out.println("https://blog.bulletproof.com/how-to-fight-depression-medication/");
         }
         
         if (adviceInput.equals("sadness"))
         {
            System.out.println(" ");
            System.out.println("Here are some genral links that could help you out: (click on them to see them)");
            System.out.println("http://www.oprah.com/spirit/why-youre-sad-how-to-stop-being-sad-deepak-chopra");
            System.out.println("https://www.huffingtonpost.com/maria-rodale/21-ways-to-deal-with-sadn_b_5803672.html");
            System.out.println("https://greatist.com/happiness/face-your-feelings-how-handle-sadness-and-pain");
         }
         
         if (adviceInput.equals("actual advice"))
         {
            System.out.println(" ");
            System.out.println("Here are some general links that could help you out: (click on them to see them)");
            System.out.println("https://personalexcellence.co/blog/101-ways-to-be-a-better-person/");
            System.out.println("https://www.inc.com/john-rampton/15-ways-to-become-a-better-person.html");
            System.out.println("https://liveboldandbloom.com/06/self-confidence/how-to-be-a-better-person");
         }
         
         if (adviceInput.equals("trust issues"))
         {
            System.out.println(" ");
            System.out.println("Here are some general links that could help you out: (click on them to see them)");
            System.out.println("https://www.bustle.com/articles/177783-11-ways-to-learn-how-to-trust-others-again-according-to-experts");
            System.out.println("https://www.huffingtonpost.com/rebecca-perkins/let-go-of-fear_b_9207672.html");
            System.out.println("https://www.huffingtonpost.com/margaret-paul-phd/problems-with-trust-trusting-others-starts-with-yourself_b_7009838.html");
         }
      }
   
      else if (locationInput.equals("gen"))
      {
         Random gen2 = new Random();
         Scanner numberInput = new Scanner(System.in);
         Scanner valueInput = new Scanner(System.in);
         System.out.println(" ");
         System.out.println("This program displays a random number between 0 and the number you choose to give.");
         
         System.out.println("What is the total amount of values you want to see?");
         
         int valuesTotal = valueInput.nextInt();
         Integer values[] = new Integer[valuesTotal];
         
         System.out.println("Type in the number that you want to go up to, the maximum");
         int numInput = numberInput.nextInt();
         System.out.println(" ");
         
         for (int i = 0; i < valuesTotal; i++)
         {
            int randomNum = gen2.nextInt(numInput) + 1;
            System.out.println("The number that was chosen from 0 to " + numInput + " was " + randomNum);
            values[i] = randomNum;
         }
    
         System.out.println(" ");
         System.out.println("Would you like to see all the numbers it chose at once? (input \"yes\" or \"no\" ");
         
         Scanner questionInput = new Scanner(System.in);
         
         String yesOrNo = questionInput.nextLine();
         
         if (yesOrNo.equals("yes"))
         {
            System.out.println(" ");
            System.out.println(Arrays.toString(values));
            System.out.println("You are welcome, have a good day!");
         }
         
         else if (yesOrNo.equals("no"))
         {
            System.out.println("You are welcome, have a good day!");
         }
         
         else
         {
            System.out.println("I would presume not then, well have a good day then!");
         }
      
      }
        
      else
      {
            System.out.println(" ");
            System.out.println("[Error]: Invalid input, re-run this program with correct input.");
      }
   }
}
