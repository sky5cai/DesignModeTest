package minglingMode.test;

import minglingMode.commandModel.LightOffCommand;
import minglingMode.commandModel.LightOnCommand;
import minglingMode.controller.RemoteControl;
import minglingMode.controller.SimpleRemoteControl;
import minglingMode.model.Light;
import org.junit.jupiter.api.Test;

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
