
package single_noncircular_tugas;

public class SinglyLinkedListApp {
     public static void main(String[] ar)
    {
        SinglyLinkedList lk = new SinglyLinkedList ();
       /*
    lk.insertAwal(100); 
        lk.display();
        lk.insertAkhir(200);
        lk.display();
        lk.insertAtPos(50,1);
        lk.display();
        lk.insertAtPos(80,2);
        lk.display();
        lk.deleteAtPos(1);
        lk.display();
*/
        lk.insertAwal(100); 
        lk.display();
        lk.insertAkhir(200);
        lk.display();
        lk.insertAtPos(50,1); //(menambahkan nilai yang akan di tambahkan,pointer)
        lk.display();
        lk.insertAtPos(80,2); //memotong pada pointer ke
        lk.display();
        lk.deleteAtPos(1); //menghapus nilai pada pointer yg dipilih
        lk.display();
    }
}