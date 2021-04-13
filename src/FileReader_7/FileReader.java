package FileReader_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * author: Jakub Marciniak
 * #7
 */

public class FileReader {
    public static void main(String[] args) throws IOException {


        //There paste a path name to file which you want to open
        File file = new File("your pathname");
        Scanner scanner  = new Scanner(file);

        /**
         * This loop shows all line from file
         */
//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }

        /**
         * This loop save text from one file to another
         * and on top file save new line from "fileContent"
         */
        String fileContent = "This is a new file\n";
        while(scanner.hasNextLine()){
            fileContent = fileContent.concat(scanner.nextLine()+ "\n");
        }
        //There should be your new file path name
        FileWriter writer = new FileWriter("your new pathname");
        writer.write(fileContent);
        System.out.println("Here I create a new file.txt, let's check");
        writer.close();

    }
}
