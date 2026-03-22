public class BirthdayExperiment {
    public static void(String[] args_){
        int testAge1 = 4;
        String testSeason1 = "spring birth season";

        int testAge2 = 8;
        String testSeason2 = "unknown birth season";

        System.out.println("Test 1 (Spring): " + genBirthDay(testAge1, testSeason1));
        System.out.println("Test 2 (Unknown): " + genBirthDay(testAge2, testSeason2));
    }
    public static String genBirthDay(int age, String season) {
        int currentYear = 2024;
        int birthYear = currentYear - age;
        String monthAndDay = "";
        switch (season.toLowerCase()) {
            case "spring":
                monthAndDay = "-03-21";
                break;
            case "summer":
                monthAndDay = "-06-21";
                break;
            case "fall":
                monthAndDay = "-09-21";
                break;
            case "winter":
                monthAndDay = "-12-21";
                break;
            default:
                monthAndDay = "-01-01";
                break;
        }
        return birthYear + monthAndDay;
    }
}
