package nz.nightwind.Cauldron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Collections;

@SpringBootApplication
@EnableAsync
public class Runner {

    public static void main(String... args){
        SpringApplication app = new SpringApplication(Runner.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "80"));
        app.run(args);
    }

}
