package serenity.examples.parameterized.example1;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.UserStoryCode;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;


@RunWith(SerenityParameterizedRunner.class)
@Concurrent
public class TestIntegers
{
    @TestData
    public static Collection<Object[]> testData()
    {
        return Arrays.asList(new Object[][]{
                {1}, {2}, {3}});
    }

    private final int value;

    public TestIntegers(int value)
    {
        this.value = value;
    }

    @Test
    public void shouldExecuteThisTest()
    {
        System.out.println(value);
    }

    @Test
    public void shouldExecuteThisTestToo()
    {
        System.out.println(value);
    }
}
