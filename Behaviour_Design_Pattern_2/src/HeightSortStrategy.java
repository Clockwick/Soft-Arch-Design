import java.util.Comparator;
import java.util.List;

public class HeightSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getHeight().compareTo(o2.getHeight());
            }
        };
        people.sort(personComparator);
    }
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
}
