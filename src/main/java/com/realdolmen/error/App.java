package com.realdolmen.error;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	final int teller = 7;
    	String t="Test";
    	
        
        for(int i=0;i<getRandom();i++)
        {
        	i=i+100;
        }
        System.out.println(t);
        
    }
    
    public static int getRandom()
    {
    	return Math.random()*7;
    }
}
