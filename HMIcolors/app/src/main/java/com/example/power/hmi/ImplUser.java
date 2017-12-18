package com.example.power.hmi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by power on 16.12.2017.
 */

public class ImplUser implements InterfaceUsers {

    private List<ImplUser> listUsers = new ArrayList<>();
    private Integer id = null;
    private String name = null;
    private Integer age = null;

    @Override
    public void add_User(Integer id, String name, Integer age) {
        this.id= id;
        this.name = name;
        this.age = age;

        listUsers.add(this);
    }

    @Override
    public ImplUser get_User(Integer id) {
       for (ImplUser user : listUsers ) {
            if(user.id == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public void delete_User(Integer id) {
        listUsers.remove(id-1);
    }

    @Override
    public void update_User(Integer id, String name, Integer age) {
        this.name = name;
        this.age = age;

        listUsers.set(id-1, this);
    }

    @Override
    public String get_name(){
        return this.name;
    }

    @Override
    public Integer get_age() {
        return this.age;
    }
}
