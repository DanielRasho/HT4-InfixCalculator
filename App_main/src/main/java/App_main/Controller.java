package App_main;

import App_main.model.Calculator;
import App_main.model.InfixTranslator;
import App_main.model.Stack.*;
import App_main.model.Stack.StackFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/** Controls the program execution and calculations. Can only be instantiated once.*/
public class Controller {
    private File operationFile;
    private static Controller instance;

    /**
     * Constructor
     * @param file file to read operation from.
     */
    public Controller (File file){
        this.operationFile = file;
    }

    /**
     * Singleton implementation for Controller
     * @param file File to read operation from.
     * @return Controller unique instance.
     */
    public static Controller getInstance (File file){
        if(instance == null)
            instance = new Controller(file);
        return instance;
    }

    /** Runs the calculator by fetching the info, to then calculate it*/
    public void start(){
        // Fetching data
        List<String> operations = fileToList(this.operationFile, "\n");
        Stack<Double> selectedStack = StackFactory.getStack();      // DISPLAY MENU TO CHOOSE STACK IMPLEMENTATION
        Calculator calculator = new Calculator(selectedStack);

        // Calculating
        List<Double> solutions = operations.stream()
                .map(InfixTranslator::infixToPostFix)
                .map(calculator::evaluate)
                .collect(Collectors.toList());

        // Output
        solutions.forEach(System.out::println);
    }

    /**
     * Reads a file and return it as an array of tokens
     * @param file File to read.
     * @param separator String that define where a Token end.
     * @return List of tokens.
     */
    private List<String> fileToList(File file, String separator){
        List<String> fragments = new ArrayList<>();

        // INSTANTIATING SCANNER
        Scanner read;
        try {
            read = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // SETTING SEPARATOR
        read.useDelimiter(separator);

        // FINDING FRAGMENTS
        while (read.hasNext())
        {
            fragments.add(read.next());
        }
        read.close();

        return fragments;
    }
}