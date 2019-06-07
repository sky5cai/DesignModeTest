package commandMode.commandModel;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  16:24 2019/6/1
 * @Modified by
 */
public interface Command {
    public void execute();
    public void undo();
}
