package demo.captcha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath:KaptchaConfig.xml"})

public class CaptchaApplication {
	public static void main(String[] args) {
		// SpringApplication
		SpringApplication.run(CaptchaApplication.class, args);
	}
}
