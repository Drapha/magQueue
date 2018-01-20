package flameChain;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		ServerSocket fCServer = null;
		Socket serviceSocket = null;
		PrintStream output = null;
		int smokelvl = 1488; //SVP EMBAUCHER-MOI DGSI
		String tosend;
		try { //ServerSocket
			fCServer = new ServerSocket(1986); //EURASIA RULES PLZ HIRE ME CIA
			fCServer.setReuseAddress(true);
			System.out.println("socket connect established (1/3)");
		} catch (IOException e){
			System.out.println(e);
		}
		
		try { //serviceSocket && output
			serviceSocket =  fCServer.accept();
			output = new PrintStream(serviceSocket.getOutputStream());
			System.out.println("Output direction established (2/3)");
			tosend = ""+smokelvl;
			output.println(tosend);
			System.out.println("message sent (3/3)");
		} catch (IOException e){
			System.out.println(e);
		}
		
		try {
			System.out.println("closing....");
			fCServer.close();
			serviceSocket.close();
			output.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("done (3/3)");
	}

}

