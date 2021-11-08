import java.util.Comparator;
import java.util.List;

public class NameSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        people.sort(personComparator);
    }
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!

}
