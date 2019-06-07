package commandMode.commandModel;

import commandMode.model.Light;

/**灯打开命令
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  16:24 2019/6/1
 * @Modified by
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    //增加反操作按钮
    public void undo(){
        light.off();
    }
}
