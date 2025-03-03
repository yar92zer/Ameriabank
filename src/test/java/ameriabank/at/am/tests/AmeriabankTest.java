package ameriabank.at.am.tests;

import ameriabank.at.pages.AmeriabankPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import ameriabank.at.MyExtensions;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MyExtensions.class)
public class AmeriabankTest extends BaseTest {
    private AmeriabankPage AmeriabankP;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://ameriabank.am/en/");
        AmeriabankP = new AmeriabankPage(getDriver());
    }

    @Test
    @DisplayName("Проверка активности кнопки Online banking")
    public void onlineBankingIsActive() {
        Assertions.assertTrue(AmeriabankP.getOnlineBankingIsActive(), "Online banking кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Learn more")
    public void learnMoreIsActive() {
        Assertions.assertTrue(AmeriabankP.getLearnMoreIsActive(), "Learn more кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Learn more")
    public void learnMore2IsActive() {
        Assertions.assertTrue(AmeriabankP.getLearnMore2IsActive(), "Learn more 2 кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Cards")
    public void cardsIsActive() {
        Assertions.assertTrue(AmeriabankP.getCardsIsActive(), "Cards кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Transfers")
    public void transfersIsActive() {
        Assertions.assertTrue(AmeriabankP.getTransfersIsActive(), "Transfers кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Online loan")
    public void onlineLoanIsActive() {
        Assertions.assertTrue(AmeriabankP.getApplyOnlineIsActive(), "Online loan кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Distance banking")
    public void distanceBankingIsActive() {
        Assertions.assertTrue(AmeriabankP.getDistanceBankingIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки Savings")
    public void savingsIsActive() {
        Assertions.assertTrue(AmeriabankP.getSavingsIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки Apply online")
    public void applyOnlineIsActive() {
        Assertions.assertTrue(AmeriabankP.getApplyOnlineIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки Learn more 3")
    public void learnMore3IsActive() {
        Assertions.assertTrue(AmeriabankP.getLearnMore3IsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки Learn more 4")
    public void learnMore4IsActive() {
        Assertions.assertTrue(AmeriabankP.getLearnMore4IsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки exchange Rate")
    public void exchangeRateIsActive() {
        Assertions.assertTrue(AmeriabankP.getExchangeRateIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки EXCHANGE")
    public void exchangeIsActive() {
        Assertions.assertTrue(AmeriabankP.getExchangeButtonIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки GOLD")
    public void goldIsActive() {
        Assertions.assertTrue(AmeriabankP.getGoldIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки CASH")
    public void cashIsActive() {
        Assertions.assertTrue(AmeriabankP.getCashIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки NON-CASH")
    public void nonCashIsActive() {
        Assertions.assertTrue(AmeriabankP.getNonCashIsActive());
    }

    @Test
    @DisplayName("Открытие страницы Cards")
    public void cardsTest() {
        String expectedUrl = "https://ameriabank.am/en/personal/cards/banking-cards";
        String actualUrl = AmeriabankP.cardsButtonTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Открытие страницы Transfers")
    public void transfersTest() {
        String expectedUrl = "https://ameriabank.am/en/personal/accounts";
        String actualUrl = AmeriabankP.transfersButtonTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Открытие страницы Online loan")
    public void onlineLoanTest() {
        String expectedUrl = "https://ameriabank.am/en/personal/loans";
        String actualUrl = AmeriabankP.onlineLoanButtonTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Открытие страницы Distance banking")
    public void distanceBankingTest() {
        String expectedUrl = "https://ameriabank.am/en/personal/accounts/accounts-management/myameria";
        String actualUrl = AmeriabankP.distanceBankingButtonTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Открытие страницы Distance banking")
    public void savingsTest2() {
        String expectedUrl = "https://ameriabank.am/en/personal/saving";
        String actualUrl = AmeriabankP.savingsButtonTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }
}
