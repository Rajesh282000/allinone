package com.Rough;

// Importing the FileWriter class
import java.io.FileWriter;

// Importing the IOException class for handling errors
import java.io.IOException;

class WriteToFile {
    public static void main(String[] args) {

        try {
            FileWriter fwrite = new FileWriter("C:FileOperationExample.txt");
            // writing the content into the FileOperationExample.txt file
            fwrite.write("rajesh burnwal");
            fwrite.write("helo alfa one zed");

            // Closing the stream
            fwrite.close();
            System.out.println("Content is successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
        }
    }
}