package com.matheusmf.restaurant.utils;

import org.apache.commons.validator.routines.UrlValidator;

public class Utils {
    private static UrlValidator urlValidator = new UrlValidator(new String[]{"http","https"});

    public static boolean urlIsValid(String url) {
        return urlValidator.isValid(url);
    }
}
