package Controller;



import Service.CalculatorService;
import Service.DivisionByZeroException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String helloMessage() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Double num1,
                       @RequestParam(required = false) Double num2) {
        return calculatorService.printSolutionPlus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Double num1,
                        @RequestParam(required = false) Double num2) {
        return calculatorService.printSolutionMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Double num1,
                           @RequestParam(required = false) Double num2) {
        return calculatorService.printSolutionMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Double num1,
                         @RequestParam Double num2) throws DivisionByZeroException {
                return calculatorService.printSolutionDivide(num1, num2);
    }

}

