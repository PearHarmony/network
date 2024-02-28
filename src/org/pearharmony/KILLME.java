/*
TODO: Killy myself
package org.pearharmony;

import java.util.Scanner;

public class KILLME{
    public static void main(String args[])
	{ new KILLME().start();
	}
	public void start()
	{
	Scanner	in = new Scanner(System.in);

	String input="";

	Listener server = new Listener(5000);
	Thread listener = new Thread(server);
	listener.start();
	
	Sender client = new Sender("localhost",5000);
	Thread sender = new Thread(client);
	while (true) {
		while(input.equals("")){
		input =in.nextLine();}
		if (input.equals("send") )
		{
			sender.start();
		}
	}
	}
}
*/