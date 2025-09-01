package org.stepic.level_3;

import java.util.logging.*;

public class LoggingConfigurator {
    public static void configureLogging() {
        // Получаем корневой логгер
        Logger rootLogger = Logger.getLogger("");

        // Настройка для ClassA - все уровни
        Logger classALogger = Logger.getLogger("org.stepic.java.logging.ClassA");
        classALogger.setLevel(Level.ALL);

        // Настройка для ClassB - только WARNING и выше
        Logger classBLogger = Logger.getLogger("org.stepic.java.logging.ClassB");
        classBLogger.setLevel(Level.WARNING);

        // Создаем и настраиваем обработчик для org.stepic.java
        Logger stepicJavaLogger = Logger.getLogger("org.stepic.java");

        // Удаляем все существующие обработчики (по условию не должны меняться другие настройки)
        // Но нам нужно добавить свой обработчик, поэтому сначала проверим, нет ли уже XML обработчика

        // Создаем XML форматтер
        XMLFormatter xmlFormatter = new XMLFormatter();

        // Создаем консольный обработчик с XML форматом
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(xmlFormatter);
        consoleHandler.setLevel(Level.ALL); // Принимаем все уровни

        // Добавляем обработчик к логгеру org.stepic.java
        stepicJavaLogger.addHandler(consoleHandler);

        // Запрещаем передачу сообщений вышестоящим обработчикам
        stepicJavaLogger.setUseParentHandlers(false);
    }
}


/**
 * В этой задаче вам нужно реализовать метод, настраивающий параметры логирования. Конфигурирование в коде позволяет
 * выполнить более тонкую и хитрую настройку, чем при помощи properties-файла.
 *
 * Требуется выставить такие настройки, чтобы:
 *
 * Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
 * Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
 * Все сообщения, пришедшие от нижестоящих логгеров на уровень "org.stepic.java", независимо от серьезности
 * сообщения печатались в консоль в формате XML (*) и не передавались вышестоящим обработчикам на уровнях
 * "org.stepic", "org" и "".
 * Не упомянутые здесь настройки изменяться не должны.
 *
 * (*) В реальных программах мы бы конечно печатали XML не в консоль, а в файл. Но проверяющая система не разрешает
 * создавать файлы на диске, поэтому придется так.
 *
 * Подсказки:
 *
 * Level есть не только у Logger, но и у Handler.
 * Передача сообщения на обработку родительскому Handler'у регулируется свойством useParentHandlers.
 */