package com.checkpoint4.wecking.standingstillapp.data;


import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;
import android.text.format.Time;

/**
 * Created by andela on 10/6/15.
 */
public class StandingContract {

    public static final String CONTENT_AUTHORITY = "com.checkpoint.wecking.standingstillapp";

    public static final String PATH_STANDING = "standing";

    public static long normalizeDate(long startDate){
        Time time = new Time();
        time.setToNow();
        int julianDay = Time.getJulianDay(startDate, time.gmtoff);

        return time.setJulianDay(julianDay);
    }

    public static final class StandingEntry implements BaseColumns {
        public static final String URL = "content://" + CONTENT_AUTHORITY + "/" + PATH_STANDING;
        public static final Uri CONTENT_URI = Uri.parse(URL);

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_STANDING;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_STANDING;

        public static final String TABLE_NAME = "standing";

        public static  final String COLUMN_LOC_KEY = "location_id";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_SHORT_DESC = "short_desc";
        public static final String COLUMN_STANDING_ID = "standing_id";

        public static final String COLUMN_START_TIME = "start_time";
        public static final String COLUMN_STOP_TIME = "stop_time";
        public static final String COLUMN_STANDING_TIME = "standing_time";
        public static final String COLUMN_SET_RECORD_TIME = "set_record_time";

        public static final String COLUMN_STREET_NAME = "street";
        public static final String COLUMN_STATE_NAME = "state";
        public static final String COLUMN_COUNTRY_NAME = "country";
        public static final String COLUMN_COORD_LAT = "coord_lat";
        public static final String COLUMN_COORD_LONG = "coord_long";

        public static Uri buildStandingUri(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }
    }

}
