package mockito;

import junit.BService;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class AService {
    BService bService;
    public BigDecimal getRenMinBi(BigDecimal money, String type) throws Exception {
        BigDecimal result = bService.getRenMinBi(money, type);
        if ("AMD".equals(type) || "JPY".equals(type)) {
            return result.setScale(1, RoundingMode.HALF_UP);
        } else {
            return result.setScale(0, RoundingMode.HALF_UP);
        }
    }
}

