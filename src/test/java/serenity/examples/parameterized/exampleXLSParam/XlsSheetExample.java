package serenity.examples.parameterized.exampleXLSParam;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.TestData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
@Concurrent
public class XlsSheetExample
{
    private double a;
    private double b;
    private double aTimesB;

    @TestData
    public static Collection spreadsheetData() throws Exception
    {
        InputStream spreadsheet = new FileInputStream("src/test/resources/aTimesB.xls");
        return new XlsSheetDataProvider(spreadsheet).getData();
    }

    public XlsSheetExample(double a, double b, double aTimesB)
    {
        super();
        this.a = a;
        this.b = b;
        this.aTimesB = aTimesB;
    }

    @Test
    public void shouldCalculateATimesB()
    {
        double aTimesBResult = a * b;
        System.out.println();
        System.out.print(a+"   ");
        System.out.print(b+"    ");
        System.out.println(aTimesB);
        Assert.assertEquals(aTimesBResult,aTimesB,0.2);
    }
}

