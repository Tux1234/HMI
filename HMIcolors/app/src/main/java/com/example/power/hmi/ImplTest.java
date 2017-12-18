package com.example.power.hmi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by power on 16.12.2017.
 */

public class ImplTest implements InterfaceTest {

    private List<String> listTests = new ArrayList<>();
    private String name = null;
    private Integer id = null;
    private String path = null;
    @Override
    public void set_Test() {
        listTests.add(0, "path 1");
        listTests.add(1, "path 2");
        listTests.add(2, "path 3");
        listTests.add(3, "path 4");
        listTests.add(4, "path 5");
        listTests.add(5, "path 6");
        listTests.add(6, "path 7");
        listTests.add(7, "path 8");
        listTests.add(8, "path 9");
        listTests.add(9, "path 10");
    }

    @Override
    public String get_Test(Integer seq) {return listTests.get(seq-1);}

    @Override
    public void delete_Test(Integer seq) { listTests.remove(seq-1);}

    @Override
    public void update_Test(Integer seq, String path) {listTests.add(seq-1,path);}
}
