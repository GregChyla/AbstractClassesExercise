public class IntegerMapper extends Mapper<Integer, Integer> {
    @Override
    Integer map(Integer integer) {
        return integer * integer;
    }
}
