package com.example.demo.test;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.callback.OnError;
import com.dtflys.forest.callback.OnSuccess;

public interface MyClientService {

    @Get("www.baidu.com")
    String doGet(OnSuccess<String> onSuccess, OnError onError);
}
