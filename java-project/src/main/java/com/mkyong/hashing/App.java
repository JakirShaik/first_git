package com.mkyong.hashing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App a = new App();
        a.method2();
    }
    public void method1() {
    	System.out.println("This method is modified by Developer 2");
    	System.out.println("This method added by Developer 1");
    }
    public void method2() {
    	int i = 0;
    	for(;i<=10; i++) {
    		System.out.println(i);
    	}
    }
}
