package nz.nightwind.Cauldron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Runner {

//    @Bean
//    ServletRegistrationBean myServletRegistration () {
//        ServletRegistrationBean srb = new ServletRegistrationBean();
//        srb.setServlet(new CauldronServlet());
//        return srb;
//    }

    public static void main(String... args){
        SpringApplication.run(Runner.class, args);
    }
}
