# SpringCloud-Study
SpringCloud 从零构建学习项目
## 服务注册中心
Eureka（不更新）、zooKeeper、Nacos、 Consul 

1. Eureka有两个组件：Eureka Serve 和Eureka Client
   
   Eureka Server 提供注册服务  
   
   微服务节点通过配置启动后，可以再EurekaServer进行注册，这样在EurekaServer中 服务注册表中存储所有可用服务
   节点信息，在界面中可以直观看到。  
   
   Eureka Client 按通过注册中心进行访问
   
   内置、一个轮询的负载均衡器物，应用启动后，会像Eureka Server 发送心痛（默认周期30s）
   如果多个周期，未收到心跳，Eureka Server会从服务注册将该节点移除（默认90s）
   
* 集群Eureka原理
  
  互相注册，相互守望。 A注册中心-》B注册中心—》A注册中心

* 集群Eureka配置

```yml
eureka:
  instance:
    hostname: eureka7001.com #eureka服务端的实例名称
  client:
    # false表示不向注册中心注册自己
    register-with-eureka: false
    # false表示自己端就是注册中心,我的职责就是维护服务实例,并不需要检索服务
    fetch-registry: false
    service-url:
      # 设置与Eureka Server交互的地址查询服务和注册服务都需要依赖这个地址
      # 单机 defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
      # 集群主要是两个server相互注册
      defaultZone: http://eureka7002.com:7002/eureka/
#      defaultZone: http://eureka7001.com:7001/eureka/
#      defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
#  server:
#    #关闭自我保护模式，保证不可用服务被及时删除
#    enable-self-preservation: false
#    eviction-interval-timer-in-ms: 2000
```   
 * Ribbon与Eureka整合
   
   客户端直接调用Eureka服务， @LoadBalanced注解就实现负载均衡
  
 
    