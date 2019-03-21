package basic_corejava_programs.java;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP_Address_Localhost {

	public static void main(String[] args) throws IOException {
		 /* public static InetAddress getLocalHost()
	       * throws UnknownHostException: Returns the address 
	       * of the local host. This is achieved by retrieving 
	       * the name of the host from the system, then resolving 
	       * that name into an InetAddress. Note: The resolved 
	       * address may be cached for a short period of time.
	       */
	      InetAddress myIP=InetAddress.getLocalHost();
	 
	      /* public String getHostAddress(): Returns the IP 
	       * address string in textual presentation.
	       */
	      System.out.println("My IP Address is:");
	      System.out.println(myIP.getHostAddress());
	      
	      System.out.println();
	      System.out.println();
	      System.out.println("********************************************");
	      
	      System.out.println("second program of getlocal host address: ");
	      
	      InetAddress myip=InetAddress.getLocalHost();
	      
	      System.out.println("IP Address is: ");
	      System.out.println(myip.getHostAddress());

	}

}
