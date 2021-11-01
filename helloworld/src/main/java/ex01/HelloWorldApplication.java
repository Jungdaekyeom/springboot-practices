package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * 
 * Bootstrap Class
 * 
 * 1. 스프링 부트 어플리케이션의 부트스트래핑(Bootstrapping)
 * 2. 설정 클래스 역할(Configuration Class)
 * 
 */

@SpringBootApplication
public class HelloWorldApplication {
	public static void main(String[] args) {

		/*
		 * 1. 어플리케이션 컨텍스트(Application Context, Spring Container) 생성
		 * 2. 웹어플리케이션 타입(Web Application인 경우, MVC or Reactive)
		 * 3. 어노테이션 스캐닝(Auto) or Configuration 클래스(Explicit)를 통한 Bean 생성 및 등록 
		 * ///// 이제 톰캣이 올라가도 됨
		 * 4. 웹 어플리케이션인 경우(MVC인 경우 톰캣이 필요함) 
		 *    - 내장(embedded) 서버(TomcatEmbeddedServletContainer) 인스턴스 생성 
		 *    - 서버 인스턴스에 웹 어플리케이션을 배포 
		 *    - 서버 인스턴스 실행
		 * 5. 인터페이스 ApplicationRunner 구현 빈의 run() 실행
		 */

//		ConfigurableApplicationContext c = null; // 자원정리
//		try {
//			c = SpringApplication.run(HelloWorldApplication.class, args);
//			System.out.println("OK");
//		} catch(Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			c.close();
//		}
		
		try (ConfigurableApplicationContext c = SpringApplication.run(HelloWorldApplication.class, args)) {

		}
	}
}
