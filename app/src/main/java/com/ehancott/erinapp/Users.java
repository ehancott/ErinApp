package com.ehancott.erinapp;

public class Users {
    private int _id;
    private String _username;


    public Users (){

    }
    public Users(String userName) {
        this._username = userName;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_productname() {
        return _username;
    }

    public void set_username(String _productname) {
        this._username = _username;
    }




}