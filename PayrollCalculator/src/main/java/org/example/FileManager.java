package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    List<Employees> employees = new ArrayList<>();
    String filePath = "src/main/resources/Employees.csv";

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))


        String line;

        while ((line = reader.readLine()) != null) {

            String[] data = line.split("\\|");
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            String hoursWorked = data[2];
            String payRate = data[3];

        }
        catch(IOException ex){
        System.out.println("Sorry couldn't read the file.");
    }
    }
}
