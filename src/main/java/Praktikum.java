public class Praktikum {

    /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    public static void main(String[] args) {
        String name = "Тmqwertyuiasd ffghjk";
        Account account = new Account(name);

        System.out.println(String.format("Можно ли напечатать строку \"%s\" на карте? Ответ: %s",
                name, account.checkNameToEmboss()));
    }

}