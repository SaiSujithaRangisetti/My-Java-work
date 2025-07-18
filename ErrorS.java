package EnUm;

import java.util.HashMap;
import java.util.Map;

public enum ErrorS {
    WRONG_PIN, INSUFFICINET_BALANCE, NETWORK_ERROR, DAILY_LIMIT_EXCEEDED, MONTHLY_LIMIT_EXCEEDED, YOUR_CARD_INVALID, YOUR_TRANASACTION_IS_ILLEGAL;

    public static void main(String[] args) {
        Map<Integer, ErrorS> errorC = new HashMap<>();

        int code = 100;
        for (ErrorS error : ErrorS.values()) {
            errorC.put(code, error);
            code++;
        }
        System.out.println(errorC);
        System.out.println("Error Code → Error Type:");
        for (Map.Entry<Integer, ErrorS> entry : errorC.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
