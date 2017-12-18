package com.example.power.hmi;

/**
 * Created by power on 16.12.2017.
 */

public interface InterfaceUsers {

    void add_User(Integer ID, String name, Integer age);
    ImplUser get_User(Integer id);
    void delete_User(Integer id);
    void update_User(Integer id, String name, Integer age);
    String get_name();
    Integer get_age();

}
