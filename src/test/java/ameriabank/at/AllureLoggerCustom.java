package ameriabank.at;

import io.qameta.allure.Step;
import org.slf4j.Logger;

public class AllureLoggerCustom {
    private final Logger logger;

    public AllureLoggerCustom(org.slf4j.Logger logger) {
        this.logger = logger;
    }

    @Step("{logText}")
    public void info(String logText) {
        logger.info(logText);
    }

    @Step("{logText}")
    public void infoWithScreenshot(String logText) {
        logger.info(logText);
        AllureAttachmentsManager.screenshot();
    }
}