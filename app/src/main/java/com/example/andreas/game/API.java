package com.example.andreas.game;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Andreas on 2017-11-13.
 */

public class API {
    private int _id;
    private String name;

    public API(int _id, String name) {
        this._id = _id;
        this.name = name;
    }

    public int get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

}
