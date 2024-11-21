/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenoitu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author admin
 */
public class May {

    private int do_thong_minh = 0;
    private ArrayList<String> arrTu = new ArrayList<>();

    public May(int do_thong_minh) {
        this.do_thong_minh = do_thong_minh;
    }

    //nhan vao tu cua nguoi choi
    // trả ra tu hơp lệ
    public String ra_tu(String s) {
        tao_du_lieu();
        String ket_qua = null;

        //bố đời
        String s_cuoi = s.split(" ")[1];
        //s_cuoi = -đời-
        //s_cuoi + " " = -đời - 
        for (int i = 0; i < arrTu.size(); i++) {
            String tu_cua_may = arrTu.get(i);
            //ông nội
            //đời sống
            if (tu_cua_may.indexOf(s_cuoi + " ") == 0) {
                ket_qua = tu_cua_may;
                break;
            }
        }

        return ket_qua;
    }

    //bộ từ có sẵn
    private void tao_du_lieu() {
        if (arrTu.size() == 0 && do_thong_minh> 0 ) {
            Random r = new Random();
            String duong_dan = "C:\\Users\\admin\\Documents\\NetBeansProjects\\GameNoiTu\\src\\gamenoitu\\TuChuan.txt";
            try {
                BufferedReader br = new BufferedReader(new FileReader(duong_dan));
                String line = br.readLine();
                while (line != null) {
                    String s = line.trim();
                    if (s.length() > 0) {
                        if (r.nextInt(100) < do_thong_minh)//0 99
                        {
                            arrTu.add(s);
                        }
                    }
                    line = br.readLine();
                }
            } catch (Exception e) {

            }
        }
    }
}
