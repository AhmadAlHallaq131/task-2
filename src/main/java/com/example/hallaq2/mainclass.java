package com.example.hallaq2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class mainclass {
    private Class1 class1main ;
    private Class2 class2main ;
    @Autowired
    public mainclass( Class1 class1 , Class2 class2 ){
        class1main = class1;
        class2main = class2;
        System.out.println(1);
    }

}
