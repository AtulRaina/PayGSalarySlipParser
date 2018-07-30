import jdk.management.resource.internal.inst.AsynchronousServerSocketChannelImplRMHooks;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class ReturnPdfTextTest {
    @AfterMethod
    public void tearDown() throws Exception {
    }
      @Test
      public  void ReturnPdfTextTest() throws IOException {
         ReturnPdfText returnPdfText= new ReturnPdfText();

          Assert.assertEquals("Hello World",returnPdfText.getText(CommonThins.getFileName()));
      }
}