package com.bms.service;

import java.util.List;

import com.bms.model.Users;


public interface UserService
{

  public void addUser(Users users);
  
  public void updateUser(Users users);
  
  public void deleteUser(String userid);
  
  public List<Users> userlist();
  
  public Users getUserById(String userid);
  
  public Users getUserByName(String username);
  
  public void setStatus(String userid);
}
