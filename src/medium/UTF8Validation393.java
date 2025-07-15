package medium;

public class UTF8Validation393 {
    public boolean validUtf8(int[] data) {
        int n = data.length;
        for (int i = 0; i < data.length; ) {
            int count = countFirstBit(data[i]);
            switch (count) {
                case 0:
                    i++;
                    break;
                case 1:
                    return false;
                case 2:
                    if (n - i <= 1) return false;
                    if (countFirstBit(data[i + 1]) != 1) return false;
                    i += 2;
                    break;
                case 3:
                    if (n - i <= 2) return false;
                    if (countFirstBit(data[i + 1]) != 1 || countFirstBit(data[i + 2]) != 1) return false;
                    i += 3;
                    break;
                case 4:
                    if (n - i <= 3) return false;
                    if (countFirstBit(data[i + 1]) != 1 || countFirstBit(data[i + 2]) != 1 || countFirstBit(data[i + 3]) != 1)
                        return false;
                    i += 4;
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public int countFirstBit(int num) {
        int count = 0;
        while ((num & 128) == 128) {
            count++;
            num <<= 1;
        }
        return count;
    }

    //Popular solution
//    public boolean validUtf8(int[] data) {
//        boolean valid = true;
//        int need = 0;
//        for(int i : data){
//            if(need == 0){
//                if((i>>3) == 0b11110) need = 3;
//                else if((i>>4) == 0b1110) need = 2;
//                else if((i>>5) == 0b110) need = 1;
//                else if((i>>7) == 0) need = 0;
//                else return false;
//            } else {
//                if((i>>6) != 0b10) return false;
//                need--;
//            }
//        }
//        return need == 0;
//    }

    //Best solution
//    public boolean validUtf8(int[] data) {
//        return f(data, 0);
//    }
//
//    boolean f(int[] data, int start) {
//        if (start == data.length) {
//            return true;
//        }
//        int bytes = 0;
//        loop:
//        for (int k = start; k < data.length; k++) {
//            int num = data[k];
//            for (int i = 7; i >= 0; i--) {
//                if ((num & (1 << i)) > 0) {
//                    if (++bytes > 4)
//                        return false;
//                } else {
//                    break loop;
//                }
//            }
//        }
//        if (bytes == 0) {
//            return data.length > start && f(data, start + 1);
//        }
//        if (bytes == 1) {
//            return false;
//        }
//        if (data.length < start + bytes)
//            return false;
//        for (int i = start + 1; i < start + bytes; i++) {
//            if (data[i] < 128 || data[i] >= 192) {
//                return false;
//            }
//        }
//        return f(data, start + bytes);
//    }
}
