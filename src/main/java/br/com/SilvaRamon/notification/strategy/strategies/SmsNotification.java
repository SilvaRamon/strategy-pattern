package br.com.SilvaRamon.notification.strategy.strategies;

import br.com.SilvaRamon.notification.strategy.interfaces.INotification;
import org.springframework.stereotype.Component;

@Component("SmsNotification")
public class SmsNotification implements INotification {

    @Override
    public void execute() {
        System.out.println("Sending SMS notification!");
    }

}
