package cn.spring;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class DataSourceTest_ {

    @Test
    public void testDatasource(){

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-datasource.xml");

        DruidDataSource bean = applicationContext.getBean(DruidDataSource.class);

        try {
            System.out.println(bean.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
