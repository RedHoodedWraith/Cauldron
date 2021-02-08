package nz.nightwind.Cauldron;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Arrays;

@SpringBootApplication
@EnableAsync
public class Runner {

    public static void main(String... args){
        SpringApplication.run(Runner.class, args);
    }
}
