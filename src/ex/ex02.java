﻿package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 105021029 汪元浩
 */
import java.util.*;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		ArrayList<Student>studList = new ArrayList<Student>();
//		int flag=0;
//		while(flag!=1){
		boolean flag=true;
		while(flag){
			String name=scn.next(),num=scn.next();
			int c1=scn.nextInt(),e1=scn.nextInt(),m1=scn.nextInt();
			studList.add(new Student(name,num));
			studList.get(0).addScore(c1,e1,m1);
			System.out.println("Continue? Y/N");
			String yn = scn.next();
			if(yn.equals("N") || yn.equals("n")){
				flag = false;
			}
		}
		studList.get(0).showInfo();
	}

}
