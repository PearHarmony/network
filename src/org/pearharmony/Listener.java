package org.pearharmony;
// A Java program for a Server
import java.net.*;
import java.io.*;

public class Listener implements Runnable
{
	//initialize socket and input stream
	private Socket		 socket = null;
	private ServerSocket server = null;
	private DataInputStream in	 = null;
	private int port;

	public Listener(int _port){port=_port;}
	// constructor with port
	public void run()
	{
		// starts server and waits for a connection
		try
		{
			server = new ServerSocket(port);
			System.out.println("Listener: Started");//TODO: Remove

			System.out.println("Listener: Waiting for a sender ...");//TODO: Remove

			socket = server.accept();
			System.out.println("Listener: Sender accepted");//TODO: Remove

			// takes input from the client socket
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

			String line = "";

			// reads message from client until "[eof]" is sent
			while (!line.contains("[eof]"))
			{
				try
				{
					line = in.readUTF();
					System.out.println("Listener: ["+socket.getInetAddress()+":"+socket.getPort()+"]: "+line);//TODO: Remove
				}
				catch(IOException i)
				{
					System.out.println(i);//TODO: Remove
				}
			}
			System.out.println("Listener: Closing connection");//TODO: Remove

			// close connection
			socket.close();
			in.close();
		}
		catch(IOException i)
		{
			System.out.println(i);//TODO: Remove
		}
	}


}
