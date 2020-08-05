public class NgayTrongThang {
    private static final int THANG_1 = 1;
    private static final int THANG_2 = 2;
    private static final int THANG_3 = 3;
    private static final int THANG_4 = 4;
    private static final int THANG_5 = 5;
    private static final int THANG_6 = 6;
    private static final int THANG_7 = 7;
    private static final int THANG_8 = 8;
    private static final int THANG_9 = 9;
    private static final int THANG_10 = 10;
    private static final int THANG_11 = 11;
    private static final int THANG_12 = 12;
    private int thang, nam;
    private int soNgay;

    public void nhapThangNam(int gtthang, int gtnam) {
        this.thang = gtthang;
        this.nam = gtnam;
    }

    public void tinhSoNgay() {
        switch (thang) {
            case THANG_1:
            case THANG_3:
            case THANG_5:
            case THANG_7:
            case THANG_8:
            case THANG_10:
            case THANG_12:
                soNgay = 31;
                break;
            case THANG_4:
            case THANG_6:
            case THANG_9:
            case THANG_11:
                soNgay = 30;
                break;
            case THANG_2:
                if (nam % 4 == 0) {
                    soNgay = 29;
                } else soNgay = 28;
                break;
            default:
                break;
        }
    }
    public void inSoNgay() {
        System.out.println("So Ngay Cua Thang " + thang + "/" + nam + " la " + soNgay);
    }
}
