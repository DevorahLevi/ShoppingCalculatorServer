package com.example.ShoppingCalculatorServer.service;

import com.example.ShoppingCalculatorServer.model.ShoppingList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShoppingCalculatorServerService
{

    public double calculateTotal(ShoppingList shoppingList)
    {
        double [] list = shoppingList.getList();
        System.out.println(list.length); // throwing a null pointer error
        double total = 0;
        for (int i = 0; i < list.length; i++) //throwing a null pointer error
        {
            total += list[i];
        }
        return total;
    }
}