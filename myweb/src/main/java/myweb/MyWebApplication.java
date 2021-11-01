package myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyWebApplication {

	@RestController
	public class HelloController {
		// localhost:8888/hello => 한큐에 바로 됨 ㅋ
		@GetMapping("/hello")
		public String hello() {
			return "<h1>Hello World</h1>";
		}
	}

	@Controller
	public class HelloController2 {
		// localhost:8888/hello => 한큐에 바로 됨 ㅋ
		@GetMapping("/hello")
		public String hello() {
			return "/WEB-INF/views/hello.jsp";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(MyWebApplication.class, args);
	}

}
