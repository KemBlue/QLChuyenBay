package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import DTO.ThongKeDTO;
import connection.DataConnection;


public class ThongKeDAO {

    public static ArrayList<ThongKeDTO> getDataThongKe() {
        ArrayList<ThongKeDTO> ds = new ArrayList<>();
        try {
            String sql = "SELECT CHUYENBAY.MACHUYENBAY, CHUYENBAY.SHMB, CHUYENBAY.NGAYBAY, SUM(VE.GIA) AS TongGia FROM VE JOIN CHUYENBAY ON VE.MACB = CHUYENBAY.MACHUYENBAY GROUP BY CHUYENBAY.MACHUYENBAY, CHUYENBAY.SHMB, CHUYENBAY.NGAYBAY;";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while (rs.next()) {
                ThongKeDTO tk = new ThongKeDTO(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getFloat(4));
                ds.add(tk);
            }
        } catch (Exception e) {
            System.out.println("Loi khong the lay du lieu");
        }
        return ds;
    }
    
    public static ArrayList<ThongKeDTO> getDataThongKeTheoMaChuyenBay(String macb) {
        ArrayList<ThongKeDTO> ds = new ArrayList<>();
        try {
            String sql = "SELECT CHUYENBAY.MACHUYENBAY, CHUYENBAY.SHMB, CHUYENBAY.NGAYBAY, SUM(VE.GIA) AS TongGia FROM VE JOIN CHUYENBAY ON VE.MACB = CHUYENBAY.MACHUYENBAY WHERE CHUYENBAY.MACHUYENBAY = '"+macb+"' GROUP BY CHUYENBAY.MACHUYENBAY, CHUYENBAY.SHMB, CHUYENBAY.NGAYBAY;";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while (rs.next()) {
                ThongKeDTO tk = new ThongKeDTO(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getFloat(4));
                ds.add(tk);
            }
        } catch (Exception e) {
            System.out.println("Loi khong the lay du lieu");
        }
        return ds;
    }
    
    public static ArrayList<String> getDataMaChuyenBay() {
        ArrayList<String> ds = new ArrayList<>();
        try {
            String sql = "SELECT MACHUYENBAY FROM CHUYENBAY";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while (rs.next()) {
                ds.add(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println("Loi khong the lay du lieu");
        }
        return ds;
    }
    
    public static String getFullname(String user) {
        String username = "";
        try {
            String sql = "select ten_nhanvien from nhanvien where ten_dang_nhap = '"+user.trim()+"'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                 username=rs.getString(1).trim();
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return username;
    }
    
    
    
    
    
}
