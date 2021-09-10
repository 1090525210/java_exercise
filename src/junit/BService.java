package junit;

import java.math.BigDecimal;
public class BService {
    public BigDecimal getRenMinBi(BigDecimal money, String type) throws Exception {
        if (money == null) {
            throw new Exception("money cannot be null");
        } else {
            if ("AMD".equals(type)) {
                return money.multiply(new BigDecimal(6.5));
            } else if ("JPY".equals(type)) {
                return money.multiply(new BigDecimal(0.06));
            } else if ("CNY".equals(type)) {
                return money;
            } else {
                throw new Exception("unknown type:" + type);
            }
        }
    }
}

