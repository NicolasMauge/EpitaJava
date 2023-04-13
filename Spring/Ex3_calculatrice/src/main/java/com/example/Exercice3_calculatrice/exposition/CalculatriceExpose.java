package com.example.Exercice3_calculatrice.exposition;

import com.example.Exercice3_calculatrice.application.Calculatrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class CalculatriceExpose {
    @Autowired
    Calculatrice calc;

    @GetMapping("/add/{a}/{b}")
    public int additionne(@PathVariable("a") int a, @PathVariable("b") int b) {
        return calc.additionne(a, b);
    }

    @GetMapping("/minus/{a}/{b}")
    public int soustraction(@PathVariable("a") int a, @PathVariable("b") int b) {
        return calc.soustraction(a, b);
    }

    @GetMapping("/times/{a}/{b}")
    public int multiplication(@PathVariable("a") int a, @PathVariable("b") int b) {
        return calc.multiplication(a, b);
    }

    @GetMapping("/divide/{a}/{b}")
    public double division(@PathVariable("a") int a, @PathVariable("b") int b) {
        if(b!=0) {
            return calc.division(a, b);
        } else {
            return 0.0;
        }
    }

    @GetMapping("/square/{a}")
    public double square(@PathVariable("a") int a) {
        return calc.square(a);
    }
}
