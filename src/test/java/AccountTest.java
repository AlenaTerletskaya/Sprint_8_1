import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {

    private String name;
    private boolean expectedResult;

    public AccountTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Дмитрий Андреев", true},
                {"Д А", true},
                {"Василий Иванокиплов", true},
                {"ТП", false},
                {"АртемийВладимиров", false},
                {"Василий Иванокипловд", false},
                {"Дмит рий Андреев", false},
                {" Артемий Кладов", false},
                {"Артемий Mладов ", false}
        };
    }

    @Test
    @DisplayName ("Check Name")
    @Description("Проверка имени")
    public void checkName() {
        Account account = new Account(name);
        System.out.println(String.format
                ("Можно ли напечатать строку \"%s\" на карте? Ответ %s", name, account.checkNameToEmboss()));
        Assert.assertEquals(String.format("Можно ли напечатать строку \"%s\" на карте? Ответ должен быть: %s",
                name, expectedResult), expectedResult, account.checkNameToEmboss());
    }
}
