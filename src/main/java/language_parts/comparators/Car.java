package language_parts.comparators;

public class Car implements Comparable<Car> {
    int id;
    String name;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "language_parts.comparators.Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car second) {
        return Integer.compare(this.id, second.id);
    }
}
