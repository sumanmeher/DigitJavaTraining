package com.digit.javaTraining.networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) throws IOException {
		Socket csoc = new Socket("10.1.129.98", 4000);
		OutputStream os = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		dos.writeUTF(msg);

	}

}
