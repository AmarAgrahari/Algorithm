package com.info;
import java.math.*;
public class BigDecimalDemo {

	

	

	   public static void main(String[] args) {

	      // create 3 BigDecimal objects
	      BigDecimal bg1,bg2,bg3,bg4;

	      // assign value to bg1 and bg2
	      bg1 = new BigDecimal("40.732");
	      bg2 = new BigDecimal("30.12");

	      // print bg1 and bg2 value
	      System.out.println("Object Value is " + bg1);
	      System.out.println("Augend value is " + bg2);

	      // create MathContext object with 4 precision
	      MathContext mc = new MathContext(4);

	      // perform add operation on bg1 with augend bg2 and context mc
	      bg1=bg1.add(bg2,mc);

	      // print bg3 value with
	      System.out.println("Result is " + bg1);
	   }
	}

