import java.io.File;
import java.io.IOException;

public class ReadingText {

    public static void main(String args[]) throws IOException {
        String pathOfPdf="C:\\Users\\atulr\\Downloads\\PaySlips";
        File[] files = new File(pathOfPdf).listFiles();
        for (File file : files)
            PrintInfo(file.toString());

    }

    public static void PrintInfo(String filename) throws IOException {

        ReturnPdfText returnPdfText= new ReturnPdfText();
        ExtractKeyWords extractKeyWords = new ExtractKeyWords();
        String result=returnPdfText.getText(filename);
        Payment payment=new Payment();
        CsvWriter csvWriter=new CsvWriter();
        payment.setNetPay(extractKeyWords.getTextBetweenTwoWords(result,"Net Pay:","THIS"));
        /*Replace Replace Me with  your super number*/
        payment.setSuperanuation(extractKeyWords.getTextBetweenTwoWords(result,"067788","TOTAL").split(" ",2)[0]);
         if(payment.getSuperanuation().contains("0.00"))
             payment.setSuperanuation(extractKeyWords.getTextBetweenTwoWords(result,"YOUR SUPER FUNDS","TOTAL").split(" ",2)[0]);

        payment.setTax(extractKeyWords.getTextBetweenTwoWords(result,"PAYG Tax","TOTAL").split(" ",2)[0]);
        payment.setTotalEarning(extractKeyWords.getTextBetweenTwoWords(result,"Total Earnings:","Net Pay"));
        payment.setPayPeriod(extractKeyWords.getTextBetweenTwoWords(result,"Pay Period:","Payment Date").split(" ",2)[0]);
        payment.setEndPeriod(extractKeyWords.getTextBetweenTwoWords(result,"Pay Period:","Payment Date").split(" ",2)[1]);
        csvWriter.Write(payment.PrintDetails());
    }
}

