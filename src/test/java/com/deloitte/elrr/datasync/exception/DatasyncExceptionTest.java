package com.deloitte.elrr.datasync.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author phleven
 *
 */
@SuppressWarnings("checkstyle:linelength")
public class DatasyncExceptionTest {

    private final String message = "DatasyncException" + "Exception Message";

    private final Exception e = new NullPointerException();

    private DatasyncException datasyncException = new DatasyncException(
            message);

    /**
     * @author phleven
     */
    @Test
    public void testTipExceptionWithMessage() {
        assertEquals(datasyncException.getMessage(), message);
    }
}
