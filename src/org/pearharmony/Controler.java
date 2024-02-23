package org.pearharmony;

public class Controler {
    public Controler()
    {

    }
    public void send2Peer(String _ip,int _port,int _type,byte[] _data)
    {
        Sender client = new Sender(_ip,_port,_type,_data);
        Thread sender = new Thread(client);
        sender.start();
    }
}
