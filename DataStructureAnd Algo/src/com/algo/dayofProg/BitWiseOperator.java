package com.algo.dayofProg;

public class BitWiseOperator {

	public static void main(String args[]) {

		boolean bitwise;
		boolean conditional;
		int i = 10, j = 12;
		bitwise = (i < j) | ((i = 3) > 5); // value of i after oper: 3
		System.out.println(bitwise + " " + i);
		i = 10;
		conditional = (i < j) || (i = 3) > 5; // value of i after oper: 10
		System.out.println(conditional + " " + i);
		i = 10;
		bitwise = (i > j) & (i = 3) > 5; // value of i after operator: 3
		System.out.println(bitwise + " " + i);
		i = 10;
		conditional = (i > j) && (i = 3) > 5; // value of i after oper: 10
		System.out.println(conditional + " " + i);

	}

}
