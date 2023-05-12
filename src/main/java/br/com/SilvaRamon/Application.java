package br.com.SilvaRamon;

import br.com.SilvaRamon.notification.interfaces.INotificationService;
import br.com.SilvaRamon.notification.strategy.enums.NotificationType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final INotificationService iNotificationService;

	public Application(INotificationService iNotificationService) {
		this.iNotificationService = iNotificationService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {
		iNotificationService.sendEmailNotification();
		iNotificationService.sendSmsNotification();
	}

}
