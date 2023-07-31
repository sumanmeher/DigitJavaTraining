package com.digit.javaTraining.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server3 {

	public static void main(String[] args) throws IOException {
		ServerSocket listener = new ServerSocket(4000);
		System.out.println("Server is ready to accept");
		Socket ssoc = listener.accept();
		InputStream is = ssoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		String temp = dis.readUTF();
		System.out.println(temp);
		OutputStream os = ssoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		dos.writeUTF(msg);

	}

}
