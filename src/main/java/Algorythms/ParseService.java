package Algorythms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParseService {

    public List<Integer> parse(String[] input) {
        return Arrays.stream(input)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }
}
