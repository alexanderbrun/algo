package generics;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedByClassAndInterface<T extends ArrayList & List> {

    T nums;

    public ParametrizedByClassAndInterface(T nums) {
        this.nums = nums;
    }

    }
