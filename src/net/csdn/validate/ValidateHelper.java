package net.csdn.validate;

/**
 * User: WilliamZhu
 * Date: 12-7-3
 * Time: 下午6:24
 */
public class ValidateHelper {
    public static String length = "length";
    public static String presence = "presence";
    public static String numericality = "numericality";
    public static String message = "message";
    public static String uniqueness = "uniqueness";

    public static class Numericality {
        public static String greater_than = "greater_than";
        public static String greater_than_or_equal_to = "greater_than_or_equal_to";
        public static String equal_to = "equal_to";
        public static String less_than = "less_than";
        public static String less_than_or_equal_to = "less_than_or_equal_to";
        public static String odd = "odd";
        public static String even = "even";
    }

    public static class Length {
        public static String minimum = "minimum";
        public static String maximum = "maximum";
        public static String too_short = "too_short";
        public static String too_long = "too_long";
    }
}