package com.artivisi.project;
import junit.framework.TestCase;
import junit.framework.Assert;

public class HelloWorldTest extends TestCase{

	public HelloWorldTest(String testName){
		super(testName);
	}
	
	protected void setUp() throws Exception{
		super.setUp();
		System.out.println("Hello");
	}
	
	protected void tearDown() throws Exception{
		super.tearDown();
		System.out.println("World");
	}
	
	//TODO add test method here. The name must begin with 'test'.For example:
	public void testHello(){
		System.out.println("Hello World");
	}
	
	public void testAritmatic(){
		int a =10;
		int b =5;
		
		Assert.assertEquals (13,  a+b);
	}
}
