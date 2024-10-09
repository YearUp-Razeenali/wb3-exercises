package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String [] quotes = {
                "The only way to do great work is to love what you do. - Steve Jobs",
                "Success is not the key to happiness. Happiness is the key to success. - Albert Schweitzer",
                "In the middle of every difficulty lies opportunity. - Albert Einstein",
                "Don’t watch the clock; do what it does. Keep going. - Sam Levenson",
                "Success usually comes to those who are too busy to be looking for it. - Henry David Thoreau",
                "Opportunities don't happen. You create them. - Chris Grosser",
                "It's not whether you get knocked down; it's whether you get up. - Vince Lombardi",
                "You miss 100% of the shots you don’t take. - Wayne Gretzky",
                "I find that the harder I work, the more luck I seem to have. - Thomas Jefferson",
                "Don't be afraid to give up the good to go for the great. - John D. Rockefeller"
        };

        int index;
        try{
            index = PromptforInt("Pick a quote (select #1 - #10): ");
            System.out.println(DisplayQuote(quotes,index));
            System.out.println("------------------------------------");
            System.out.println(continueQuote(quotes));

        }
        catch (Exception e){
            System.out.println("Please try again. Select #1 - #10");
            System.out.println(e.getMessage());
            System.out.println("------------------------------------");

            //System.out.println(yesOrNo);
            System.out.println(continueQuote(quotes));
        }

    }

    public static String continueQuote(String [] quotes){
        String yesOrNo = PromptforString("Would you like to Contine (yes/no): ");
        if (yesOrNo.equals("yes") || yesOrNo.equals("Yes")){
            do {
                int index = PromptforInt("Pick a quote (select #1 - #10): ");
                System.out.println(DisplayQuote(quotes, index));
                System.out.println("------------------------------------");
                yesOrNo = PromptforString("Would you like to Contine (yes/no): ");
            }
            while (yesOrNo.equals("yes") || yesOrNo.equals("Yes"));


        }
        System.exit(0);

        return null;
    }

    public static String DisplayQuote(String [] quotes, int index){
        index--;
        return quotes[index];
    }

    public static int PromptforInt(String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static String PromptforString(String prompt){
        System.out.print(prompt);
        scanner.nextLine();
        return scanner.nextLine();
    }

}