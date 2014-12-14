import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.mapper.MapperFactoryBean

// Place your Spring DSL code here
beans = {
//    personService(PersonService) {
//        dataSource = ref("dataSource")
//    }

    sqlSessionFactory(SqlSessionFactoryBean) {
        dataSource = ref("dataSource")
        mapperLocations = "classpath:com.shangpin.mybatis.mappers.*Mapper.xml"
        typeAliasesPackage = "com.shangpin.mybatis.model"
    }

    personMapper(MapperFactoryBean) {
        mapperInterface = "com.shangpin.mybatis.mapper.PersonMapper"
        sqlSessionFactory = ref("sqlSessionFactory")
    }
}
