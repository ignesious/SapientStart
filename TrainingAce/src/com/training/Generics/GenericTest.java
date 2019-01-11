package com.training.Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * https://vox.publicis.sapient.com/groups/accelerated-coaching-for-excellence/projects/ace-java/content?filterID=contentstatus%5Bpublished%5D~category%5Bcore-java%5D
 */



public class GenericTest {

	public static <T> List<T> toList(T... arr)
	{
		List<T> list=new ArrayList<T>();
		for(T elt:arr)
			list.add(elt);
		return list;
	}
	

	
	
//	private static<T> double suma(Collection<T extends Number> numbers) {
//	    double result = 0.0;
//	 
//	    for (Number num : numbers) result += num.doubleValue();
//	 
//	    return result;
//	}
//	
	
	
	
	
	

	private static double sum(Collection<? extends Number> numbers, int i) {
	    double result = 0.0;
	 
	    for (Number num : numbers) result += num.doubleValue();
	 
	    return result;
	}
	
	
	private static <T extends Number> double sumdifferent(Collection<T> numbers, T typebar) {
	    double result = 0.0;
	 
	    for (Number num : numbers) result += num.doubleValue();
	 
	    return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Object> list=GenericTest.toList(new String("sdf"),1);
       
	}

}
