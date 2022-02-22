package commands;

import data.Route;
import exception.CommandNotAcceptArgumentsException;
import utility.CollectionManager;

/**
 * Команда для выхода из консольного приложения
 */
public class ExitCommand extends AbstractCommand{
    public ExitCommand(){
        super("exit","завершить программу (без сохранения в файл)");
    }
    @Override
    public void execute(String argument){
        try {
            if(!argument.isEmpty()) throw new CommandNotAcceptArgumentsException();
            System.exit(0);
        }
        catch(CommandNotAcceptArgumentsException e){
            e.printStackTrace();
        }
    }

}
