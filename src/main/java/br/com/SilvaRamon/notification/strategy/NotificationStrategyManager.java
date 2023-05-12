package br.com.SilvaRamon.notification.strategy;

import br.com.SilvaRamon.notification.strategy.enums.NotificationType;
import br.com.SilvaRamon.notification.strategy.interfaces.INotification;
import br.com.SilvaRamon.notification.strategy.interfaces.INotificationStrategyManager;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class NotificationStrategyManager implements INotificationStrategyManager {

    private final Map<String, INotification> strategies;

    public NotificationStrategyManager(Map<String, INotification> strategies) {
        this.strategies = strategies;
    }

    @Override
    public void execute(NotificationType notificationType) {
        strategies.get(notificationType.name).execute();
    }
}
