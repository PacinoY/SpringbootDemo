package com.imooc.demo.config.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;


@Configuration//告诉spring到这个类来寻找配置
@EnableTransactionManagement//开启事务
public class TransactionManagementConfiuration implements TransactionManagementConfigurer{

        @Autowired
        private DataSource dataSource;
        @Override
        //构造方法，对数据源进行事务配置
        public PlatformTransactionManager annotationDrivenTransactionManager() {
            return new DataSourceTransactionManager(dataSource);
        }
}
