package com.calculator.Controller;

import com.calculator.Modal.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class MathOperationsController {
    @GetMapping("/")
    public String result(Model model)
    {
        model.addAttribute("operator","+");
        model.addAttribute("view","views/CalculatorApp");
        return "base-layout";
    }
    @PostMapping("/")
    public String result(@RequestParam String leftOperand, @RequestParam String operator, @RequestParam String rightOperand
        , Model model)
        {
            double leftNumber;
            double rightNumber;
            try
            {
                leftNumber = Double.parseDouble(leftOperand);

            }
            catch (NumberFormatException e)
            {
                leftNumber = 0;
            }
            try
            {
                rightNumber = Double.parseDouble(rightOperand);

            }
            catch (NumberFormatException e)
            {
                rightNumber = 0;
            }
            Operations operations = new Operations(leftNumber,rightNumber,operator);
            double result = operations.calculateResult();
            model.addAttribute("leftOperand",leftNumber);
            model.addAttribute("operator",operator);
            model.addAttribute("rightOperand",rightNumber);
            model.addAttribute("result",result);
            model.addAttribute("view","views/CalculatorApp");
            return "base-layout";

        }

}
