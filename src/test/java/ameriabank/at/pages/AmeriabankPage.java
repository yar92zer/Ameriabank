package ameriabank.at.pages;

import ameriabank.at.AllureLoggerCustom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.time.Duration;

// page_url = https://ameriabank.am/en/
public class AmeriabankPage {

    private final AllureLoggerCustom LOG = new AllureLoggerCustom(LoggerFactory.getLogger(AmeriabankPage.class));
    WebDriver driver;

    @FindBy(xpath = "//div[@id='banking-dropdown__button']")
    private WebElement OnlineBankingButton;

    @FindBy(xpath = "//a[@class='button button_secondary top1-product-home']")
    private WebElement learnMoreButton;

    @FindBy(xpath = "//a[@class='button button_secondary top2-credit-line']")
    private WebElement learnMore2Button;

    @FindBy(xpath = "//h6[normalize-space()='Cards']")
    private WebElement cardsButton;

    @FindBy(xpath = "//h6[normalize-space()='Transfers']")
    private WebElement transfersButton;

    @FindBy(xpath = "(//h6[normalize-space()='Online loan'])[1]")
    private WebElement onlineLoanButton;

    @FindBy(xpath = "//h6[normalize-space()='Distance banking']")
    private WebElement distanceBankingButton;

    @FindBy(xpath = "//h6[normalize-space()='Savings']")
    private WebElement savingsButton;

    @FindBy(xpath = "//a[normalize-space()='Apply online']")
    private WebElement applyOnlineButton;

    @FindBy(xpath = "//a[@class='button button_secondary']")
    private WebElement learnMore3Button;

    @FindBy(xpath = "//a[@href='https://ameriabank.am/campaigns/month-presents'][normalize-space()='Learn more']")
    private WebElement learnMore4Button;

    @FindBy(xpath = "//a[normalize-space()='the exchange rate for currency and gold']")
    private WebElement exchangeRateButton;

    @FindBy(xpath = "//label[normalize-space()='Exchange']")
    private WebElement exchangeButton;

    @FindBy(xpath = "//label[normalize-space()='Gold']")
    private WebElement goldButton;

    @FindBy(xpath = "//label[normalize-space()='cash']")
    private WebElement cashButton;

    @FindBy(xpath = "//label[normalize-space()='non-cash']")
    private WebElement nonCashButton;

    public boolean getOnlineBankingIsActive() {
        LOG.info("Проверка доступности кнопки 'Home'");
        return OnlineBankingButton.isEnabled();
    }

    public boolean getLearnMoreIsActive() {
        LOG.info("Проверка доступности кнопки 'Learn more'");
        return learnMoreButton.isEnabled();
    }

    public boolean getLearnMore2IsActive() {
        LOG.info("Проверка доступности кнопки 'Learn more 2'");
        return learnMore2Button.isEnabled();
    }

    public boolean getCardsIsActive() {
        LOG.info("Проверка доступности кнопки 'cards'");
        return cardsButton.isEnabled();
    }

    public boolean getTransfersIsActive() {
        LOG.info("Проверка доступности кнопки 'Transfers'");
        return transfersButton.isEnabled();
    }

    public boolean getOnlineLoanIsActive() {
        LOG.info("Проверка доступности кнопки 'Online loan'");
        return onlineLoanButton.isEnabled();
    }

    public boolean getDistanceBankingIsActive() {
        LOG.info("Проверка доступности кнопки 'Distance banking'");
        return distanceBankingButton.isEnabled();
    }

    public boolean getSavingsIsActive() {
        LOG.info("Проверка доступности кнопки 'Savings'");
        return savingsButton.isEnabled();
    }

    public boolean getApplyOnlineIsActive() {
        LOG.info("Проверка доступности кнопки 'Apply online'");
        return applyOnlineButton.isEnabled();
    }

    public boolean getLearnMore3IsActive() {
        LOG.info("Проверка доступности кнопки ' Learn more 3'");
        return learnMore3Button.isEnabled();
    }

    public boolean getLearnMore4IsActive() {
        LOG.info("Проверка доступности кнопки ' Learn more 3'");
        return learnMore4Button.isEnabled();
    }

    public boolean getExchangeRateIsActive() {
        LOG.info("Проверка доступности кнопки ' exchangeRate'");
        return exchangeRateButton.isEnabled();
    }

    public boolean getExchangeButtonIsActive() {
        LOG.info("Проверка доступности кнопки 'EXCHANGE'");
        return exchangeButton.isEnabled();
    }

    public boolean getGoldIsActive() {
        LOG.info("Проверка доступности кнопки 'GOLD'");
        return goldButton.isEnabled();
    }

    public boolean getCashIsActive() {
        LOG.info("Проверка доступности кнопки 'CASH'");
        return cashButton.isEnabled();
    }

    public boolean getNonCashIsActive() {
        LOG.info("Проверка доступности кнопки 'NON-CASH'");
        return nonCashButton.isEnabled();
    }

    public String cardsButtonTransition() {
        LOG.info("Переход на страницу Cards");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("animsition-loading")));
        cardsButton.click();
        return driver.getCurrentUrl();
    }

    public String transfersButtonTransition() {
        LOG.info("Переход на страницу 'Transfers'");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("animsition-loading")));
        transfersButton.click();
        return driver.getCurrentUrl();
    }

    public String onlineLoanButtonTransition() {
        LOG.info("Переход на страницу 'Online loan'");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("animsition-loading")));
        onlineLoanButton.click();
        return driver.getCurrentUrl();
    }

    public String distanceBankingButtonTransition() {
        LOG.info("Переход на страницу'Distance banking'");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("animsition-loading")));
        distanceBankingButton.click();
        return driver.getCurrentUrl();
    }

    public String savingsButtonTransition() {
        LOG.info("Переход на страницу'Savings'");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("animsition-loading")));
        savingsButton.click();
        return driver.getCurrentUrl();
    }

    public AmeriabankPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
