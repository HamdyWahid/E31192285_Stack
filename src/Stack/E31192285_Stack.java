package Stack;

class makanan {

    String urutan;
    makanan sebelumnya, selanjutnya;

    makanan(String j) {
        urutan = j;
        System.out.println("makanan " + j + " dibuat");
    }
}

class stacka {

    makanan atas, bawah;
    int jumlah, maks;

    stacka(int m) {
        maks = m;
        System.out.println("Stack " + m + " dibuat");
    }

    void push(String j) {
        if (jumlah < maks) {
            makanan baru = new makanan(j);
            if (atas == null) {
                atas = bawah = baru;
            } else {
                baru.selanjutnya = atas;
                atas.sebelumnya = baru;
                atas = baru;
            }
            jumlah++;
            tampil();
        } else {
            System.out.println("Stack sudah penuh");
        }
    }

    void tampil() {
        System.out.println("Isi Stack: ");
        for (makanan t = atas; t != null; t = t.selanjutnya) {
            System.out.println("Makanan " + t.urutan);
        }
    }

    void pop() {
        if (jumlah > 0) {
            makanan temp = atas;
            if (atas.selanjutnya == null) {
                atas = bawah = null;
            } else {
                atas = atas.selanjutnya;
                atas.sebelumnya = null;
                temp.selanjutnya = null;

            }
            jumlah--;
            tampil();
        } else {
            System.out.println("Tidak ada lagi yang bisa dihapus");
        }
    }
}

/**
 * MIF Golongan D / 16 / E31192285
 *
 * @author Hamdy Wahid
 */
public class E31192285_Stack {

    public static void main(String[] args) {
        makanan b = new makanan("1");
        stacka s = new stacka(5);
        s.push("2");
        s.push("3");
        s.push("4");
        s.push("5");
        s.push("6");
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
