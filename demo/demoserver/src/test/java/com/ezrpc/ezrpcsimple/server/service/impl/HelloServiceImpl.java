package com.ezrpc.ezrpcsimple.server.service.impl;

import com.ezrpc.ezrpcsimple.api.RpcService;
import com.ezrpc.ezrpcsimple.client.HelloService;

@RpcService(HelloService.class) // 指定远程接口
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }

    @Override
    public String hello(String name, String nickName)
        {
            return nickName+"Hello! " + name;
    }
}