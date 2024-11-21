/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenoitu;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class GameNoiTu {

    public static int chon_choi_may_kho = 1;
    public static int chon_choi_may_vua = 3;
    public static int chon_choi_may_de = 4;
    public static int chon_thoat = 2;

    int nguoi_choi_chon = 0;

    public void run() {
        while (nguoi_choi_chon != 2) {
            hien_menu();
            nguoi_dung_chon();
            if (nguoi_choi_chon == chon_choi_may_kho) {
                choi_may_kho();
            } else if (nguoi_choi_chon == chon_choi_may_vua) {
                choi_may_vua();
            } else if (nguoi_choi_chon == chon_choi_may_de) {
                choi_may_de();
            } else if (nguoi_choi_chon == chon_thoat) {
                System.out.println("Cam on vi da den");
            }

        }

    }

    private void choi_may_kho() {
        System.out.println("====================Game đã bắt đầu");
        BoKiemTra bkt = new BoKiemTra();
        May may = new May(100);
        while (true) {
            System.out.println("+++++ Lượt của bạn : ");
            Scanner sn = new Scanner(System.in);
            String tu_nguoi_choi_nhap = sn.nextLine().trim();
            boolean is_tu_dung = bkt.kiem_tra_tu_nguoi_choi(tu_nguoi_choi_nhap);
            if (is_tu_dung == false) {
                System.out.println("+++++ Vui lòng nhập lại : ");
                tu_nguoi_choi_nhap = sn.nextLine().trim();
                is_tu_dung = bkt.kiem_tra_tu_nguoi_choi(tu_nguoi_choi_nhap);
                if (!is_tu_dung) {
                    System.out.println("Máy đã thắng bạn quá gà");
                    break;
                }
            }

            boolean is_tu_chuan = bkt.kiem_tra_tu_chuan2(tu_nguoi_choi_nhap);
            if (is_tu_chuan == false) {
                System.out.println("Máy đã thắng bạn chưa đủ kiến thức từ điển");
                break;
            }

            System.out.println("---- Lượt của máy : ");
            String tu_cua_may = may.ra_tu(tu_nguoi_choi_nhap);
            System.out.println(tu_cua_may);
            if (tu_cua_may == null) {
                System.out.println("Bạn là vua tứ nồi, Xin cam on vi da den");
                break;
            }
        }

        System.out.println("====================Game đã kết thúc");
        System.out.println("");
        System.out.println("");
    }

    private void choi_may_vua() {
        System.out.println("====================Game đã bắt đầu");
        BoKiemTra bkt = new BoKiemTra();
        May may = new May(50);
        while (true) {
            System.out.println("+++++ Lượt của bạn : ");
            Scanner sn = new Scanner(System.in);
            String tu_nguoi_choi_nhap = sn.nextLine().trim();
            boolean is_tu_dung = bkt.kiem_tra_tu_nguoi_choi(tu_nguoi_choi_nhap);
            if (is_tu_dung == false) {
                System.out.println("+++++ Vui lòng nhập lại : ");
                tu_nguoi_choi_nhap = sn.nextLine().trim();
                is_tu_dung = bkt.kiem_tra_tu_nguoi_choi(tu_nguoi_choi_nhap);
                if (!is_tu_dung) {
                    System.out.println("Máy đã thắng bạn quá gà");
                    break;
                }
            }

            boolean is_tu_chuan = bkt.kiem_tra_tu_chuan2(tu_nguoi_choi_nhap);
            if (is_tu_chuan == false) {
                System.out.println("Máy đã thắng bạn chưa đủ kiến thức từ điển");
                break;
            }

            System.out.println("---- Lượt của máy : ");
            String tu_cua_may = may.ra_tu(tu_nguoi_choi_nhap);
            System.out.println(tu_cua_may);
            if (tu_cua_may == null) {
                System.out.println("Bạn là vua tứ nồi, Xin cam on vi da den");
                break;
            }
        }

        System.out.println("====================Game đã kết thúc");
        System.out.println("");
        System.out.println("");
    }

    private void choi_may_de() {
        System.out.println("====================Game đã bắt đầu");
        BoKiemTra bkt = new BoKiemTra();
        May may = new May(5);
        while (true) {
            System.out.println("+++++ Lượt của bạn : ");
            Scanner sn = new Scanner(System.in);
            String tu_nguoi_choi_nhap = sn.nextLine().trim();
            boolean is_tu_dung = bkt.kiem_tra_tu_nguoi_choi(tu_nguoi_choi_nhap);
            if (is_tu_dung == false) {
                System.out.println("+++++ Vui lòng nhập lại : ");
                tu_nguoi_choi_nhap = sn.nextLine().trim();
                is_tu_dung = bkt.kiem_tra_tu_nguoi_choi(tu_nguoi_choi_nhap);
                if (!is_tu_dung) {
                    System.out.println("Máy đã thắng bạn quá gà");
                    break;
                }
            }

            boolean is_tu_chuan = bkt.kiem_tra_tu_chuan2(tu_nguoi_choi_nhap);
            if (is_tu_chuan == false) {
                System.out.println("Máy đã thắng bạn chưa đủ kiến thức từ điển");
                break;
            }

            System.out.println("---- Lượt của máy : ");
            String tu_cua_may = may.ra_tu(tu_nguoi_choi_nhap);
            System.out.println(tu_cua_may);
            if (tu_cua_may == null) {
                System.out.println("Bạn là vua tứ nồi, Xin cam on vi da den");
                break;
            }
        }

        System.out.println("====================Game đã kết thúc");
        System.out.println("");
        System.out.println("");
    }

    private void hien_menu() {
        System.out.println("= Chào mừng đến với game nối từ =");
        System.out.println("======= vui lòng chọn ===========");
        System.out.println("1. Chơi với máy khó.");
        System.out.println("3. Chơi với máy vừa.");
        System.out.println("4. Chơi với máy dễ.");
        System.out.println("2. Thoát.");

    }

    private void nguoi_dung_chon() {
        while (true) {
            System.out.println("Vui lòng nhập lựa chọn : ");
            Scanner input = new Scanner(System.in);
            String nguoi_dung_nhap = input.nextLine();
            try {
                nguoi_choi_chon = Integer.parseInt(nguoi_dung_nhap);
                if (nguoi_choi_chon == chon_choi_may_kho) {
                    break;
                } else if (nguoi_choi_chon == chon_thoat) {
                    break;
                } else if (nguoi_choi_chon == chon_choi_may_vua) {
                    break;
                } else if (nguoi_choi_chon == chon_choi_may_de) {
                    break;
                } else {
                    System.out.println("Nhập sai rồi nhập lại đê");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai rồi nhập lại đê");
                nguoi_choi_chon = -1;
            }
        }

    }

    public static void main(String[] args) {
        GameNoiTu g = new GameNoiTu();
        g.run();

//        BoKiemTra bkt = new BoKiemTra();
//        Scanner input = new Scanner(System.in);
//        System.out.println(bkt.kiem_tra_tu_nguoi_choi(input.nextLine()));
//        String s1 = "ngộ không";
//        String s2 = "Không gian";
//        System.out.println(bkt.kiem_tra_hai_tu(s1, s2));
//
//String s1 = "con bò";
//        System.out.println(bkt.kiem_tra_tu_chuan(s1));
//String s="bò sữa";
//May m = new May(100);
//        System.out.println(m.ra_tu(s));
    }

}
