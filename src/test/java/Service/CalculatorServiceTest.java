package Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static Service.Contstants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();
@Test
    public void shouldReturnTwoWhenSumOneAndOne(){
    int result = CalculatorService.add(ONE, ONE);
      Assertions.assertEquals(ONE+ONE, result);
      }
@Test
    public void shouldReturnThreeWhenSumTwoAndOne(){
    int result = CalculatorService.add(TWO, ONE);
      assertEquals( TWO + ONE, result);
}@Test
    public void shouldReturnOneWhenSubtractTwoAndOne(){
    int result = CalculatorService.subtract(TWO, ONE);
      assertEquals( TWO - ONE, result);
}@Test
    public void shouldReturnZeroWhenSubtractOneAndOne(){
    int result = CalculatorService.subtract(ONE, ONE);
      assertEquals( ONE - ONE, result);
}@Test
    public void shouldReturnThoWhenMultiplyOneAndTwo(){
    int result = CalculatorService.multiply( ONE,TWO);
      assertEquals( ONE * TWO, result);
}@Test
    public void shouldReturnOneWhenMultiplyOneAndOne(){
    int result = CalculatorService.multiply(ONE, ONE);
      assertEquals( ONE * ONE, result);
}@Test
    public void shouldReturnTwoWhenDivideTwoAndOne(){
    int result = CalculatorService.divide(TWO, ONE);
      assertEquals( TWO / ONE, result);
}@Test
    public void shouldReturnOneWhenDivideOneAndOne(){
    int result = CalculatorService.divide(ONE, ONE);
      assertEquals( ONE / ONE, result);
}
    @Test
    public void shouldThrowDivisionByZeroExceptionWhenDivideByZero(){
        int result = CalculatorService.divide(ONE, ONE);
        DivisionByZeroException divisionByZeroException;
        divisionByZeroException = assertThrows(DivisionByZeroException.class, () -> CalculatorService.divide(ONE, ZERO));
    }
}