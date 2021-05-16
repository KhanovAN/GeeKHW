import java.util.ArrayList;

public class Box<T> extends ArrayList {
    float weight;



    public boolean compare(Box<T> box1, Box<T> box2){ //примерный метод сравнения.
        if (getWeight(box1) == getWeight(box2)){
            return true;
        } else return false;
    }

    public float getWeight(Box<T> list) {
        if(list.equals())

        return weight;
    }

    public Box<T> addFruit(Fruit fruit, int a) {// метод добавления фрукта, доделать!
        if (fruit.equals(Apple)) {
            Box<Apple> appleBox = new Box<>();
            for (int i = 0; i < a; i++) {
                appleBox.add(new Apple());
            }
            return (Box<T>) appleBox;
        } else if (fruit.equals(Orange)) {
            Box<Orange> orangeBox = new Box<>();
            for (int i = 0; i < a; i++) {
                orangeBox.add(new Orange());
            }
            return (Box<T>) orangeBox;
        }
    }



    public void shiftFruit(Box<T> box1, Box<T> box2){ // метод пересыпания фруктов, доделать!

    }

}



        /*3. Большая задача:
        a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
        b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c. Для хранения фруктов внутри коробки можете использовать ArrayList;
        d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
        e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
        g. Не забываем про метод добавления фрукта в коробку. */
