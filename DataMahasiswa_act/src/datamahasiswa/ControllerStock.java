
package datamahasiswa;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerStock {
    ArrayList<MahasiswaBaru> ArrayStock;
    DefaultTableModel tableStock;
    
    public ControllerStock() {
        ArrayStock = new ArrayList<MahasiswaBaru>();
    }
    
    public void InsertStock(String kode, String nama, int harga) {
        MahasiswaBaru item = new MahasiswaBaru(kode, nama, harga);
        ArrayStock.add(item);
    }
    
    public DefaultTableModel showStock() {
        String[] col = {"Kode", "Nama", "Harga"};
        Object[][] objDt = new Object[ArrayStock.size()][3];
        int i = 0;
        
        for(MahasiswaBaru dt : ArrayStock) {
            String[] arrDt = { dt.getkode(), dt.getnama(), String.valueOf(dt.getharga()) };
            objDt[i] = arrDt;
            i++;
        }
        
        tableStock = new DefaultTableModel(objDt, col) {
            public boolean inCellEditTable(int rowIndex, int colIndex) {
                return false;
            }
        };
                
        return tableStock;
    }
}
