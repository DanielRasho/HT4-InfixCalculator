package App_main;

import App_utils.printer.AnsiColors;

import java.io.File;

/**Class for starting execution*/
public class App 
{
    /** Starts execution by getting the file where operations are*/
    public static void main(String[] args) {
        // IF NO FILE PATH GIVEN.
        if (args.length == 0){
            App_utils.printer.Printer.println("No file path for calculation given", AnsiColors.RED);
            System.out.println("\tTry : java -jar <jarName> <filePath>");
            System.out.println("\tExample : java -jar Calculator.jar ./operations.txt");
        }
        else{
            File operationsFile = new File(args[0]);
        // IF FILE NOT EXIST
            if (!operationsFile.exists()){
                App_utils.printer.Printer.println("Not such file exists.", AnsiColors.RED);
                System.out.println("\tTry again, with a valid path.");
            }
        // IF FILE EXIST, START PROGRAM!
            else{
                Controller controller = new Controller(operationsFile);
                controller.start();
            }
        }
    }
}
