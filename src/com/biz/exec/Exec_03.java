package com.biz.exec;

import java.util.Random;

public class Exec_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		int intNum = rnd.nextInt(60);
		
		if(intNum%2 == 0) System.out.println(intNum + "는 짝수");
		else System.out.println(intNum + "는 홀수");
		
		
	}

}
