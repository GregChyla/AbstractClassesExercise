public class StringMapper extends Mapper<Integer, String> {
    @Override
    String map(Integer integer) {
        return "Input is " + integer.toString();
    }
}
