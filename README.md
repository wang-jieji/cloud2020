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

4. 注解*@Resource注入失败，但是@Autowired*可以注入
   解决:首先定位问题所在，既然有一个注解可以使用，那么问题很大概率上是发生在注解@Resource上面，虽然@Resource比@Autowired好用，
   但是因为是javax包下的，难免会与spring有些配合不当的地方,这是jdk版本的问题.只需要在pom中导入annotation依赖即可
   <dependency>
   <groupId>javax.annotation</groupId>
   <artifactId>javax.annotation-api</artifactId>
   <version>1.2</version>
   </dependency>

   顺便附上常用的三个注入内容的注解
   **@Autowired:**
   作用:自动按照类型注入，只要容器中有唯一的一个bean对象类型和要注
   入的变量类型匹配，就可以注入成功
   如果ioc容器中没有任何bean类型和要注入的变量类型匹配，则报错
   如果ioc容器中有多个类型匹配时，看注入变量的bean属性，如果有
   匹配的名称，则通过，否则报错
   出现位置：
   可以是变量上，也可以是方法上
   细节使用:
   在使用注解注入时，set方法就不是必须的了。

   **@Qualifier:**
   作用；
   在按照类中注入的基础之上，再按照名称注入，它在给类成员注入
   时不能单独使用，但是在给方法参数注入时可以
   属性:
   value:
   用于指定注入bean的id

   **@Resource**
   作用:
   直接按照bean的id注入，可以单独使用
   属性
