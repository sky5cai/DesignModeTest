package commandMode.controller;

import commandMode.commandModel.Command;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  16:28 2019/6/1
 * @Modified by
 */
public class SimpleRemoteControl {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
