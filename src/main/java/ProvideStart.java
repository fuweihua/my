import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 提供者服务启动
 * @author Administrator
 *
 */
public class ProvideStart {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo_provider.xml");
		context.start();
		try {
			System.in.read(); //为保证服务一直开着，利用输入流的阻塞来模拟
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
