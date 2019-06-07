package commandMode.controller;

import commandMode.commandModel.Command;
import commandMode.commandModel.NoCommand;

import java.util.Arrays;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  16:35 2019/6/1
 * @Modified by
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(){
        Command noCommand = new NoCommand();
        onCommands = new Command[7];
        offCommands = new Command[7];
        for (int i = 0; i <7 ; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int i,Command onCommand,Command offCommand){
        onCommands[i] = onCommand;
        offCommands[i] = offCommand;
    }

    public void onButtonWasPushed(int i){
        onCommands[i].execute();
        //反操作
        undoCommand = onCommands[i];
    }

    public void offButtonWasPushed(int i ){
        offCommands[i].execute();
        //反操作
        undoCommand = offCommands[i];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
