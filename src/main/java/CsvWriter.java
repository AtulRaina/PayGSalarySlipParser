import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CsvWriter {

    //i generate file based on date
    // then write to it
    // constructor checks file is there if not then create
    // write just writes
    FileWriter fileWriter;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    String filename;

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    CsvWriter() throws IOException {
        Date date = new Date();
        Format formatter = new SimpleDateFormat("YYYY-MM-dd");
        this.setFileWriter(new FileWriter("c:\\REPORTS\\TechTide_" + formatter.format(date) + ".csv", true));

    }

    public void Write(String text) throws IOException {
        fileWriter.write(text);
        fileWriter.close();
    }

}
