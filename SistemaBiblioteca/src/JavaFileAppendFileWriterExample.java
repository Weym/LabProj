import java.io.*;

public class JavaFileAppendFileWriterExample {

	public static void main(String[] args) {

		JavaFileAppendFileWriterExample a = new JavaFileAppendFileWriterExample();
		a.appendToCheckbook();

	} // end main

	public void appendToCheckbook() {

		BufferedWriter bw = null;

		try {
			// APPEND MODE SET HERE
			bw = new BufferedWriter(new FileWriter("checkbook.txt", true));
				bw.write("400:08311998:Inprise Corporation:249.95");
			bw.newLine();
			bw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			// always close the file
			if (bw != null)
				try {
					bw.close();
				} catch (IOException ioe2) {
					// just ignore it
				}
		} // end try/catch/finally

	} // end test()
} // end class