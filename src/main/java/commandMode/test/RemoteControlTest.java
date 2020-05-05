package commandMode.test;

import commandMode.commandModel.LightOffCommand;
import commandMode.commandModel.LightOnCommand;
import commandMode.controller.RemoteControl;
import commandMode.controller.SimpleRemoteControl;
import commandMode.model.Light;
import org.junit.Test;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  16:31 2019/6/1
 * @Modified by
 */
public class RemoteControlTest {

    @Test
    public void remoteControl1(){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        LightOffCommand lightOff = new LightOffCommand(light);
        remote.setCommand(lightOff);
        remote.buttonWasPressed();
    }

    /**
     *
     */
    @Test
    public void remoteControl2(){
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}
