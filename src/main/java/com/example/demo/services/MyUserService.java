package com.example.demo.services;

import com.example.demo.model.MyUsers;

import java.util.List;

public interface MyUserService {
    MyUsers getById(Long id);
    void userSave (MyUsers myUsers);
    void userDelete(Long id);
    List<MyUsers> getAll();
}
