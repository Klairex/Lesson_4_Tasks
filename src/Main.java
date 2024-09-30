// Task 1 - Enumerarea lunilor anului
enum LunileAnului {
    IANUARIE, FEBRUARIE, MARTIE, APRILIE, MAI, IUNIE, IULIE, AUGUST, SEPTEMBRIE, OCTOMBRIE, NOIEMBRIE, DECEMBRIE
}

// Task 2 - Enumerarea zilelor saptamanii
enum ZileleSaptaminii {
    LUNI, MARTI, MIERCURI, JOI, VINERI, SIMBATA, DUMINICA;
// creare metoda isWeekday()
    public boolean isWeekDay() {
        if (this == SIMBATA || this == DUMINICA) {
            return false;
        } else {
            return true;
        }
    }
    // creare metoda isWeekEnd()
    public boolean isWeekEnd() {
        if (this == SIMBATA || this == DUMINICA) {
            return true;
        } else {
            return false;
        }
    }
}

// Task 3  - Convertirea din string in tipuri primitive


//Declarare metode

public static boolean stringToBoolean(String str) {
    return Boolean.parseBoolean(str);
}
public static byte stringToByte(String str) {
    return Byte.parseByte(str);
}
public static int stringToInt(String str) {
    return Integer.parseInt(str);
}
public static long stringToLong(String str) {
    return Long.parseLong(str);
}
public static double stringToDouble(String str) {
    return Double.parseDouble(str);
}
public static float stringToFloat(String str) {
    return Float.parseFloat(str);
}
public static short stringToShort(String str) {
    return Short.parseShort(str);
}






    public static void main(String[] args) {
        // Task 1 Result
        System.out.println("\nTask 1 Result:\n");
        for (LunileAnului lunileAnului : LunileAnului.values()) {
            System.out.println(lunileAnului.name());
        }

        // Task 2 Result
        System.out.println("\n\n\nTask 2 Result:\n");
        for (ZileleSaptaminii zileleSaptaminii : ZileleSaptaminii.values()) {
            System.out.println(zileleSaptaminii.name() + " este WeekDay: " + zileleSaptaminii.isWeekDay());
            System.out.println(zileleSaptaminii.name() + " este WeekEnd: " + zileleSaptaminii.isWeekEnd());
        }

        // Task 3 Result
        System.out.println("\n\n\nTask 3 Result:\n");

        //Declararea stringurilor

        String stringBoolean = "tRue";
        String stringByte = "120";
        String stringShort = "32000";
        String stringInt = "147895632";
        String stringLong = "987654321987654321";
        String stringDouble = "4444.5d";
        String stringFloat = "2354.56f";
        System.out.println("String to Boolean: " + stringToBoolean(stringBoolean));
        System.out.println("String to Byte: " + stringToByte(stringByte));
        System.out.println("String to Short: " + stringToShort(stringShort));
        System.out.println("String to Int: " + stringToInt(stringInt));
        System.out.println("String to Long: " + stringToLong(stringLong));
        System.out.println("String to Double: " + stringToDouble(stringDouble));
        System.out.println("String to Float: " + stringToFloat(stringFloat));



    }


