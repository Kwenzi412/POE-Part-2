/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart2;

/**
 *
 * @author Student
 */
class LogIn {
   
    public boolean loginUser (String name, String password) {
      if (name.equals(name) && password.equals(password)) {
          return true;
      } else {
          return false;
      }
    }
    
    public String returnLoginStaus (boolean status) {
        if (status) {
            return "Login success";
            
        } else {
            return "Login failed";
        }
    }

    
}
