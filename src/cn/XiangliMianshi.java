package cn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.GZIPOutputStream;

public class XiangliMianshi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		
		String str2 = "he" + new String("llo");
		
		System.err.println(str1 == str2);
		
		int i = Integer.MAX_VALUE;
		int j = i+1;
		System.out.println(j<i);
		
		try {
			new BufferedWriter(new FileWriter("a.txt"));
			//new BufferedReader(new FileInputStream(""));
			new GZIPOutputStream(new FileOutputStream(""));
			new ObjectInputStream(new FileInputStream(""));
			
			throw new IOException("");
		} catch (IOException e) {
			System.out.println("IOException");
		} catch(Exception e){
			System.out.println("Exception");
		}
		
		String s = "";
		System.out.println("s=" + s);
		int m = getValue(2);
		System.out.println(m);
		
		System.out.println("5" + 2);
	}
	
	public static int getValue(int i){
		int result = 0 ; 
		switch(i){
		case 1:
			result = result + i;
		case 2:
			result = result + 2*i;
		case 3:
			result = result + 3*i;
		}
		return result;
	}

}

