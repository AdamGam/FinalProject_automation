package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import utilities.CommonOps;

public class ElectronFlows extends CommonOps {

    @Step("Add New Task To The List")
    public static void addNewTask(String taskName) {
        UIActions.updateText(todoMain.txt_create, taskName);
        UIActions.insertKey(todoMain.txt_create, Keys.RETURN);

    }

    @Step("Count and Return Number Of Task in List")
    public static int getNumberOfTask() {
        return todoMain.list_tasks.size();

    }

    @Step("Empty List From Tasks")
    public static int emptyList() {
        for (int i = 0; i < getNumberOfTask(); i++) {
            UIActions.mouseHover(todoMain.btn_x);
        }
        return 0;
    }


}
