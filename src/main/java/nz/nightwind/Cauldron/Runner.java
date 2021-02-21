package nz.nightwind.Cauldron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Runner {

    public static void main(String... args){
        SpringApplication.run(Runner.class, args);
    }
}
