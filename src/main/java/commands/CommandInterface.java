package commands;

/**
 * Интерфейс, который описывает основные методы всех команд
 */
public interface CommandInterface {
    /**
     * Имя команды, по которому пользователь, вызывает её
     * @return String - имя команды
     */
    public String getName();

    /**
     * Получить описание команды
     * @return String - описывающий что делает команда
     */
    public String getDescription();

    /**
     * Запускает выполнение команды
     * @param argument аргумент команды (если есть, иначе null)
     */
    public void execute(String argument);
}
