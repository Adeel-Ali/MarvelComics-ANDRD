/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/26/2016
 */
package com.marvel.gateway.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum DateDescriptorEnum {
    LASTWEEK, //TODO: Write general description for this element
    NEXTWEEK, //TODO: Write general description for this element
    THISMONTH, //TODO: Write general description for this element
    THISWEEK; //TODO: Write general description for this element

    private static TreeMap<String, DateDescriptorEnum> valueMap = new TreeMap<String, DateDescriptorEnum>();
    private String value;

    static {
        LASTWEEK.value = "lastWeek";
        NEXTWEEK.value = "nextWeek";
        THISMONTH.value = "thisMonth";
        THISWEEK.value = "thisWeek";

        valueMap.put("lastWeek", LASTWEEK);
        valueMap.put("nextWeek", NEXTWEEK);
        valueMap.put("thisMonth", THISMONTH);
        valueMap.put("thisWeek", THISWEEK);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return	The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static DateDescriptorEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return	The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }

    /**
     * Convert list of DateDescriptorEnum values to list of string values
     * @param toConvert The list of DateDescriptorEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<DateDescriptorEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (DateDescriptorEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 