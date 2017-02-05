package com.iflytek.autofly.commons.utils;

import android.text.TextUtils;
import android.util.Log;

import java.lang.reflect.Method;

/**
 * Provides method to read or write system properties.
 */
public class SysProperties {

    private static final String TAG = "SysProperties";

    private static final String SYSTEM_PROPERTIES = "android.os.SystemProperties";
    private static final String METHOD_GET = "get";

    /**
     * Get property value of integer type from {@code key},
     * if error occurs, return {@code defaultValue}.
     * <p>
     *
     * @param key          The key to get property
     * @param defaultValue The default value if get error occurs.
     * @return The value of the key.
     */
    public static int getIntProp(String key, int defaultValue) {
        int value = defaultValue;
        try {
            Class< ? > c = Class.forName(SYSTEM_PROPERTIES);
            Method getMethod = c.getMethod(METHOD_GET, String.class,
                    String.class);
            value = Integer.parseInt((String) (getMethod.invoke(c, key,
                    "unknown")));
        } catch (Exception e) {
            Log.e(TAG, "get int property error.", e);
        }
        return value;
    }

    /**
     * Get property value of string type frow {@code key}.
     * <p>
     *
     * @param key The key to get property
     * @return The value pointed by the key.
     */
    public static String getStringProp(String key) {
        if (TextUtils.isEmpty(key)) {
            return "";
        }
        String value = "";
        try {
            Class< ? > c = Class.forName(SYSTEM_PROPERTIES);
            Method getMethod = c.getMethod(METHOD_GET, String.class,
                    String.class);
            value = (String) (getMethod.invoke(c, key, ""));
        } catch (Exception e) {
            Log.e(TAG, "get string property error.", e);
            return value;
        }
        return value;
    }
}
