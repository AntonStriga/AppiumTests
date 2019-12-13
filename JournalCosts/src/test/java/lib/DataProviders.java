package lib;

import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class DataProviders {
    @DataProvider
    public static Iterator<Object[]> dynamicDataGeneration()
    {
        List<Object[]> data = new ArrayList<Object[]>();
        for (int i = 0; i < 10; i++) {
            data.add(new Object[]{generateSum(), generateComment()});
        }
        return data.iterator();
    }

    @DataProvider
    public static Iterator<Object[]> loadDataFromFile() throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(
                DataProviders.class.getResourceAsStream("/testData.data")
        ));
        List<Object[]> userData = new ArrayList<Object[]>();
        String line = in.readLine();
        while (line != null) {
            userData.add(line.split(";"));
            line = in.readLine();
        }
        in.close();
        return userData.iterator();
    }

    private static Object generateComment() {
        Object data = new Random().nextInt();
        return "comment" + data.toString();
    }

    private static Object generateSum() {
        Object data = new Random().nextFloat() * 10000;
        return data.toString();
    }
}
