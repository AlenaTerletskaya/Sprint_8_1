public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    public boolean checkNameToEmboss() {
        if (name.length() < 3
                || name.length() > 19
                || name.startsWith(" ")
                || name.endsWith(" ")
                || !name.contains(" ")) {
            return false;
        }

        return  name.indexOf(" ") == name.lastIndexOf(" ");
    }
}