Feature: Проверка поиска
  Проверяем вхождение сайта ru.wikipedia.org в результатах поиска по слову "Гладиолус"

  @otladish
  Scenario: Успешное нахождение
    Given перейти на сайт 'https://yandex.ru/'
    When осуществить поиск 'Гладиолус'
    Then найти сайт 'wikipedia'
    Then закончить работу