package com.leon.reading_counter.enums;

public enum BundleEnum {
    BILL_ID("bill_Id"),
    TYPE("type");

    private final String value;

    BundleEnum(final String newValue) {
        value = newValue;
    }

    public String getValue() {
        return value;
    }
}
