package com.example.power.hmi;

/**
 * Created by power on 16.12.2017.
 */

public interface InterfaceTest {

    void set_Test();
    String get_Test(Integer seq);
    void delete_Test(Integer seq);
    void update_Test(Integer seq, String path);

}
