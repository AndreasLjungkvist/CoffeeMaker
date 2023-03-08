Feature:CoffeeMaker

# letter indication for output can me found in method 'summarizeOrder'.
  Scenario Outline: CoffeeMakerLastUnit
    Given There is at least <number1> coffee left when ordering <number2> in the machine.
    Given I have deposited at least <number3> kr and ordered no more than <number4> units.
    When I choose "<beverage>" and "<size>".
    When I choose "<options>".
    Then Stock displayed will be "<stock>".
    Then I will get served a "<output>".

  Examples:
|number1|number2|number3|number4|beverage|size|options|stock|output|
|4      |4      |40     |4      |Coffee  |Small|None|Coffee Low Supply|aaaa|
|200    |20     |200    |20     |Cocoa   |Large|Cinnamon|Coffeemaker Supplied|bccd|
|0      |0      |0      |0      |Coffee  |Medium|None   |Coffee Out Of Stock |caba|
