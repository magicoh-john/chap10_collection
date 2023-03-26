package com.javalab.collection.pkg18_스레드후학습;

import java.util.ArrayList;
import java.util.List;

public class VectorEx {
	
	
	public static void main(String[] ar){
		
		List<String> list = new ArrayList<>();
		
		list.add("reakwon");
		list.add("hello");
		list.add("world");
		
		Thread thread=new Thread(new Runnable() {
			@Override
			public void run() {
				for (String string : list) {
					System.out.println();
					try {
						Thread.sleep(1000); // 1초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		thread.start();	//thread 시작
		
		//thread가 forEach문을 먼저 수행할 여유를 주기 위해 1초 기다림
		try {
			Thread.sleep(1000); // 1초 대기
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//thread가 forEach() 하는 중에 원소추가
		list.add("thread-unsafe");
	}
}
