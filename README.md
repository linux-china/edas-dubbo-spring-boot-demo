# EDAS Dubbo spring boot demo 说明

# 本机如何测试

* 启动本地的zookeeper
```
docker-compose up -d
```
* 在IDE中运行DubboProvider
* 在IDE中运行DubboConsumer
* 打开dubbo.http点击运行http target

### Pandora

在 EDAS 中 dubbo 是以 Dubbo的商业版 的形式运行的，代码需要依赖于 pandora 才能运行。
更多介绍，请参看 [名词解释](https://help.aliyun.com/document_detail/66171.html?spm=a2c4g.11186623.6.657.BQGZ7v)

### 轻量级配置中心

Dubbo 以商业版形式运行时，注册中心同时支持 dubbo 原生注册中心和 EDAS 注册中心。

如果在本地开发中也想使用dubbo商业版，请在本机安装轻量级配置中心，详情参考[https://help.aliyun.com/document_detail/44163.html?spm=a2c4g.11186631.6.636.qwOh4H](https://help.aliyun.com/document_detail/44163.html?spm=a2c4g.11186623.6.636.Y7sSuw)


