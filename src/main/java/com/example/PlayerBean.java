package com.example;

import org.apache.deltaspike.core.api.scope.ViewAccessScoped;
import org.apache.deltaspike.core.api.scope.WindowScoped;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import java.io.Serializable;
import javax.faces.bean.*;

//@Named

@ManagedBean(name = "playerBean")
@ViewAccessScoped

// for comparison, you can switch to SessionScoped and test again
public class PlayerBean implements Serializable {

    private String name = "-";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}