package easy;

public class ReformatDate1507 {
    public String reformatDate(String date) {
        StringBuilder sb = new StringBuilder();
        String[] splitDate = date.split(" ");
        sb.append(splitDate[2]).append("-");
        sb.append(reformatMonth(splitDate[1])).append("-");
        sb.append(reformatDay(splitDate[0]));
        return sb.toString();
    }

    public String reformatDay(String day) {
        String d = day.substring(0, day.length() - 2);
        return d.length() == 1 ? 0 + d : d;
    }

    public String reformatMonth(String month) {
        switch (month) {
            case "Jan":
                return "01";
            case "Feb":
                return "02";
            case "Mar":
                return "03";
            case "Apr":
                return "04";
            case "May":
                return "05";
            case "Jun":
                return "06";
            case "Jul":
                return "07";
            case "Aug":
                return "08";
            case "Sep":
                return "09";
            case "Oct":
                return "10";
            case "Nov":
                return "11";
            case "Dec":
                return "12";
        }
        return "";
    }
//    Best Solution
//public String reformatDate(String date) {
//    StringBuilder sb = new StringBuilder();
//    sb.append(date.substring(date.length() - 4)).append("-");
//    String m = date.length() == 13 ? date.substring(5, 8) : date.substring(4, 7);
//
//    switch (m) {
//        case "Jan":
//            sb.append("01-");
//            break;
//        case "Feb":
//            sb.append("02-");
//            break;
//        case "Mar":
//            sb.append("03-");
//            break;
//        case "Apr":
//            sb.append("04-");
//            break;
//        case "May":
//            sb.append("05-");
//            break;
//        case "Jun":
//            sb.append("06-");
//            break;
//        case "Jul":
//            sb.append("07-");
//            break;
//        case "Aug":
//            sb.append("08-");
//            break;
//        case "Sep":
//            sb.append("09-");
//            break;
//        case "Oct":
//            sb.append("10-");
//            break;
//        case "Nov":
//            sb.append("11-");
//            break;
//        case "Dec":
//            sb.append("12-");
//            break;
//    }
//
//    if (date.length() < 13) {
//        sb.append("0");
//        sb.append(date.substring(0, 1));
//    } else {
//        sb.append(date.substring(0, 2));
//    }
//
//    return sb.toString();
//}
}
