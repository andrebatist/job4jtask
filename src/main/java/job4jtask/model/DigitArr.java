package job4jtask.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DigitArr {
    private List<Integer> digits = new ArrayList<>();
    private int first;
    private int second;
    private int third;
}
