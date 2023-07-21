/**
 * 
 */
package com.digit.JavaTraining.Collection;

import java.util.ArrayList;

/**
 * 
 */
public class arraylist {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        ArrayList a1=new ArrayList();
        ArrayList a2=new ArrayList();
        a1.add(100);
        a1.add(20);
        a1.add(2, 54);
        boolean x=a1.contains(200);
        int index =a1.indexOf(20);
        a1.add(1,3000);
        //a1.clear();
        a1.sort(null);
        a1.add(100);
        a1.add(20);
        a1.add(-12345);
        a1.sort(null);
        System.out.println(a1.set(2, 140000));
        a1.sort(null);
        a2.add(100);
        a2.add(230);
        a2.addAll(a1);
        //
        //a1.addAll(0,1400);
        System.out.println(a1.isEmpty());
        System.out.println(a1+" "+index);
        System.out.println(a2);
	}

}
