package com.pluralsight;

import java.util.*;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        try{
            String bedTime_stories = PromptforString("Please choose a story from the following:\n" +
                    "   goldilocks\n" +
                    "   hansel_and_gretel\n" +
                    "   mary_had_a_little_lamb\n" +
                    "Write the name exactly like the options: ");

            FileInputStream fis = new FileInputStream(bedTime_stories+".txt");
            Scanner scanner = new Scanner(fis);
            int lineNumber = 1;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.printf("%d: %s\n", lineNumber++, line);
            }

        }
        catch (Exception e){
            System.out.println("Whoops, you spelled it wrong!");
            //System.out.println(e.getMessage());
        }

        scanner.close();

    }

    public static String PromptforString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

}