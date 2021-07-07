/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingby100threads;


import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dungnt
 */
public class MT extends Thread {
    public String ip;
    
    public MT(String s){
        ip=s;
    }
    
    public void run(){
        try{
            sendPingRequest(ip);
        
        }   catch (IOException ex) {
                Logger.getLogger(MT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void sendPingRequest(String ipAddress) throws UnknownHostException, IOException
    {
      InetAddress geek = Inet6Address.getByName(ipAddress);
      //System.out.println("Sending Ping Request to " + ipAddress);
      if (geek.isReachable(600))
        System.out.println(ipAddress + " - Host is reachable");
      //else
      //  System.out.println("Sorry ! We can't reach to this host");
    }
}
