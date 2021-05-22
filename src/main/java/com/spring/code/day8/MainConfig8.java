package com.spring.code.day8;

import com.spring.code.day8.bean.Bird;
import com.spring.code.day8.bean.CarService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;


//<context:property-placeholder location="classpath:application.properties" />
//@PropertySource读取外部配置文件中的k/v保存到运行环境变量中   使用${}可以读取配置文件中的变量
@PropertySource("classpath:/application.properties")
@Configuration
public class MainConfig8 {

    @Bean("BIRD")
    public Bird bird() {
        return new Bird();
    }

//    @Bean
    public CarService carService() {
        return new CarService();
    }

    @Value("NORMAL")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

//    @Value("#{carService.carName}")
    private String carName;

    @Value("classpath:/file.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${bird.name}")
    private String name;

    @Autowired
    private Environment environment;

//    @Bean
    //    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }


    public void systemOut() throws IOException {
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNumber);
        System.out.println(carName);
        System.out.println(IOUtils.toString(testFile.getInputStream()));
        System.out.println(IOUtils.toString(testUrl.getInputStream()));
        System.out.println(name);
        System.out.println(environment.getProperty("bird.nikename"));
    }

}
