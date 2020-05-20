package comparators;

public class CarByIdComparator extends CarComparator {

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.id, o2.id);
    }
}
