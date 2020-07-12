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
    