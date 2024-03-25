package DTO;

import java.util.Date; // Import để sử dụng kiểu Date

public class ThongKeDTO {
    private String maChuyenBay;
    private String shmb;
    private Date ngayBay; // Sử dụng kiểu Date cho trường ngày
    private double tongGia;

    // Constructors
    public ThongKeDTO() {
        // Constructor mặc định
    }

    public ThongKeDTO(String maChuyenBay, String shmb, Date ngayBay, double tongGia) {
        this.maChuyenBay = maChuyenBay;
        this.shmb = shmb;
        this.ngayBay = ngayBay;
        this.tongGia = tongGia;
    }

    // Getter và Setter cho từng trường
    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public String getShmb() {
        return shmb;
    }

    public void setShmb(String shmb) {
        this.shmb = shmb;
    }

    public Date getNgayBay() {
        return ngayBay;
    }

    public void setNgayBay(Date ngayBay) {
        this.ngayBay = ngayBay;
    }

    public double getTongGia() {
        return tongGia;
    }

    public void setTongGia(double tongGia) {
        this.tongGia = tongGia;
    }
}

