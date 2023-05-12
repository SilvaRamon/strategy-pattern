package br.com.SilvaRamon.notification;

import br.com.SilvaRamon.notification.interfaces.INotificationService;
import br.com.SilvaRamon.notification.strategy.enums.NotificationType;
import br.com.SilvaRamon.notification.strategy.interfaces.INotificationStrategyManager;
import org.springframework.stereotype.Service;

@Service
public class NotificationService implements INotificationService {

    private final INotificationStrategyManager iNotificationStrategyManager;

    public NotificationService(INotificationStrategyManager iNotificationStrategyManager) {
        this.iNotificationStrategyManager = iNotificationStrategyManager;
    }

    @Override
    public void sendEmailNotification() {
        iNotificationStrategyManager.execute(NotificationType.EMAIL);
    }

    @Override
    public void sendSmsNotification() {
        iNotificationStrategyManager.execute(NotificationType.SMS);
    }
}
