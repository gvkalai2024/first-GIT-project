package org.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONRead {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader fr = new FileReader(new File("C:\\Users\\91720\\eclipse-workspace\\APISample\\src\\test\\resources\\sample.json"));
		JSONParser jsonparser = new JSONParser();
		Object parse = jsonparser.parse(fr);
		

	}

}
