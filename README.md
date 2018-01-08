

## 关于RPC

 
调用的本质：
1、 底层传输体现的就是通过特定协议对指定端口的读写。
2、 跨机器的服务访问。
如图

![image](https://pic1.zhimg.com/50/45366c44f775abfd0ac3b43bccc1abc3_hd.jpg)

主要解决问题：
1、方法发现
2、方法统一调用
3、序列化以及反序列化等。
4、成熟的RPC框架还要有企业级特性 ，比如：方法治理、方法监控、安全性等等


# 关于ezrpc
## 概要
一个基于springboot的兼容TCP和HTTP的RPC框架
本质上是对于各种RPC关键要素的抽象与工厂实现（基于需求，多种实现）
并具有企业级特征

## 高可用
## 高扩展
## 高性能
## 企业级特性
#### 可治理
#### ...

 

## 关于ezrpc-simple

1. 概要
一个入门级的基于TCP的RPC框架
从这里进入RPC的世界.....
从这里进入MICRO SERVICE的世界....
从这里进入SERVICE MESH的世界....
从这里进入SERVERLESS的世界.....


备注：
本程序只做学习用，如果用于生产请选择EZRPC


2. 特征
本framework和demo的原型摘自网络。
基于spring boot构建
RPC方法通过注解指定
NIO的请求响应异步处理模型（基于netty）


3. 用法 
启动demoserver中的startup
执行democlient中的UT（HelloServiceTest）



