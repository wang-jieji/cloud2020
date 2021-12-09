# cloud2020
SpringCloud2020 学习项目

项目中遇到的坑
1 如果在微服务项目里，比如从cloud-consumer-order80 的方法 /consumer/payment/create 把serial的一个实参发送到 cloud-provider-payment8001 的方法
  /payment/create 里，如果payment8001的create方法里的参数没有加 @_RequestBody_ 注解，只能接受到一个空参。

2. 在控制层 @Controller 和 @RestController 的区别 
   一、@Controller类中的方法可以直接通过返回String跳转到jsp、ftl、html等模版页面。在方法上加@ResponseBody注解，也可以返回实体对象。
   但如果不配合@ResponseBody注解使用，直接使用@Controller返回实体类，会导致页面报404错误
   
   二、@RestController类中的所有方法只能返回String、Object、Json等实体对象，不能跳转到模版页面。@RestController相当于@ResponseBody + @Controller。
   
3. 配置中心Config 集成RabbitMQ时，配置文件里.yml里要把rabbitmq配置放在Spring标签下
