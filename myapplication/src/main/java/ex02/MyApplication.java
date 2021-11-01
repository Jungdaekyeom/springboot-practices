package ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

// 다른거 달 필요 없이 SpringBootConfiguration 하나면 됨
@SpringBootConfiguration
public class MyApplication {

	@Bean
	public MyComponent myComponent() {
		return new MyComponent();
	}

	public static void main(String[] args) {
		try (ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {

		}
	}
}
