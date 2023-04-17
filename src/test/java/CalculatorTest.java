import lesson6.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    @BeforeAll
    public static void classSetUp(){
        System.out.println("This is general setup");
    }

    @AfterAll
    public static void classClose(){
        System.out.println("Closing all connections after test is done");
    }
    @Test
    public void summaryTest() {
        double a = 5;
        double b = 6;

        double expectedResult = 11;

        double actualResult = Calculator.calculate(a, b, Calculator.Type.ADD);

        assertEquals(expectedResult, actualResult, "ADD res is incorrect");
    }

    @Test
    public void divTest(){
            double a=14;
            double b =7;

            double expectedResult = 2;

            double actualResult = Calculator.calculate(a,b, Calculator.Type.DEVISE);

            assertNotNull(actualResult, "null was returned");
            assertEquals(expectedResult, actualResult, "DIV res is incorrect");
            assertTrue(actualResult == expectedResult);
            assertTrue(actualResult>0);
            assertFalse(a==b);

    }
    @BeforeEach
    public void BeforeThisTest(){
        System.out.println("Setup before error test ");
    }

    @ParameterizedTest
    @ValueSource(doubles = {-10, 2, 0, 2736574}  )
    public void multParamsTest (double a){

        double b = 74;

        double expectedResult = a*b;

        double actualResult = Calculator.calculate(a, b, Calculator.Type.MULTIPLY);

        assertEquals(expectedResult, actualResult, "MULTIPLY res is incorrect");
    }

    @ParameterizedTest
    @EnumSource (Calculator.Type.class)
    public void enumParamsTest (Calculator.Type type){

        double a = 74;
        double b = 74;


        double actualResult = Calculator.calculate(a, b, type);
        assertNotNull(actualResult, "I have a result");
        assertTrue(actualResult>0, "Have to be bigger than 0");
    }

    static Stream<Arguments> paramsForCalculate(){
        return Stream.of(
                Arguments.of(2,2,4, Calculator.Type.ADD),
                Arguments.of(2,2,4, Calculator.Type.MULTIPLY),
                Arguments.of(2,2,1, Calculator.Type.DEVISE),
                Arguments.of(2,2,0, Calculator.Type.SUBTRACT)
        );
    }
    @ParameterizedTest
    @MethodSource ("paramsForCalculate")
    public void methodParamTest (double a, double b, double expected, Calculator.Type type){
        double actualResult = Calculator.calculate(a,b,type);
        assertEquals(expected, actualResult);
    }

    @Test
    @DisplayName("Nullpointer Exception test")
    public void errorTest(){

        double a=14;
        double b =3;

        double expectedResult = 10;

        assertThrows(NullPointerException.class,() -> {
            Calculator.calculate(a,b, null);
        }
        );
    }

    @ParameterizedTest
    @CsvSource({"2,2,4,ADD", "3,2,1,SUBTRACT"})
    public void csvParamTest (double a, double b, double expected, Calculator.Type type){
        double actualResult = Calculator.calculate(a,b,type);
        assertEquals(expected, actualResult);

    }
}
