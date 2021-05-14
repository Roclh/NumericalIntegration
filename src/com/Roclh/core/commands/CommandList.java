package com.Roclh.core.commands;

import com.Roclh.core.commands.methods.MethodOfRectangles;
import com.Roclh.core.commands.methods.SimpsonMethod;
import com.Roclh.core.commands.methods.TrapeziumMethod;

import java.util.ArrayList;

public class CommandList {

    private ArrayList<Command> list = new ArrayList<>();

    public CommandList(){
        initiate();
    }

    private void initiate() {
        list.add(new MethodOfRectangles());
        list.add(new SimpsonMethod());
        list.add(new TrapeziumMethod());
    }

    public boolean solve(String methodName){
        if(list.stream().anyMatch(command -> command.getName().equals(methodName))){
            list.stream().filter(command -> command.getName().equals(methodName)).findFirst().get().solve();
            return true;
        }else{
            return false;
        }
    }
}
