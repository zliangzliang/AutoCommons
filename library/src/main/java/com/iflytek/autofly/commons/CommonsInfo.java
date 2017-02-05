package com.iflytek.autofly.commons;

/**
 * Provide common informations.
 */
public interface CommonsInfo {

    /**
     * The version of the library, expressed as a String.
     */
    String VERSION = "1.0.1";

    /**
     * The version of the library, expressed as an integer.
     * <p>
     * Three digits are used for each component of {@link #VERSION}. For example "1.2.3" has the
     * corresponding integer version 1002003 (001-002-003), and "123.45.6" has the corresponding
     * integer version 123045006 (123-045-006).
     */
    int VERSION_INT = 1000001;

}
