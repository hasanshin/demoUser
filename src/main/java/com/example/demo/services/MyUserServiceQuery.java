package com.example.demo.services;

import com.example.demo.model.MyUsers;
import com.example.demo.repos.MyUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserServiceQuery implements MyUserService{
    @Autowired
    MyUsersRepository myUsersRepository;

    @Override
    public MyUsers getById(Long id) {
        return myUsersRepository.getOne(id);
    }

    @Override
    public void userSave(MyUsers myUsers) {
        myUsersRepository.save(myUsers);
    }

    @Override
    public void userDelete(Long id) {
        myUsersRepository.deleteById(id);
    }

    @Override
    public List<MyUsers> getAll() {
        List<MyUsers> myUsers = new ArrayList<>();
        myUsers.addAll(myUsersRepository.findAll());
        return myUsers;
    }
}
