package org.pearharmony;
// A Java program for a Client
import java.io.*;
import java.net.*;
import java.util.*;

public class Sender implements Runnable {
	// initialize socket and input output streams
	private Socket socket = null;
	private DataOutputStream out = null;
	private String address;
	private int port;
	int type;
	byte[] data;

	//Scanner in = new Scanner(System.in);//TODO: Remove redundand code
	// constructor to put ip address and port
	/**
	 * @param address
	 * @param port
	 */
	public Sender(String _address, int _port,int _type,byte[] _data)
	{
		address=_address;
		port=_port;
		data= _data;
		type= _type;
	}
	public void run()
	{
		// establish a connection
		try {
			socket = new Socket(address, port);
			System.out.println("Sender: Connected");

			// takes input from terminal

			// sends output to the socket
			out = new DataOutputStream(socket.getOutputStream());
		}
		catch (UnknownHostException u) {
			System.out.println(u);
			return;
		}
		catch (IOException i) {
			System.out.println(i);
			return;
		}

try {
	out.writeInt(type);
	out.write(data);
	out.close();
	socket.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		//TODO: Remove old code
		/* / string to read message from input
		String line = "";

		// keep reading until "Over" is input
		while (!line.contains("[eof]")) {
			try {
				//line = "danielsucks[eof]";
				line = in.nextLine(); // do not use this
				out.writeUTF(line);
			}
			catch (IOException i) {
				System.out.println(i);
			}
		}

		// close the connection
		try {
			out.close();
			in.close();
			socket.close();
		}
		catch (IOException i) {
			System.out.println(i);
		}*/
	}


}
