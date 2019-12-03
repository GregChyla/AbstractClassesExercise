import java.util.ArrayList;
import java.util.List;

public class MapperAppStarter {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        stringList.add("100");
        stringList.add("1000");
        stringList.add("10000");

        IntegerMapper integerMapper = new IntegerMapper();
        System.out.println("Mapping integers");
        System.out.println(integerMapper.map(integerList));

        StringMapper stringMapper = new StringMapper();
        System.out.println("Mapping strings");
        System.out.println(stringMapper.map(stringList));
    }


}
