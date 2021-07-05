package com.example.demo.test.impl;


import com.dtflys.forest.exceptions.ForestRuntimeException;
import com.dtflys.forest.http.ForestRequest;
import com.dtflys.forest.http.ForestResponse;
import com.example.demo.test.MyClientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {

    @Autowired
    MyClientService myClientService;

    @Test
    public void client(){
        myClientService.doGet( (String resText, ForestRequest request, ForestResponse response) -> {
                    // 成功响应回调
                    System.out.println(resText);
                },
                (ForestRuntimeException ex, ForestRequest request, ForestResponse response) -> {
                    // 异常回调
                    System.out.println(ex.getMessage());
                });
    }
}
