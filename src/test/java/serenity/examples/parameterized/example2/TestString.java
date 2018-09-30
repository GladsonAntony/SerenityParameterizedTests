package serenity.examples.parameterized.example2;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
@Concurrent
public class TestString
{
    @TestData
    public static Collection<Object[]> testData()
    {
        return Arrays.asList(new Object[][]{
                {"cats"},
                {"dogs"},
                {"ferrets"},
                {"rabbits"},
                {"canaries"}
        });
    }

    private final String searchTerm;

    public TestString(String searchTerm)
    {
        this.searchTerm = searchTerm;
    }

    @Test
    public void shouldInstantiatedPageObjectsForADataDrivenWebTest()
    {
        System.out.println(searchTerm);

    }
}

