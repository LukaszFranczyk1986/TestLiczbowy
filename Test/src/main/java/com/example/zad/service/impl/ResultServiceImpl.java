package com.example.zad.service.impl;

import com.example.zad.service.ResultService;

public class ResultServiceImpl implements ResultService {

    @Override
    public Long findNumber(Long numbers[]) {
        int odd = 0;
        int even = 0;
        Long searchingNumber = 0L;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0)
                even++;
            else
                odd++;
        }

        if(even > odd){
            for (Long number : numbers) {
                if(number%2!=0)
                    searchingNumber = number;
            }
        }
        else{
            for (Long number : numbers) {
                if(number%2==0)
                    searchingNumber = number;
            }
        }
        return searchingNumber;
    }

    @Override
    public Long[] convertStringToNumberList(String numbers) {
        String[] split = numbers.split(",");
        Long[] numbersArray = new Long[split.length];

        for (int i = 0; i < split.length; i++) {
            try {
                numbersArray[i] = Long.valueOf(split[i]);
            }
            catch (NumberFormatException e){
                System.err.println("Wrong data entered!");
                return new Long[0];
            }
        }
        return numbersArray;
    }
}
