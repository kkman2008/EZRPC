package com.ezrpc.ezrpcsimple.client;


import com.ezrpc.ezrpcsimple.server.RpcProxy;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Startup.class)

public class HelloServiceTest {

    @Autowired
    private RpcProxy rpcProxy;

    @Test
    public void helloTest() {

        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello("World");
        System.out.println(result);
        Assert.assertEquals("Hello! World", result);

    }


    @Test
    public void helloNickNameTest() {

        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello("World","rpc-simple");
        System.out.println(result);


    }
}