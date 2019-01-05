package t5_frame;

public class Topic3 {
    /*
        Spring 概念多，体系复杂，但实际工作中最常用的功能却并不复杂，所以，我们在这里抓主要矛盾。

        Spring IOC
        （1）意义
            控制反转/依赖注入（Spring的作用，Spring IOC的作用）
            控制反转（IOC）：将对象的创建、初始化交给容器；
            依赖注入（DI）：将依赖的注入，也就是属性的赋值，交给容器

            IOC 和 DI，是从两个方面描述了同一问题。

            为什么这样做？
                解耦，
                    1.将应用的创建过程从代码中分离，我们的代码只关注业务，做到职责单一;
                    2.通过面向接口变成，便于我们替换实现类；

            https://www.cnblogs.com/Mr-Rocker/p/7721824.html

        （2）使用
               1.Spring 容器 BeanFactory vs ApplicationContext
                 BeanFactory
                    BeanFactory 是 Spring 的“心脏”，它就是 Spring IoC 容器的实际实现者。
                    Spring 使用 BeanFactory 来实例化、配置和管理 Bean。

                 ApplicationContext（应用上下文）
                    ApplicationContext由BeanFactory派生而来，提供了更多面向实际应用的功能。
                    （1）更方便地加载资源
                    （2）提供了时间发布、监听机制
                    （3）支持国际化
                    （4）提供了父子上下文的概念

                 BeanFactory、ApplicationContext区别：
                    （1）BeanFactory在启动的时候不会去实例化Bean，从容器中拿Bean的时候才会去实例化；
                         ApplicationContext在启动的时候就把所有的Bean全部实例化了。它还可以为Bean配置lazy-init=true来让Bean延迟实例化；
                    （2）ApplicationContext功能更强大（如上），一般情况下我们都使用ApplicationContext

                2.几个概念：
                    Bean：任意一个Java对象，一个组件

                    Bean的注册：将Bean注册到容器中
                               有xml文件配置，注解两种方式

                    属性的注入：将属性（基本值，引用）注入给对象

                    Bean的作用域
                        实例的作用范围：
                        singleton（默认）：每次从容器中取的都是同一个实例（单例模式），
                        prototype：每次从容器中取的都是一个新的实例，
                        request、session、global session
                        https://baijiahao.baidu.com/s?id=1610298792072480906&wfr=spider&for=pc

                3.Bean创建的方式
                    构造函数
                    静态工厂方法
                    实例工厂方法
                    https://blog.csdn.net/magicianjun/article/details/78737840

                4.注入方式
                    基于构造函数
                    基于setter方法
                    基于注解（常用）

                5.自动装配
                    bytype
                         @Autowired是根据类型自动装配的，加上 @Qualifier 则可以根据byName的方式自动装配
                    byname
                         @Resource如有指定的name属性，先按该属性进行byName方式查找装配；其次再进行默认的byName方式进行装配；如果以上都不成功，则按byType的方式自动装配。都不成功，则报异常。

                    @Autowired较常用，@Qualifier也用过

                6.Bean的注册及Bean装配的定义： xml方式 vs 注解方式
                    xml配置：


                    注解配置：


                7.xml配置

                8.注解配置


        （3）容器初始化步骤 & 原理


        （4）Bean的生命周期
     */

}
