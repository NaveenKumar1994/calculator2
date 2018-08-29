package com.teamsankya.calculatortest;

import com.teamsankya.calulator.Addition;
import com.teamsankya.calulator.Division;
import com.teamsankya.calulator.Multiplication;
import com.teamsankya.calulator.Substraction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int sum = Addition.add(10,20);    	
    	System.out.println("Sum "+sum);
    	int subtr = Substraction.sub(20,10);
    	System.out.println("Result "+subtr);
        double divi = Division.div(20,10);
        System.out.println("Result "+divi);
        int prod = Multiplication.mul(10,20);
        System.out.println("Result "+prod);
    }
}
