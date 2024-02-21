package org.pearharmony;

public class KILLME {
    public static void main(String args[])
	{ new KILLME().start();
	}
	public void start()
	{
		new Server(5000);
		new Client("localhost", 5000);
	}
}
