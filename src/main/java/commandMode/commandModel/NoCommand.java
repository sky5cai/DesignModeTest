package commandMode.commandModel;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  16:36 2019/6/1
 * @Modified by
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("没做什么操作");
    }

    @Override
    public void undo() {

    }
}
