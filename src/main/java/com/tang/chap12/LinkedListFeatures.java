package com.tang.chap12;

import com.tang.pets.Cat;
import com.tang.pets.Pet;
import com.tang.pets.PetCreator;
import com.tang.pets.Rat;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * @Classname LinkedList
 * @Description
 * @Date 2022/8/29 00:00
 * @Author by tangyao
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(new PetCreator().list(5));
        System.out.println(pets);
        System.out.println("pets.getFirst() = " + pets.getFirst());
        System.out.println("pets.element() = " + pets.element());
        System.out.println("pets.peek() = " + pets.peek());
        System.out.println("pets.remove() = " + pets.remove());
        System.out.println("pets.removeFirst() = " + pets.removeFirst());
        System.out.println("pets.poll() = " + pets.poll());
        pets.addFirst(new Rat());
        System.out.println("After addFrist():" + pets);
        boolean offer = pets.offer(new PetCreator().get());

        Map<Object, Object> map = new HashMap<>() {
            {
                put("a", "b");
            }
        };

        boolean b = map.containsValue("b");
        System.out.println("b = " + b);

        Cat cat = new Cat();
        Cat cat2 = new Cat();

        map.put(cat, 1);
        map.put(cat2, 2);
        Object o = map.get(cat);
        System.out.println("o = " + o);
        System.out.println("map.get(cat2) = " + map.get(cat2));



    }
}
