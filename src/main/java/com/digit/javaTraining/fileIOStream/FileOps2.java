package com.digit.javaTraining.fileIOStream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileOps2 {

	public static void main(String[] args) throws Exception {
		String path1="C:\\FileOps\\Input.txt";
		String path2="C:\\FileOps\\Output.txt";
		
		FileReader fr=new FileReader(path1);
		int temp;
		FileWriter fw = new FileWriter(path2);
		
		while((temp=fr.read())!=-1) {
			fw.write(temp);
		}
		
		fw.close();
		fr.close();

	}

}
