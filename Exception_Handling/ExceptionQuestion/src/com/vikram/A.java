package com.vikram;
import java.io.IOException;

class B{
	void show() throws IOException{
		throw new IOException("Error");
	}
}
public class A {
	public static void main(String[] args) {
		try {
			B obj = new B();
			obj.show();
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
