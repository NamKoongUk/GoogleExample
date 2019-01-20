package com.one.day;

public class L_googleAlgorithm {

	public static void main(String[] args) {
	
		String[] str = new String[10000];
		for(int i=0; i<10000; i++) {
			str[i] = String.valueOf(i);
			
		}
		int count=0;
		for(int i=0; i<10000; i++) {
			for(int j=0; j<str[i].length(); j++) {
				if(str[i].charAt(j) =='8') {
					count++;
				}
			}
		}
		
		
		System.out.println(count);
		
		
		

	}

}
