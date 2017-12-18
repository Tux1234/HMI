package com.example.power.hmi;

/**
 * Created by power on 16.12.2017.
 */

public interface InterfaceResult {

    void set_highscore(ImplResult result);
    ImplResult get_highscore();
    void update_highscore(ImplResult result);
    void delete_highscore(ImplResult result);

}
