package com.mukesh.i18n.unicode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class UnicodeConversion {

	public static void main(String[] args) throws IOException {
	byte[] bytes=new byte[10];
	bytes[0]=10;
	bytes[1]=11;
	String str=new String(bytes,Charset.forName("UTF-8"));
	System.out.println(str);
	//convert text into bytes
	byte[] bytes1=str.getBytes(Charset.forName("UTF-8"));
	for(byte b: bytes1) {
		System.out.println(b);
	}
	//converting to and from unicode using the Reader and Writer classes
	InputStream inputStream=new FileInputStream("c:\\logs\\log4.log");
	//by reader class
	Reader reader=new InputStreamReader(inputStream,Charset.forName("UTF-8"));
	int data=reader.read();
	while(data!=-1) {
		char theChar=(char) data;
		data=reader.read();
		System.out.print(theChar);
		
	}
	reader.close();
	//by writer class
	OutputStream outputStream=new FileOutputStream("c:\\logs\\myfile.txt");
	Writer writer=new OutputStreamWriter(outputStream,Charset.forName("UTF-8"));
	writer.write("hello mukesh!");
	writer.close();
	}

}
