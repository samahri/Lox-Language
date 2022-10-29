import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lox {
    public static void main(String[] args) {
        try {
            runPrompt();
        } catch (IOException e) {
            System.err.println("IOException thrown");
        }
    }

    private static void runPrompt() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        
        while (true) {
            System.out.print(">>> "); // use python prompt
            String line = bufferedReader.readLine();
            if (line.equals("exit")) {
                System.out.println("Exiting Lex");
                break;
            }
            run(line);
        }
        
        
    }

    private static void run(String line) {
        // print the line for now
        System.out.println(String.format("Lexing \"%s\"", line));
    }
}