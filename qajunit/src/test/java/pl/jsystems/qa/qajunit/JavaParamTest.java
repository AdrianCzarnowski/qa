package pl.jsystems.qa.qajunit;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

@Tags({@Tag("junit"), @Tag("smoke"), @Tag("param")})
@DisplayName("Param test")

public class JavaParamTest {

    @DisplayName("Param test : ")
    @ParameterizedTest(name = "Parameter test: {0}")
    @ValueSource(ints = {5, 15, 25})
    public void firstParamTest(int number) {

        assertEquals(number % 5, 0);

    }


    @DisplayName("Param test : ")
    @ParameterizedTest(name = "Parameter test: {0}")
    @ValueSource(strings = {"Hello", "Hello junit", "Hello students"})
    public void stringParamTest(String param) {

        Truth.assertThat(param).contains("Hello");

    }
    @DisplayName("Param test with multi param.")
    @ParameterizedTest(name = "Parameter test: {0}")
    @CsvSource(value = {"Hello, 5", "Hello junit, 5", "Hello students, 25"})
    public void multiParamTest(String param, int number) {

        Truth.assertThat(param).contains("Hello");
        assertEquals(number % 5, 0);
    }

    @DisplayName("Param test with multi param.")
    @ParameterizedTest(name = "Parameter test: {0}")
    @CsvFileSource(resources ="/plik.csv")
    public void multiCsvTest(String param, int number) {

        Truth.assertThat(param).contains("Hello");
        assertEquals(number % 5, 0);
    }
//    enum ParamEnum {
//        ENUM_ONE,
//        ENUM_TWO
    }

