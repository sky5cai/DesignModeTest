package minglingMode.commandModel;

import minglingMode.model.Light;

/**灯打开命令
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  16:24 2019/6/1
 * @Modified by
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    //增加反操作按钮
    public void undo(){
        light.on();
    }
}
