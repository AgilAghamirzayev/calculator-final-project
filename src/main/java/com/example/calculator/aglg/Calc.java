package com.example.calculator.aglg;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calc {

    private static String numbers = "1234567890";
    private static String operations = "+-*/()=";

    public static void main(String[] args) throws ScriptException {

        String one = "10+15*20-5/5";
        String two = "3+5-6";
        String three = "9+2*(6-3+7";
        String four = "9/0";

        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");

        Object expResult1 = scriptEngine.eval(one);
        Object expResult2 = scriptEngine.eval(two);
        Object expResult3 = scriptEngine.eval(three);
        Object expResult4 = scriptEngine.eval(four);

        System.out.println(expResult1);
        System.out.println(expResult2);
        System.out.println(expResult3);
        System.out.println(expResult4);
    }
}
