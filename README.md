training-grails-ibatis
======================

Grails的GORM功能已经极其强大，但是在复杂的查询时候不是很方便，iBatis在查询能力上非常灵活而且强大。
Grails-iBatis插件版本老旧，而且官方文档我一直没看到应该如何使用，总是报错，所以我使用原生态的模式，基于Spring-iBatis配置方式集成了这个好用的iBatis.

1、配置依赖，查看Build-Config.groovy
2、查看resources.groovy中的配置
3、为了区分GORM干扰，我把其他文件都放入到了src/groovy(包括Mapper Model 和XML映射文件)
4、如何使用，一般我们都是注入使用  查看UserController 有注入用例。。。




