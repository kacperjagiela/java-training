package com.kjhop;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Calculator created using javascript eval instead of a switch to all cases
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your operation(example. 3+3)");
        String operation = input.nextLine();

//      Load js interpreter to get eval

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result = null;
        try {
            result = engine.eval(operation);
            System.out.println(operation+"="+result);
        } catch (ScriptException e) {
            e.printStackTrace();
            System.out.println("Something went wrong. Try again");
        }
    }
}
