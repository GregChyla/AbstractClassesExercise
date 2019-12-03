import java.util.ArrayList;
import java.util.List;

public abstract class Mapper<T, V> {

    abstract V map(T t);

    public List<V> map(List<T> input) {

        List<V> tempList = new ArrayList<>();

        for (T t : input) {
            tempList.add(map(t));
        }
        return tempList;
    }
}
