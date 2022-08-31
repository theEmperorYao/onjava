package com.tang.chap12;

import com.tang.pets.Pet;
import com.tang.pets.PetCreator;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * @Classname CollectionSequence
 * @Description
 * @Date 2022/8/30 22:50
 * @Author by tangyao
 */

public class CollectionSequence extends AbstractCollection<Pet> {

    private Pet[] pets = new PetCreator().array(8);

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

            @Override
            public void remove() {
                Iterator.super.remove();
            }
        };

    }

    @Override
    public int size() {
        return pets.length;
    }
}
