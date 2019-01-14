package com.training.Random;
/*
 * https://stackoverflow.com/questions/1998544/method-has-the-same-erasure-as-another-method-in-type
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class A{
	
	int i;
	int j;
	String k;
	
  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + j;
		result = prime * result + ((k == null) ? 0 : k.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (i != other.i)
			return false;
		if (j != other.j)
			return false;
		if (k == null) {
			if (other.k != null)
				return false;
		} else if (!k.equals(other.k))
			return false;
		return true;
	}

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
