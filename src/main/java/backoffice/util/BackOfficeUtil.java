package backoffice.util;

import java.sql.Timestamp;
import java.util.Date;

public class BackOfficeUtil {

    public static Timestamp getCurrentDate() {
        final Date date = new Date();
        return new Timestamp(date.getTime());
    }
}
