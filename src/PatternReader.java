import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Character.Subset;
import java.util.Scanner;

import javax.swing.filechooser.FileSystemView;

/**
 * @version 1.0 -- 06/04/013 -03:04hrs
 * @author Ewerton Lopes
 * 
 */
public class PatternReader {

	private Persistence persistenceController;
	private File currentDirectory;
	private String totalOfFilesOnDirectory;
	private File[] filesRead = null;
	private String[] fileNames;
	private String fileExtensionName;

	public PatternReader() {
		this.currentDirectory = new File(System.getProperty("user.dir"));
		this.persistenceController = new Persistence(
				System.getProperty("user.dir") + "\\TimeReaderResults");
		this.fileExtensionName = ".txt";
	}

	public PatternReader(String directoryPath, String persistenceDirectoryPath,
			String fileExtension) {
		this.currentDirectory = new File(directoryPath);
		this.persistenceController = new Persistence(persistenceDirectoryPath);
		this.fileExtensionName = fileExtension;
	}

	public static void main(String[] args) {
		PatternReader timeReader = new PatternReader(); //Create a timeReader Object
		timeReader.ListTheFilesOnDirectory();	//Reading the files on the directory
		timeReader.SearchPatternByEachWord();

	}

	// Search for the pattern.
	private void SearchPatternByEachWord() {
		for (File file : this.filesRead) {
			try {
				FileInputStream in = new FileInputStream(file);
				Scanner scanner = new Scanner(in);

				while (scanner.hasNext()) {
					String readWord = scanner.next();

					if (readWord.startsWith("###Ta")
							&& readWord.endsWith("Ta###")) {
						String data = readWord.substring("###Ta".length(),
								readWord.length() - "Ta###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 1.txt", data, true);

					} else if (readWord.startsWith("###Tb")
							&& readWord.endsWith("Tb###")) {
						String data = readWord.substring("###Tb".length(),
								readWord.length() - "Tb###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 2.txt", data, true);

					} else if (readWord.startsWith("###Tc")
							&& readWord.endsWith("Tc###")) {
						String data = readWord.substring("###Tc".length(),
								readWord.length() - "Tc###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 3.txt", data, true);

					} else if (readWord.startsWith("###Td")
							&& readWord.endsWith("Td###")) {
						String data = readWord.substring("###Td".length(),
								readWord.length() - "Td###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 4.txt", data, true);

					} else if (readWord.startsWith("###Te")
							&& readWord.endsWith("Te###")) {
						String data = readWord.substring("###Te".length(),
								readWord.length() - "Te###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 5.txt", data, true);

					} else if (readWord.startsWith("###Tf")
							&& readWord.endsWith("Tf###")) {
						String data = readWord.substring("###Tf".length(),
								readWord.length() - "Tf###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 6.txt", data, true);

					} else if (readWord.startsWith("###Tg")
							&& readWord.endsWith("Tg###")) {
						String data = readWord.substring("###Tg".length(),
								readWord.length() - "Tg###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 7.txt", data, true);

					} else if (readWord.startsWith("###Th")
							&& readWord.endsWith("Th###")) {
						String data = readWord.substring("###Th".length(),
								readWord.length() - "Th###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 8.txt", data, true);

					} else if (readWord.startsWith("###Ti")
							&& readWord.endsWith("Ti###")) {
						String data = readWord.substring("###Ti".length(),
								readWord.length() - "Ti###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 9.txt", data, true);

					} else if (readWord.startsWith("###Tj")
							&& readWord.endsWith("Tj###")) {
						String data = readWord.substring("###Tj".length(),
								readWord.length() - "Tj###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 10.txt", data, true);

					} else if (readWord.startsWith("###Tk")
							&& readWord.endsWith("Tk###")) {
						String data = readWord.substring("###Tk".length(),
								readWord.length() - "Tk###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 11.txt", data, true);
					} else if (readWord.startsWith("###Tl")
							&& readWord.endsWith("Tl###")) {
						String data = readWord.substring("###Tl".length(),
								readWord.length() - "Tl###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 12.txt", data, true);

					} else if (readWord.startsWith("###Tm")
							&& readWord.endsWith("Tm###")) {
						String data = readWord.substring("###Tm".length(),
								readWord.length() - "Tm###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 13.txt", data, true);

					} else if (readWord.startsWith("###Tn")
							&& readWord.endsWith("Tn###")) {
						String data = readWord.substring("###Tn".length(),
								readWord.length() - "Tn###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 14.txt", data, true);

					} else if (readWord.startsWith("###To")
							&& readWord.endsWith("To###")) {
						String data = readWord.substring("###To".length(),
								readWord.length() - "To###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 15.txt", data, true);
					} else if (readWord.startsWith("###Tp")
							&& readWord.endsWith("Tp###")) {
						String data = readWord.substring("###Tp".length(),
								readWord.length() - "Tp###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 16.txt", data, true);

					} else if (readWord.startsWith("###Tq")
							&& readWord.endsWith("Tq###")) {
						String data = readWord.substring("###Tq".length(),
								readWord.length() - "Tq###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 17.txt", data, true);

					} else if (readWord.startsWith("###Tr")
							&& readWord.endsWith("Tr###")) {
						String data = readWord.substring("###Tr".length(),
								readWord.length() - "Tr###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 18.txt", data, true);

					} else if (readWord.startsWith("###Ts")
							&& readWord.endsWith("Ts###")) {
						String data = readWord.substring("###Ts".length(),
								readWord.length() - "Ts###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 19.txt", data, true);

					} else if (readWord.startsWith("###Tt")
							&& readWord.endsWith("Tt###")) {
						String data = readWord.substring("###Tt".length(),
								readWord.length() - "Tt###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 20.txt", data, true);

					} else if (readWord.startsWith("###Tu")
							&& readWord.endsWith("Tu###")) {
						String data = readWord.substring("###Tu".length(),
								readWord.length() - "Tu###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 21.txt", data, true);

					} else if (readWord.startsWith("###Tv")
							&& readWord.endsWith("Tv###")) {
						String data = readWord.substring("###Tv".length(),
								readWord.length() - "Tv###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 22.txt", data, true);

					} else if (readWord.startsWith("###Tw")
							&& readWord.endsWith("Tw###")) {
						String data = readWord.substring("###Tw".length(),
								readWord.length() - "Tw###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 23.txt", data, true);

					} else if (readWord.startsWith("###Tx")
							&& readWord.endsWith("Tx###")) {
						String data = readWord.substring("###Tx".length(),
								readWord.length() - "Tx###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 24.txt", data, true);

					} else if (readWord.startsWith("###Ty")
							&& readWord.endsWith("Ty###")) {
						String data = readWord.substring("###Ty".length(),
								readWord.length() - "Ty###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 25.txt", data, true);

					} else if (readWord.startsWith("###Tz")
							&& readWord.endsWith("Tz###")) {
						String data = readWord.substring("###Tz".length(),
								readWord.length() - "Tz###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 26.txt", data, true);

					} else if (readWord.startsWith("###Tab")
							&& readWord.endsWith("Tab###")) {
						String data = readWord.substring("###Tab".length(),
								readWord.length() - "Tab###".length());
						this.persistenceController.CreateNewFileForTheResults(
								"Método 27.txt", data, true);
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// Generate a simple system log.
		String data = "††Total of files read: " + this.totalOfFilesOnDirectory
				+ "\n" + "Promessa Cumprida! =)";
		this.persistenceController.CreateNewFileForTheResults("System_Log.txt",
				data,false);

	}

	// Get the name and the quantity of the files on directory
	public void ListTheFilesOnDirectory() {

		// List the files
		try {
			this.filesRead = this.currentDirectory.listFiles(new FileFilter() {
				public boolean accept(File pathname) {
					return pathname.getName().toLowerCase()
							.endsWith(fileExtensionName);
				}
			});
			if (filesRead.length == 0) {
				throw new RunningTimeReaderException(
						"files named by the chosen extension were not found in this directory"
								+ "! Try another extension or use another directory!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.totalOfFilesOnDirectory = Integer.toString(this.filesRead.length);

		fileNames = new String[filesRead.length];

		for (int i = 0; i < filesRead.length; i++) {
			fileNames[i] = filesRead[i].getName();
		}
	}

	// Print the file content
	public void PrintFileContent(String typeOfReading) {

		try {
			if (this.filesRead.length == 0) {
				throw new RunningTimeReaderException("No file was read!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (typeOfReading.equalsIgnoreCase("byWord")) {

			for (File file : this.filesRead) {
				System.out.println("[--> "
						+ "BEGINNING OF PRINTING CONTENT OF '" + file.getName()
						+ "' <--]\n");

				this.ReadFileByEachWord(file);

				System.out.println("\n\n[--> " + "END OF PRINTING CONTENT OF '"
						+ file.getName() + "' <--]\n-*-\n\n");
			}
		} else if (typeOfReading.equalsIgnoreCase("byLine")) {

			for (File file : this.filesRead) {
				System.out.println("[--> "
						+ "BEGINNING OF PRINTING CONTENT OF '" + file.getName()
						+ "' <--]\n");

				this.ReadFileByEachLine(file);

				System.out.println("\n\n[--> " + "END OF PRINTING CONTENT '"
						+ file.getName() + "' <--]\n-*-\n\n");
			}
		}

	}

	// Print the file names
	public void PrintFileNames() {
		try {
			if (this.filesRead.length == 0) {
				throw new RunningTimeReaderException("No file was read!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n[--> FILE NAMES READ <--]");
		for (int i = 0; i < filesRead.length; i++) {
			System.out.println("[" + i + "]" + " " + filesRead[i].getName());
		}
	}

	private void ReadFileByEachWord(File fileToRead) {
		try {
			File file = fileToRead;
			FileInputStream in = new FileInputStream(file);
			Scanner scanner = new Scanner(in);

			while (scanner.hasNext()) {
				String readLine = scanner.next();
				System.out.println(readLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// I think this method will be not necessary!
	private void ReadFileByEachLine(File fileToRead) {
		File arq = fileToRead;

		try {
			// Signaling that the file will be read...
			FileReader fileReader = new FileReader(arq);

			// We create the bufferReader object that offers us the reading
			// method readLine ()...
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			// String the will receive each line of the file...
			String line = "";

			// We make a loop line by line in the file while it is different
			// from null. The readLine () method returns the row position in the
			// loop for the variable line.
			while ((line = bufferedReader.readLine()) != null) {
				// printing the line
				System.out.println(line);
			}

			// release the flow of objects and close the file
			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}