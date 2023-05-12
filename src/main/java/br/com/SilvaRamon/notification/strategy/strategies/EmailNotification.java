package br.com.SilvaRamon.notification.strategy.strategies;

import br.com.SilvaRamon.notification.strategy.interfaces.INotification;
import org.springframework.stereotype.Component;

@Component("EmailNotification")
public class EmailNotification implements INotification {

    @Override
    public void execute() {
        System.out.println("Sending e-mail notification!");
    }

}
