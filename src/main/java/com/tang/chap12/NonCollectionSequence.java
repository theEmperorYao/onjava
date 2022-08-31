package com.tang.chap12;

import com.tang.pets.Pet;
import com.tang.pets.PetCreator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname NonCollectionSequence
 * @Description
 * @Date 2022/8/30 22:56
 * @Author by tangyao
 */
class PetSequence {
    protected Pet[] pets = new PetCreator().array(8);

}

public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {


    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    public static void main(String[] args) {
//        NonCollectionSequence nc = new NonCollectionSequence();
//        InterfaceVsIterator.display(nc.iterator());
        NonCollectionSequence nonCollectionSequence = new NonCollectionSequence();
        for (Pet pet : nonCollectionSequence) {
            System.out.println("pet = " + pet);
        }

    }

}
