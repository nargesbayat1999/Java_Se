package org.bayat.javase.collection;

//This is an exercise to create a repository-like class

public class Repository<I, T> {
    private I id;
    private T value;

    public Repository(I id, T value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "RE{" +
               "key=" + id +
               ", value=" + value +
               '}';
    }

}
