package com.example.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Component

public class Hello implements Welcome {
    //int name;
    String name;
    int Rollno;
    public Hello() {
        //this.name=name;
        System.out.println("name");
    }
    public void m(){
        System.out.println("Hello World from hello");
    }

    public int getRollno()
    {
        //System.out.println("rollNo=");
        Rollno = 5;
        return Rollno;
    }
    public void setRollno(int Rollno)
    {

        this.Rollno=Rollno;

        System.out.println("Rollno="+Rollno);
    }
    public void setName(String name) {
        this.name = name;
        System.out.println("name"+name);
    }

    public String getName() {

        return name;
    }
}
