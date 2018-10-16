package com.kony.servcalls;

import java.net.*;
import java.io.*;

public class AuthToken {

	public static void main(String[] args) throws IOException {
		URL url=new URL("http://www.javatpoint.com/java-tutorial");
		URLConnection urlcon=url.openConnection();
		InputStream strm=urlcon.getInputStream();
		int i;
		
	}
}
