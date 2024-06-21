
package data;


public class VehicleInformation {
    private String chuXe, moTa;
    private int maXe, dungTich;
    private double triGia;

    public VehicleInformation(String chuXe, String moTa, int maXe, int dungTich, double triGia) {
        this.chuXe = chuXe;
        this.moTa = moTa;
        this.maXe = maXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getMaXe() {
        return maXe;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
    
    public double tinhThue(){
        double thue;
        if(dungTich<100){
            thue=triGia*0.01;
        } else if(dungTich>=100 && dungTich<=200) {
            thue=triGia*0.03;
        }else thue=triGia*0.05;
        return thue;
    }

    @Override
    public String toString() {
        return String.format("|%8d|%4d|%-25s|%4.2f|%-25s|\n",
                             maXe,dungTich,chuXe,triGia,moTa);
    }
    
    public void showInformation() {
        System.out.println("|%8d Ma xe|%4d Dung tich|%-25s Chu xe|%4.2f Tri gia|%-25s Mo ta|\n");
    }
    
    
}
