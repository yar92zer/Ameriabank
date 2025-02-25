package org.example.ameriabank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

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
    public void OnlineBankingIsActive() {
        Assertions.assertTrue(AmeriabankP.getOnlineBankingIsActive(), "Online banking кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Learn more")
    public void LearnMoreIsActive() {
        Assertions.assertTrue(AmeriabankP.getLearnMoreIsActive(), "Learn more кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Learn more")
    public void LearnMore2IsActive() {
        Assertions.assertTrue(AmeriabankP.getLearnMore2IsActive(), "Learn more 2 кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Cards")
    public void CardsIsActive() {
        Assertions.assertTrue(AmeriabankP.getCardsIsActive(), "Cards кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Transfers")
    public void TransfersIsActive() {
        Assertions.assertTrue(AmeriabankP.getTransfersIsActive(), "Transfers кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Online loan")
    public void OnlineLoanIsActive() {
        Assertions.assertTrue(AmeriabankP.getApplyOnlineIsActive(), "Online loan кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Distance banking")
    public void DistanceBankingIsActive() {
        Assertions.assertTrue(AmeriabankP.getDistanceBankingIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки Savings")
    public void SavingsIsActive() {
        Assertions.assertTrue(AmeriabankP.getSavingsIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки Apply online")
    public void ApplyOnlineIsActive() {
        Assertions.assertTrue(AmeriabankP.getApplyOnlineIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки Learn more 3")
    public void LearnMore3IsActive() {
        Assertions.assertTrue(AmeriabankP.getLearnMore3IsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки Learn more 4")
    public void LearnMore4IsActive() {
        Assertions.assertTrue(AmeriabankP.getLearnMore4IsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки exchange Rate")
    public void ExchangeRateIsActive() {
        Assertions.assertTrue(AmeriabankP.getExchangeRateIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки EXCHANGE")
    public void ExchangeIsActive() {
        Assertions.assertTrue(AmeriabankP.getExchangeButtonIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки GOLD")
    public void GoldIsActive() {
        Assertions.assertTrue(AmeriabankP.getGoldIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки CASH")
    public void CashIsActive() {
        Assertions.assertTrue(AmeriabankP.getCashIsActive());
    }

    @Test
    @DisplayName("Проверка активности кнопки NON-CASH")
    public void NonCashIsActive() {
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
    public void TransfersTest() {
        String expectedUrl = "https://ameriabank.am/en/personal/accounts";
        String actualUrl = AmeriabankP.transfersButtonTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Открытие страницы Online loan")
    public void OnlineLoanTest() {
        String expectedUrl = "https://ameriabank.am/en/personal/loans";
        String actualUrl = AmeriabankP.onlineLoanButtonTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Открытие страницы Distance banking")
    public void DistanceBankingTest() {
        String expectedUrl = "https://ameriabank.am/en/personal/accounts/accounts-management/myameria";
        String actualUrl = AmeriabankP.distanceBankingButtonTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Открытие страницы Distance banking")
    public void SavingsTest2() {
        String expectedUrl = "https://ameriabank.am/en/personal/saving";
        String actualUrl = AmeriabankP.SavingsButtonTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");

    }
}
