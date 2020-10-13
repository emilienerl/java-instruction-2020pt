package nerl.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InstructionApp {

	public static void main(String[] args) {
		// public static void main(String[] args) throws IOException {
//		String dirString = "C:/Users/MAX-Student/Desktop/java murach download files/files";
//		Path dirPath = Paths.get(dirString);
//		System.out.println("exists returns " + Files.exists(dirPath));
//
//		String fileString = "products.txt";
//		Path filePath = Paths.get(dirString, fileString);
//		System.out.println("exists returns " + Files.exists(filePath));
//
//		if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
//			System.out.println("Directory: " + dirPath.toAbsolutePath());
//			System.out.println("Files: ");
//
//			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
//
//			for (Path p : dirStream) {
//				if (Files.isRegularFile(p)) {
//					System.out.println("      " + p.getFileName());
//				}
//			}
//		}

		Path productsPath = Paths.get("products.txt");
		File productsFile = productsPath.toFile();

		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(productsFile)))) {

//		FileWriter fw = new FileWriter(productsFile);
//		BufferedWriter bw = new BufferedWriter(fw);
//		PrintWriter out = new PrintWriter(bw);

			out.println("java\tMurach\t50.00");
			out.println("jsp\tMurach\t50.00");

			// out.close();

		} catch (IOException e) {
			System.out.println(e);
		}

		try (BufferedReader in = new BufferedReader(new FileReader(productsFile))) {
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
