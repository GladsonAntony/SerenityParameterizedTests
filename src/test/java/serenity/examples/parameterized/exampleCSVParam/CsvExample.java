package serenity.examples.parameterized.exampleCSVParam;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("F:\\Java\\Idea Workspace\\SerenityParameterizedTest\\src\\test\\resources\\test-data.csv")
@Concurrent
public class CsvExample {

    private String name;
    private String age;
    private String placeOfBirth;

    public CsvExample() {
    }

    @Qualifier
    public String getQualifier() {
        return name;
    }

    @Test
    public void data_driven_test() {
        System.out.println(getName() + "/" + getAge() + "/" + getPlaceOfBirth());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
}
