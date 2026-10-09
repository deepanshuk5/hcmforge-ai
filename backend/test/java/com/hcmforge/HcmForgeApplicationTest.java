package com.hcmforge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HcmForgeApplicationTest {
    @Test
    void testGetProductName() {
        String actualString = HcmForgeApplication.getProductName();
        String expectedString = "HCMForge-AI";
        assertEquals(expectedString, actualString);
    }
}
