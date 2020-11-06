/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alwin Singh
 */
public class PassManagement {
    
    private String username, userpassword, appname, url;
    
    public PassManagement() {
        
    }
    
    public PassManagement(String username, String userpassword) {
        this.username = username;
        this.userpassword = userpassword;
    }
    
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.userpassword;
    }
    
    public String getAppName() {
        return this.appname;
    }
    
    public String getUrl() {
        return this.url;
    }
}
