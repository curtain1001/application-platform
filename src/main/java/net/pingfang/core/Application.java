package net.pingfang.core;

import net.pingfang.licenseplate.config.EnableLicensePlateModule;
import net.pingfang.plc.config.EnablePlcModule;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 * @author 王超
 * @description TODO
 * @date 2022-04-21 18:30
 */
@SpringBootApplication
@EnableLicensePlateModule(enable = true)
@EnablePlcModule(enable = true)

public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }
}
