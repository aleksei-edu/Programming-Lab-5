package commands;

import exception.CommandNeedArgumentException;
import exception.CommandNotAcceptArgumentsException;
import utility.CollectionManager;
import utility.FileManager;

/**
 * Команда считывающая и выполняющая скрипт из файла
 */
public class ExecuteScript extends AbstractCommand{
    public ExecuteScript(){
        super("execute_script","считать и исполнить скрипт из указанного файла. " +
                "В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.");
    }

    @Override
    public void execute(String argument) {
        try {
            if(argument.isEmpty()) throw new CommandNeedArgumentException();
            FileManager.readScript(argument);
        }
        catch(CommandNotAcceptArgumentsException e){
            e.printStackTrace();
        }
    }
}
