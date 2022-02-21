package commands;

import data.Route;
import exception.CommandNotAcceptArgumentsException;
import utility.CollectionManager;

import java.util.ArrayList;
import java.util.Collections;

public class MinByDistance extends AbstractCommand{
    public MinByDistance(){
        super("min_by_distance","вывести любой объект из коллекции," +
                " значение поля distance которого является минимальным");
    }

    @Override
    public void execute(String argument) {
        try {
            if(!argument.isEmpty()) throw new CommandNotAcceptArgumentsException();
            if (CollectionManager.getRouteCollection().size() == 0){
                System.out.println("Коллекция пуста.");
            }
            long min  = Long.MAX_VALUE;
            Route routeMin = null;
            ArrayList<Route> sortArray = new ArrayList<>();
            for (Route index : CollectionManager.getRouteCollection()){
                sortArray.add(index);
            }
            Collections.sort(sortArray, new Route.ComparatorByDistance());
            int id = sortArray.get(0).getId();
            System.out.println(sortArray.get(0).toString());
        }
        catch(CommandNotAcceptArgumentsException e){
            e.printStackTrace();
        }
    }
}
