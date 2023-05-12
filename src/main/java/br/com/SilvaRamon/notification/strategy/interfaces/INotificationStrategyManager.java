package br.com.SilvaRamon.notification.strategy.interfaces;

import br.com.SilvaRamon.notification.strategy.enums.NotificationType;

public interface INotificationStrategyManager {
    void execute(NotificationType notificationType);
}
