//package net.pingfang.core.config;
//
//import javax.sql.DataSource;
//import liquibase.database.Database;
//import liquibase.integration.spring.SpringLiquibase;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.DefaultResourceLoader;
//
///**
// * @author 王超
// * @description TODO
// * @date 2022-04-26 0:08
// */
////@Configuration
//public class LiquibaseConfiguration {
//
////    @Bean
//    public SpringLiquibase coreLiquibase(DataSource dataSource){
//        SpringLiquibase liquibase = new SpringLiquibase();
//        // 用户模块Liquibase文件路径
//        liquibase.setChangeLog("classpath:database/user/master.xml");
//        liquibase.setDataSource(dataSource);
//        liquibase.setShouldRun(true);
//        liquibase.setResourceLoader(new DefaultResourceLoader());
//        // 覆盖Liquibase changelog表名
////        liquibase.setDatabaseChangeLogTable("user_changelog_table");
////        liquibase.setDatabaseChangeLogLockTable("user_changelog_lock_table");
////        liquibase.setChangeLogParameters();
//        return liquibase;
//    }
//
//}
