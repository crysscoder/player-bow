# PlayerBow

Paper-плагин с кастомным луком для Minecraft-сервера.

## Что делает

- Выдаёт игроку специальный лук через `/custombow`.
- Помечает лук и стрелы через `NamespacedKey`.
- Добавляет эффект притягивания цели.
- Защищает игрока от урона падения после рывка.

## Версии

- Java 16
- Gradle 8.7
- Paper API 1.16.5
- Lombok 1.18.34
- Plugin `1.0.0`

## Команда

- `/custombow`

## Сборка

```powershell
.\gradlew.bat clean build
```

Jar: `build/libs/PlayerBow-1.0.0.jar`

## Установка

Положить jar в `plugins` Paper-сервера 1.16.5 и перезапустить сервер.
