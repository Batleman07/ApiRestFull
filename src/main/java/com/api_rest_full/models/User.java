package com.api_rest_full.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.google.gson.annotations.Since;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name=User.TABLE_NAME)
public class User {
    public interface CreateUser {}
    public interface UpdateUser {}

    public static final String TABLE_NAME = "user";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id",unique = true)
    private Long id;

    @Column(name="username",length = 100,nullable = false,unique = true)
    @NotNull(groups=CreateUser.class)
    @NotEmpty(groups=CreateUser.class)
    @Size(groups=CreateUser.class,min=2,max=100)
    private String username;

    @JsonProperty(access = Access.WRITE_ONLY)
    @Column(name="password",length = 60,nullable = false)
    @NotNull(groups={CreateUser.class,UpdateUser.class})
    @NotEmpty(groups={CreateUser.class,UpdateUser.class})
    @Size(groups={CreateUser.class,UpdateUser.class},min=8,max=60)
    private String password;

    //private List<Task> tasks=new ArrayLis<Task>();

    public User(){}
    public User(Long id,String userName,String password){
        this.id=id;
        this.password=password;
        this.username=userName;
    }

    public Long getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==this){
                return true;
        }
        if(!(obj instanceof User)||(obj==null)){
                return false;
        }
        User other=(User)obj;
        if(this.id==null){
                if(other.id!=null){
                        return false;
                }else if(!this.id.equals(other.id)){
                        return false;
                }
        }
        return Objects.equals(this.id,other.id)&&
                Objects.equals(this.username,other.username)&&
                Objects.equals(this.password, other.password);



    }


    @Override
    public int hashCode(){
        final int prime=31;
        int result =1;
        result=prime*result+((this.id==null)?0:this.id.hashCode());
        return result;
    }
}
