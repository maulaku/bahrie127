/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.stta.bahrie.entiy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bahrie
 */
public class DetailKrs implements Serializable {

    private int id;
    private String id_wktu;
    private String nim;
    private String kd_mk;
    private List<Mahasiswa> detailMhs=new ArrayList<Mahasiswa>();
    private List<Mk> detailMk=new ArrayList<Mk>();
    private List<WaktuKrs> detailWkt=new ArrayList<WaktuKrs>();

    public List<Mahasiswa> getDetailMhs() {
        return detailMhs;
    }

    public void setDetailMhs(List<Mahasiswa> detailMhs) {
        this.detailMhs = detailMhs;
    }

    public List<Mk> getDetailMk() {
        return detailMk;
    }

    public void setDetailMk(List<Mk> detailMk) {
        this.detailMk = detailMk;
    }

    public List<WaktuKrs> getDetailWkt() {
        return detailWkt;
    }

    public void setDetailWkt(List<WaktuKrs> detailWkt) {
        this.detailWkt = detailWkt;
    }

    public String getId_wktu() {
        return id_wktu;
    }

    public void setId_wktu(String id_wktu) {
        this.id_wktu = id_wktu;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKd_mk() {
        return kd_mk;
    }

    public void setKd_mk(String kd_mk) {
        this.kd_mk = kd_mk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
