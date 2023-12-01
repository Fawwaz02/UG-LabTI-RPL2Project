package datamahasiswa;

public class MahasiswaBaru {
        private final String kode, nama;
        private final int harga;
        
        public MahasiswaBaru(String kode,  String nama, int harga) {
            this.kode = kode;
            this.nama = nama;
            this.harga = harga;
        }
        public String getkode() {
            return kode;
        }
        public String getnama() {
            return nama;
        }
        public int getharga() {
            return harga;
        }

        public String tosString() {
            return String.format("kode : %s\n Nama : %s\n Harga : %d",kode, nama, harga);
        }
    }

