package com.digit.javaTraining.fileIOStream;

import java.io.File;

public class FileOp4 {

	public static void main(String[] args) throws Exception {
		String path1="C:\\FileOps\\Input4.txt";
		File f=new File(path1);
		
		f.createNewFile();
		
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getFreeSpace());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getParent());
		System.out.println(f.getClass());
	}

}
