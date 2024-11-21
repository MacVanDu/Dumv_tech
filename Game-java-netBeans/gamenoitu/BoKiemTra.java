/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenoitu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class BoKiemTra {

    public boolean kiem_tra_tu_nguoi_choi(String s) {
        boolean ket_qua = true;
        //dau ve dinh dang 
        //con ga
        // con ga
        //nyc 
        String s_fm = s.trim();
        //con ga => split(" ") => ["con","ga"]
        //tha => split(" ") => ["tha"]
        if (s_fm.split(" ").length != 2) {
            ket_qua = false;
        }
        return ket_qua;
    }

    public boolean kiem_tra_hai_tu(String s1, String s2) {
        boolean ket_qua = true;
        //con ga => split(" ") => ["con","ga"]
        String arr1[] = s1.toLowerCase().split(" ");
        String arr2[] = s2.toLowerCase().split(" ");
        if (!arr1[1].equals(arr2[0])) {
            ket_qua = false;
        }
        return ket_qua;
    }

    public boolean kiem_tra_tu_chuan(String s1) {
        tao_bo_tu();
        boolean ket_qua = true;
        String s_1 = s1.toLowerCase().trim();
        if (bo_tu_chuan.indexOf(s_1) < 0) {
            ket_qua = false;
        }
        return ket_qua;
    }

    public boolean kiem_tra_tu_chuan2(String s1) {
        tao_bo_tu2();
        boolean ket_qua = false;
        //con gà
        //s_1 = con
        //s_2 = gà
        String s_1 = s1.toLowerCase().split(" ")[0];
        String s_2 = s1.toLowerCase().split(" ")[1];
        if (bo_tu_chuan_2.get(s_1) != null//""
                && bo_tu_chuan_2.get(s_2) != null) {
            ket_qua = true;
        }

        return ket_qua;
    }

    // duliet du
    // thamdu du2
    //
    public HashMap<String, String> bo_tu_chuan_2 = new HashMap<String, String>();

    public void tao_bo_tu2() {
        if (bo_tu_chuan_2.size() == 0) {
            String duong_dan = "C:\\Users\\admin\\Documents\\NetBeansProjects\\GameNoiTu\\src\\gamenoitu\\TuChuan.txt";
            try {
                BufferedReader br = new BufferedReader(new FileReader(duong_dan));
                String line = br.readLine();
                while (line != null) {
                    String s = line.trim();
                    if (s.length() > 0) {
                        String arr[] = s.split(" ");
                        //con cec
                        //con c
                        if(arr.length==2){
                        bo_tu_chuan_2.put(arr[0], "");//con ""
                        bo_tu_chuan_2.put(arr[1], "");//cec ""
                        }
                    }
                    line = br.readLine();
                }

            } catch (FileNotFoundException ex) {
                
                Logger.getLogger(BoKiemTra.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BoKiemTra.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    // a b c
    // 0 1 2
    // -1
    public ArrayList<String> bo_tu_chuan = new ArrayList<>();

    public void tao_bo_tu() {
        if (bo_tu_chuan.size() == 0) {
            String duong_dan = "C:\\Users\\admin\\Documents\\NetBeansProjects\\GameNoiTu\\src\\gamenoitu\\TuChuan.txt";
            try {
                BufferedReader br = new BufferedReader(new FileReader(duong_dan));
                String line = br.readLine();
                while (line != null) {
                    String s = line.trim();
                    if (s.length() > 0) {
                        bo_tu_chuan.add(s);
                    }
                    line = br.readLine();
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(BoKiemTra.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BoKiemTra.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
