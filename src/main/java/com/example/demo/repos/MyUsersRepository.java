package com.example.demo.repos;

import com.example.demo.model.MyUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUsersRepository extends JpaRepository<MyUsers,Long> {
}
