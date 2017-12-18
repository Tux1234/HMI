package com.example.power.hmi;

/**
 * Created by power on 16.12.2017.
 */

public class Main {
    public static void main(String[] args) {
        ImplTest test = new ImplTest();
        test.set_Test();
        System.out.println("Path to picture: "+test.get_Test(1));
        test.delete_Test(1);
        System.out.println("Path to picture: "+test.get_Test(1));
        ImplUser user = new ImplUser();
        user.add_User(1, "Manuel Kaufmann", 35);
        System.out.println("User: "+user.get_User(1).get_name()+" ("+user.get_User(1).get_age()+")");
        user.update_User(1, "Julia Medvednikova", 27);
        System.out.println("User: "+user.get_User(1).get_name()+" ("+user.get_User(1).get_age()+")");
        user.delete_User(1);
        if(user.get_User(1) != null){
            System.out.println("User: "+user.get_User(1).get_name()+" ("+user.get_User(1).get_age()+")");
        }else{
            System.out.println("User not available");
        }


    }
}