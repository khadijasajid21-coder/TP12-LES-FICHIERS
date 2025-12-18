package com.example.tp;

import java.io.BufferedReader;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CsvParser {

		  public static List<Record> readCsv(String path) throws IOException {
		        List<Record> records = new ArrayList<>();

		        try (BufferedReader br = Files.newBufferedReader(Path.of(path))) {
		            String line;
		            boolean firstLine = true; 

		            while ((line = br.readLine()) != null) {
		                if (firstLine) {
		                    firstLine = false;
		                    continue;
		                }

		                String[] parts = line.split(",");
		                int id = Integer.parseInt(parts[0].trim());
		                String name = parts[1].trim();
		                double score = Double.parseDouble(parts[2].trim());

		                records.add(new Record(id, name, score));
		            }
		        }

		        return records;
		    }
		  public static void writeCsv(List<Record> records, String path) throws IOException {
		        try (BufferedWriter bw = Files.newBufferedWriter(Path.of(path))) {
		            bw.write("id,name,score");
		            bw.newLine();

		            for (Record r : records) {
		                bw.write(r.getId() + "," + r.getName() + "," + r.getScore());
		                bw.newLine();
		            }
		        }
		    }
		
}
