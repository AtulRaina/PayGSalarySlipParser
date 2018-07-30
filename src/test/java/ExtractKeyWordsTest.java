import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class ExtractKeyWordsTest {

    @Test
           public  void ExtractLineWithTextTest() throws IOException {
    ExtractKeyWords extractKeyWords = new ExtractKeyWords();
    ReturnPdfText returnPdfText= new ReturnPdfText();

    assertEquals("Hello World",extractKeyWords.getLineWithText(returnPdfText.getText(CommonThins.getFileName()),"Hello World"));

}

@Test
    public void ExtractTextBetweenTwoWordTest() throws IOException {
    ExtractKeyWords extractKeyWords = new ExtractKeyWords();
    ReturnPdfText returnPdfText= new ReturnPdfText();

    assertEquals(extractKeyWords.getTextBetweenTwoWords(returnPdfText.getText(CommonThins.getSample()),"demonstration","file"),".pdf");

    }

}