package com.example.ShoppingCalculatorServer.controller;

import com.example.ShoppingCalculatorServer.model.ShoppingList;
import com.example.ShoppingCalculatorServer.service.ShoppingCalculatorServerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/shoppingListCalculator")
public class ShoppingCalculatorServerController
{
    private final ShoppingCalculatorServerService shoppingCalculatorServerService;

    @PostMapping("/calculateListTotal")
    public Object calculateListTotal(@RequestBody ShoppingList shoppingList)
    {
        return shoppingCalculatorServerService.calculateTotal(shoppingList);
    }
}