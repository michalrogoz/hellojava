package comparators;

public class CarByNameComparator extends CarComparator {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.name.compareTo(o2.name);
    }
}
