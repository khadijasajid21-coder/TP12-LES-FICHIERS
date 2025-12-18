package com.example.tp;

import java.io.*;

public class TextReader {
	public static void readLines(String path) throws IOException {
	    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
	    }
	}

}
