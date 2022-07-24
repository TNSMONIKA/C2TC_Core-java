package com.tns.acharya;

public class Loopingstatements2 {
	
public static void main(String args[]) {
		int x =4;
		int y =0;
		for(;y<10;++y) {
			if(y%x==0)
				continue;
			else if(y==8)
		      break;
			else
				System.out.println(y+"");
			}
		
}
}