package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        try{

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-d HH:mm:ss");

            FileWriter fw = new FileWriter("logs.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(LocalDateTime.now().format(fmt) + " Launch\n");

            String search = prompt_for_String("Enter a search a term (X to exit): ");

            while (!search.equalsIgnoreCase("X")){
                bw.write(LocalDateTime.now().format(fmt) + " search : " + search + "\n");
                search = prompt_for_String("Enter a search a term (X to exit): ");
            }
            bw.write(LocalDateTime.now().format(fmt) + " exit\n");

            bw.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static String prompt_for_String(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }
}