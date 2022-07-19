package com.minecraftnoob.readingfear.level7project;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.Collections;
@Configuration @EnableSwagger2
public class DocConf {
    @Bean
    public Docket API() {
        return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(false).select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build().apiInfo(new ApiInfo("Level 7 Project", "ReadingFear's Level 7 Project", "1.0.0", null, new Contact("ReadingFear", "readingfear.minecraftnoob.com", null), null, null, Collections.emptyList()));
    }
}