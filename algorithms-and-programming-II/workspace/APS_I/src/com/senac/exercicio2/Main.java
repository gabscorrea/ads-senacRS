package com.senac.exercicio2;

import com.senac.SimpleJava.Console;

public class Main {
	public void run() {
		Client client = new Client();
		
		
		client.CashOut(500);
		Console.println(client.toString());
	}
}
