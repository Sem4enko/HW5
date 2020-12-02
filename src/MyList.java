import java.util.ArrayList;

public class MyList <T extends Number >{
    private final ArrayList<T> arrayList;

    public MyList() {
        arrayList = new ArrayList<>();
    }

    public void add(T p) {
        arrayList.add(p);
    }

    public T getLargest() {
        T max = arrayList.get(0);
        for (T p : arrayList) {
            if (max.doubleValue() < p.doubleValue())
                max = p;
        }
        return max;
    }

    public T getSmallest() {
        T min = arrayList.get(0);
        for (T p : arrayList) {
            if (min.doubleValue() > p.doubleValue())
                min = p;
        }
        return min;
    }
}