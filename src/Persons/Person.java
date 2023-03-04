package Persons;

public abstract class Person {
    public String name;

    public Person() {
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.name.length();
    }

    @Override
    public boolean equals(Object o){
        if (this.toString() == o.toString()){
            return true;
        }
        return false;
    }

}
