package com.tang.chap9;

import com.tang.chap4.C;

/**
 * @Classname ReferenceCounting
 * @Description TODO
 * @Date 2022/7/24 22:08
 * @Author by tangyao
 */

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared" + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    Composing(Shared shared) {
        System.out.println("creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing" + id;
    }
}


public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };
        for (Composing c : composing) {
            c.dispose  ();
        }
    }
}
