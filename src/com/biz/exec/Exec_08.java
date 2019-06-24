package com.biz.exec;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.biz.exec.model.StudentVO;

public class Exec_08 {

	public static void main(String[] args) {

		StudentVO[] stdList = new StudentVO[10];


			for(int i = 0; i < stdList.length; i++) {
				stdList[i] = new StudentVO();
			}
			
			stdList[0].number = "001";
			stdList[0].name = "홍길동";

			stdList[1].number = "002";
			stdList[1].name = "성춘향";
			

		
		System.out.println(stdList[0].name);
		System.out.println(stdList[0].number);
		System.out.println(stdList[1].name);
		System.out.println(stdList[1].number);		
	}

}
