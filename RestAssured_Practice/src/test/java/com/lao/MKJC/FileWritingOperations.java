package com.lao.MKJC;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWritingOperations {

	public static void main(String[] args) throws IOException {

		// -----FILEWRITER-----
		String location = "FileWriting.txt";
		String content = "Winter is coming";

		FileWriter filewriter = new FileWriter(location);
		filewriter.write(content);
		filewriter.close();

		// ----BUFFEREDWRITER------

		String locationb = "BufferedFileWriting.txt";
		String contentb = "Winter is coming soon!!!";

		FileWriter fileWriter = new FileWriter(locationb);

		BufferedWriter bufferedwriter = new BufferedWriter(fileWriter);
		bufferedwriter.write(contentb);
		bufferedwriter.close();

		// -------FILEOUTPUTSTREAM-------

		String locationc = "FileOutputStreamFileWriting.txt";
		String contentc = "Summer is coming";

		FileOutputStream fileOutputStream = new FileOutputStream(locationc);

		byte[] writeThis = contentc.getBytes();

		fileOutputStream.write(writeThis);
		fileOutputStream.close();

		// ------------PATH------------

		String locationd = "PathFileWriting.txt";
		String contentd = "Summer is coming soon!!!!";

		Path pathWriter = Paths.get(locationd);
		Files.write(pathWriter, contentd.getBytes());

	}

}
