import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @version 1.0 -- 06/04/013 -03:04hrs
 * @author Ewerton Lopes
 *
 */
public class Persistence {

	File defaultDirectory;

	public Persistence(){
		this.defaultDirectory = new File(System.getProperty("user.dir")+"\\TimeReaderResults");
		if (!defaultDirectory.exists()) {
			defaultDirectory.mkdir();
		}
	}
	public Persistence(String directory) {
		this.defaultDirectory = new File(directory);
		if (!defaultDirectory.exists()) {
			defaultDirectory.mkdir();
		}

	}

	public void CreateNewFileForTheResults(String filename, String data, boolean overwrite) {

		File file = new File(this.defaultDirectory, filename);
		try {

			// Create the file fisically
			file.createNewFile();

			// We must pass the constructor of FileWriter which file to
			// manipulate. This constructor accepts two types of parameters,
			// File or String. The true parameter indicates that we rewrite the
			// file without erasing what is already there. The "false" erase the
			// contents of the file and write the new content.
			// If you do not use the 2nd parameter, it is false by default. Most
			// importantly, this line opens the file stream ...
			FileWriter fileWriter = new FileWriter(file, true);

			// Using the PrintWriter class to writte fisically in the file
			PrintWriter printWriter = new PrintWriter(fileWriter);

			// writte line by line in the file.
			printWriter.println(data);

			// relese the writting in file.
			printWriter.flush();

			// At the end we, close the file.
			printWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
