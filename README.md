<div align="center">

# PlayerBow

![Release](https://img.shields.io/github/v/release/crysscoder/player-bow?style=flat-square&label=release)
![Java](https://img.shields.io/badge/Java-16-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Paper](https://img.shields.io/badge/Paper-1.16.5-2ea44f?style=flat-square)
![Issues](https://img.shields.io/github/issues/crysscoder/player-bow?style=flat-square)

Paper-плагин с кастомным луком для Minecraft-сервера.

[Release](https://github.com/crysscoder/player-bow/releases/latest) · [Issues](https://github.com/crysscoder/player-bow/issues) · [CodeAdapter](https://codeadapter.ru)

</div>

## Что делает

- выдаёт игроку специальный лук через `/custombow`
- помечает лук и стрелы через `NamespacedKey`
- добавляет эффект притягивания цели
- защищает игрока от урона падения после рывка

## Версии

| Компонент | Версия |
| --- | --- |
| Plugin | `1.0.0` |
| Java | `16` |
| Paper API | `1.16.5` |
| Gradle | `8.7` |
| Lombok | `1.18.34` |

## Команды

- `/custombow`

## Сборка

```powershell
.\gradlew.bat clean build
```

## Установка

Собери проект или возьми сборку из release, положи её в `plugins` Paper-сервера и перезапусти сервер.
