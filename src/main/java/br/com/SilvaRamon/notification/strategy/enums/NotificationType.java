package br.com.SilvaRamon.notification.strategy.enums;

public enum NotificationType {
    EMAIL("EmailNotification"),
    SMS("SmsNotification");

    public final String name;

    NotificationType(String name) {
        this.name = name;
    }
}
