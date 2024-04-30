package com.exemple;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {
  private String username;
  private List<String> users = new ArrayList<>();

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public List<String> getUsers() {
    return users;
  }

  public void addUser() {
    users.add(username);
    username = "";
  }
}
