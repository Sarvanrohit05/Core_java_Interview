
package com.in.networking;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLReader {
	
	public static void main(String[] args)throws Exception {
		
		URL u  = new URL("https://erp.sunilos.com/NCSA/#/Test");
		
		System.out.println("protocol: " + u.getProtocol());
		System.out.println("Host name: " + u.getHost());
		System.out.println("Port Number: "+ u.getPort() );
		System.out.println("File Number: " + u.getFile()) ;
		
        // Open a stream to read from the URL
		InputStream in =u.openStream();
		
        
		
		// Use a Scanner to read the content line by line
		Scanner s = new Scanner(in) ;
		
		while(s.hasNext()) {
			String html = s.next();
			System.out.println(html);
			
		} 
		
		s.close(); 
		
		
		
		
		
	}

}
