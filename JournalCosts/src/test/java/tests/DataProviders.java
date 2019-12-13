package tests;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class DataProviders {
    @DataProvider
    public Iterator<Object[]> dynamicDataGeneration()
    {
        List<Object[]> data = new ArrayList<Object[]>();
        for (int i = 0; i < 10; i++) {
            data.add(new Object[]{generateSum(), generateComment()});
        }
        return data.iterator();
    }

    private Object generateComment() {
        Object data = new Random().nextInt();
        return "comment" + data.toString();
    }

    private Object generateSum() {
        Object data = new Random().nextFloat() * 10000;
        return data.toString();
    }
}
