package seedu.duke.command;

import org.junit.jupiter.api.Test;
import seedu.duke.Module;
import seedu.duke.Parser;
import seedu.duke.Storage;
import seedu.duke.University;
import seedu.duke.budget.BudgetPlanner;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExitCommandTest {

    boolean setExit = false;

    @Test
    void userInput_exit_correctVariableTypeSuccess() {
        String userInput = "exit";
        ArrayList<University> universities = new ArrayList<>();
        ArrayList<Module> modules = new ArrayList<>();
        ArrayList<Module> puModules = new ArrayList<>();
        Storage storage = new Storage();
        Parser parser = new Parser();
        BudgetPlanner budgetPlanner = new BudgetPlanner();
        assertTrue(parser.parseUserCommand(userInput, universities, modules, puModules, storage, budgetPlanner)
                instanceof ExitCommand);
    }

    @Test
    void execute_exit_success() {
        ExitCommand exitCommand = new ExitCommand();
        exitCommand.execute();
        setExit = exitCommand.getIsExit();
        assertEquals(true, setExit);
    }

}
