import utility.*;

/**
 * Класс старта программы
 * @author Alexey Lapin
 */
public class Main {
    public static void main(String[] args){
        FileManager.setEnv("LABA");
        CollectionManager.loadCollection();
        while(true){
            ConsoleManager.interactiveMode();
        }
    }
}

