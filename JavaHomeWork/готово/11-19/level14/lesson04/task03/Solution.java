package com.javarush.test.level14.lesson04.task03;

/* Food
1. Реализовать интерфейс Selectable в классе Food.
2. Метод onSelect() должен писать в консоль "food is selected".
3. Подумай, какие методы можно вызвать для переменной food и какие для selectable.
4. В методе foodMethods вызови методы onSelect, eat, если это возможно.
5. В методе selectableMethods вызови методы onSelect, eat, если это возможно.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food)
    {
        //тут добавьте вызов методов для переменной food
    }

    public static void selectableMethods(Selectable selectable)
    {
        //тут добавьте вызов методов для переменной selectable
    }

    interface Selectable
    {
        void onSelect();
    }

    static class Food
    {
        public void eat()
        {
            System.out.println("food is eaten");
        }
    }
}
