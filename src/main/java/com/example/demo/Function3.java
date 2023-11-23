package com.example.demo;


public class Function3 extends Function {

	@Override
	public double fnValue(double x) {

		// The function is going to be undefined for all negative values because of the
		// square root and infinity for x = 0.

		if(x == 0.0){
			return Double.MAX_VALUE;
		} else if (x < 0) {
			return Double.NaN;
		}

		return (8*x-Math.sqrt(x))/(Math.pow(x,3) - (7*Math.pow(x,2)) + 15*x - 9);
	}
	
	public String toString () {
		return "(8*x-sqrt(x))/x^3 - 7*x^2 + 15*x - 9";
	}

}
