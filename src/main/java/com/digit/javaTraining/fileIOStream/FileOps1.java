package com.digit.javaTraining.fileIOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOps1 {

	public static void main(String[] args) throws Exception {
		String path1="C:\\FileOps\\Input.txt";
		String path2="C:\\FileOps\\Output.txt";
		
		FileInputStream fis=new FileInputStream(path1);
		int temp;
		FileOutputStream fos = new FileOutputStream(path2);
		
		while((temp=fis.read())!=-1) {
			fos.write(temp);
		}
		
		fos.close();
		fis.close();
		

	}

}
