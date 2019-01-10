package com.training.Random;
/*
 * https://stackoverflow.com/questions/1998544/method-has-the-same-erasure-as-another-method-in-type
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class A{
  public void genericPrint(List<Number> intlist)
  {
      
  }
    
}

class B extends A{

//   public void genericPrint(List<Integer> intlist)
//  {
//      
//  } 
}

/* Name of the class has to be "Main" only if the class is public. */
class GenericShit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		@SuppressWarnings("unused")
		A a = new B();
	}
}
