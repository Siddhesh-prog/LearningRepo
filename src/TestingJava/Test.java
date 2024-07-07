
package TestingJava;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		String  str="  Hello Siddhesh    Sarang  ";
		str=str.toUpperCase();
		char[] charArray=str.toCharArray();
		Long count=1L;
		int length=charArray.length;
		boolean flag=false;
		for (int i = 0; i < charArray.length; i++) {
			
			if(i+1==length) {
				break;
			}else
			if( flag==false && charArray[i+1]>65 && charArray[i+1]<90) {
				
				flag=true;
				
			}else 
			if(charArray[i]==' ' && flag==true && charArray[i+1]>65 && charArray[i+1]<90) {
				
				count++;
			}
		}
		System.out.println("No of words "+count);
	}

}
