package CEF.Utils;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class LoggerUtil {

    @Step("{0}")
    public static void logStep(String step){
        log.info(step);
    }
}
