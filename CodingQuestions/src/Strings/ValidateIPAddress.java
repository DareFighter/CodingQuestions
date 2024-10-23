package Strings;

public class ValidateIPAddress {

    public boolean isValid(String s) {
        String[] parts = s.split("\\.");

        // An IPV4 address must have exactly 4 parts
        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            // Check if the part is a valid number
            if (!isValidPart(part)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidPart(String part) {
        // Check if the part is empty or has invalid characters
        if (part.isEmpty() || part.length() > 3) {
            return false;
        }

        // Check if part starts with '0' and is more than 1 character long
        if (part.charAt(0) == '0' && part.length() > 1) {
            return false;
        }

        // Check if part is a valid integer betwen 0 and 255
        try {

            int num = Integer.parseInt(part);
            return num > 0 && num <= 255;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
