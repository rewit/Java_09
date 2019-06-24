package com.biz.exec;

import com.biz.exec.model.StudentVO;

public class Exec_07 {

	public static void main(String[] args) {

		//null로 초기화를 하는 것은
		//문접오류를 잠시 보류하는 효과를 낸다
		
		StudentVO studentVO = null;
		studentVO = new StudentVO();
		
		studentVO.number = "001";
		studentVO.name = "홍길동";
		
		System.out.println(studentVO.name);
		System.out.println(studentVO.number);
		
	}

}
