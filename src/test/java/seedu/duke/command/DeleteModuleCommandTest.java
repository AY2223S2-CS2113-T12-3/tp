package seedu.duke.command;

import org.junit.jupiter.api.Test;
import seedu.duke.Module;
import seedu.duke.Parser;
import seedu.duke.Storage;
import seedu.duke.University;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeleteModuleCommandTest {
    Storage storage = new Storage();

    @Test
    void userInput_remove_correctVariableType_success() {
        String userInput = "remove 1";
        ArrayList<University> universities = new ArrayList<>();
        ArrayList<Module> modules = new ArrayList<>();
        ArrayList<Module> puModules = new ArrayList<>();
        Module module = new Module(1, "AE320", "Aerodynamics II", 3,
                "ME4231", "Aerodynamics", 4);
        modules.add(module);
        Parser parser = new Parser();
        assertTrue(parser.parseUserCommand(userInput, universities, modules, puModules, storage)
                instanceof DeleteModuleCommand);
    }

    @Test
    public void deleteModule_correctFormat_success() {
        ArrayList<Module> uniList1 = new ArrayList<>();
        Module module = new Module(1, "AE320", "Aerodynamics II", 3,
                "ME4231", "Aerodynamics", 4);
        uniList1.add(module);
        Storage.deleteModule(1, uniList1, storage);
        assertEquals(0, uniList1.size());
    }
}