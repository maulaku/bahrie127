/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bahrie.tokobukuapp.implement;

import bahrie.tokobukuapp.entity.Penjualan;
import bahrie.tokobukuapp.interfaces.InterPenjualan;
import bahrie.tokobukuapp.koneksi.DatabaseUtilities;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bahrie
 */
public class ImplemPenjualan implements InterPenjualan{

    public Penjualan insert(Penjualan o) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("insert into penjualan values(null,?,?,?,?,?)");
        ps.setString(1, o.getBuku().getId());
        ps.setInt(2, o.getKasir().getId());
        ps.setInt(3, o.getJumlah());
        ps.setDouble(4, o.getTotal());
        ps.setDate(5, new java.sql.Date(o.getTanggal().getTime()));
        ps.executeUpdate();
        return o;
    }

    public void update(Penjualan o) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
