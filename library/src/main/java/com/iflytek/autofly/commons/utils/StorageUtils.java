package com.iflytek.autofly.commons.utils;

import android.os.Environment;
import java.io.File;

/**
 * Provide methods relating the storage card.
 */

public class StorageUtils {

    public static long getExternalSDAvailableSpace() {
        String storageDirectory = Environment.getExternalStorageDirectory().toString();
        return getAvailableSpace(storageDirectory);
    }

    /**
     * Get availabe space of the path {@code storageDirectory}.
     *
     * @param storageDirectory The path to get available space.
     * @return The number of available bytes
     */
    public static long getAvailableSpace(String storageDirectory) {
        try {
            File path = new File(storageDirectory);
            return path.getUsableSpace();
        } catch (RuntimeException ex) {
            return 0;
        }
    }
}
