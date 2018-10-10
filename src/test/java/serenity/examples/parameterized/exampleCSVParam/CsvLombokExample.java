package serenity.examples.parameterized.exampleCSVParam;

import lombok.Getter;
import lombok.Setter;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("F:\\Java\\Idea Workspace\\SerenityParameterizedTest\\src\\test\\resources\\test-data.csv")
public class CsvLombokExample
{
   @Getter @Setter String name;
   @Getter @Setter String age;
   @Getter @Setter String placeOfBirth;

    public CsvLombokExample()
    {    }

    @Qualifier
    public String getQualifier()
    {
        return name;
    }

    @Test
    public void data_driven_test()
    {
        System.out.println(this.name + "/" + this.age + "/" + this.placeOfBirth);
    }
}
