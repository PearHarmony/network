package org.pearharmony;

public class KILLME {
    public static void main(String args[])
	{ new KILLME().start();
	}
	public void start()
	{
		Server server = new Server(5000);
		Client client = new Client("localhost", 5000);
	}
}
