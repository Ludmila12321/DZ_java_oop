**Задание**  
Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
Используйте предыдущие задачи из прошлого домашнего задания. Необходимо гарантированно продумать иерархию компонент и взаимодействия их между собой.
Обеспечить переход от использования явных классов в сторону использования абстрактных типов. Т е работаем не с:
конкретным экземпляром генеалогического древа, а с интерфейсом “ генеалогическое древо”
конкретным экземпляром котика, а с интерфейсом “котик”, лучше уйти от взаимодействия с конкретными питомцами и повысить уровень абстракции до взаимодействия с котиком, собачкой или хомяком т е с интерфейсом “животное”.  

**Реализация**  
  
***1 задание***  
  
Классы Person и Research используются для хранения информации об объектах Person и управления списком людей соответственно. Интерфейс FamilyTree и его реализация FamilyTreeImpl используются для установления связей между объектами Person. Класс Main используется для создания и управления объектами классов.
  
***2 задание***  
  
Повышаем уровень абстракции до взаимодействия с различными животными путем создания интерфейса Animal.  
Теперь, вместо того, чтобы работать напрямую с классами Cat, Dog и Hamster, мы работаем с интерфейсом Animal, который представляет собой общий набор методов для всех животных. Таким образом, мы можем легко добавлять новых животных, реализуя интерфейс Animal, и использовать их вместе с уже существующим кодом.