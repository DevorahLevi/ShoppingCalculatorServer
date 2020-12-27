package com.example.ShoppingCalculatorServer.service;

import com.example.ShoppingCalculatorServer.model.ShoppingList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class ShoppingCalculatorServerService
{

    public Object calculateTotal(ShoppingList shoppingList)
    {
        try {
            return Arrays.stream(shoppingList.getList()).sum();

        } catch (HttpClientErrorException e) {
            return new ResponseEntity<String>(e.getMessage(), e.getStatusCode());
        }
    }
}