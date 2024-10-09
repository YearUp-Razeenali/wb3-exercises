package com.pluralsight;

import java.awt.*;
import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        try
        {
            // create a FileReader object connected to the File
            FileReader fileReader = new FileReader("employees.csv");
            // create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);
            bufReader.readLine();
            String input;

            //the following is file writer
            FileWriter fw = new FileWriter("payroll-oct-2024.txt");
            //the following is buffered, everywhere where its fw, would be bw
            BufferedWriter bw = new BufferedWriter(fw); // BufferedWriter bw = new BufferedWriter(new FileWriter("payroll-oct-2024.txt"));

            fw.write("id|name|gross pay\n");
            

            // read until there is no more data
            while((input = bufReader.readLine()) != null) {

                String [] tokens = input.split(Pattern.quote("|"));
                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked =Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee theEmp = new Employee(employeeId, name, hoursWorked, payRate);
                displayEmployee(theEmp);

                String outputData = theEmp.getEmployeeID() + "|" + theEmp.getName() + "|" + theEmp.getGrossPay()+ "\n";
                fw.write(outputData);

            }
            // close the stream and release the resources
            bufReader.close();
            fw.close();
        }
        catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }

    private static void displayEmployee(Employee e){
        System.out.printf("%d:%s Pay this period: %.2f\n", e.getEmployeeID(), e.getName(),e.getGrossPay());
    }


}