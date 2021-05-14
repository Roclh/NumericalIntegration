package com.Roclh.core.commands;

public abstract class Command {
    private String name;

    public Command(String name) {
        this.name = name;
    }

    public void solve(){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
