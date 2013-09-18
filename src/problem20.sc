import java.math.BigDecimal

(1 to 100 map (new BigDecimal(_)) reduce (_.multiply(_))).toPlainString.map(_.asDigit).sum