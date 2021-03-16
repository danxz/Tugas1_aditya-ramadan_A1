/* Contoh pengoperasian variabel bertype dasar */
public class Oprator {
    /**
    * @param args
    */
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    /* Kamus */
    boolean Bool1, Bool2, TF ; int i,j, hsl ;
    float x,y,res;
    /* algoritma */
    System.out.println ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");
    System.out.println ("------------------------------------------------------------------------------------------");
    System.out.println ("Boolean");
    Bool1 = true; 
    Bool2 = false;
    TF = Bool1 && Bool2 ; System.out.println(Bool1+" And "+Bool2+" = "+TF); /* Boolean AND */
    TF = Bool1 || Bool2 ; System.out.println(Bool1+" OR "+Bool2+" = "+TF); /* Boolean OR */
    TF = ! Bool1 ; System.out.println("~"+Bool1+" = "+TF); /* NOT */
    TF = Bool1 ^ Bool2; System.out.println(Bool1+" XOR "+Bool2+" = "+TF); /* XOR */
    
    /* operasi numerik */
    System.out.println ("------------------------------------------------------------------------------------------");
    System.out.println ("Operasi Numerik");
    i = 5; 
    j = 2 ;
    hsl = i+j; System.out.println("Hasil Dari "+((int)i)+" + "+((int)j)+"="+((int)hsl));
    hsl = i - j; System.out.println("Hasil Dari "+((int)i)+" - "+((int)j)+" = "+((int)hsl));
    hsl = i / j; System.out.println("Hasil Dari "+((int)i)+" / "+((int)j)+" = "+((int)hsl));
    hsl = i * j; System.out.println("Hasil Dari "+((int)i)+" * "+((int)j)+" = "+((int)hsl));
    hsl = i / j ; System.out.println("Hasil Dari "+((int)i)+" / "+((int)j)+" = "+((int)hsl)); /* pembagian bulat */
    hsl = i%j ; System.out.println("Hasil Dari "+((int)i)+" % "+((int)j)+" = "+((int)hsl)); /* sisa. modulo */
    
    
    /* operasi numerik */
    System.out.println ("------------------------------------------------------------------------------------------");
    System.out.println ("Operasi Numerik");
    x = 5 ; 
    y = 5 ;
    res = x + y; System.out.println("Hasil Dari "+((int)x)+" + "+((int)y)+" = "+((int)res));
    res = x - y; System.out.println("Hasil Dari "+((int)x)+" - "+((int)y)+" = "+((int)res));
    res = x / y; System.out.println("Hasil Dari "+((int)x)+" / "+((int)y)+" = "+((int)res));
    res = x * y; System.out.println("Hasil Dari "+((int)x)+" * "+((int)y)+" = "+((int)res));
    
    /* operasi relasional numerik */
    System.out.println ("------------------------------------------------------------------------------------------");
    TF = (i==j); System.out.println("i Sama Dengan j "+" = "+TF);
    TF = (i!=j); System.out.println("i Tidak Sama Dengan j "+" = "+TF);
    TF = (i < j); System.out.println("i Lebih Kecil dari j "+" = "+TF);
    TF = (i > j); System.out.println("i Lebih Besar dari j "+" = "+TF);
    TF = (i <= j); System.out.println("i Lebih Kecil Sama Dengan j "+" = "+TF);
    TF = (i >= j); System.out.println("i Lebih Besar Sama Dengan j "+" = "+TF);
    
    /* operasi relasional numerik */
    System.out.println ("------------------------------------------------------------------------------------------");
    TF = (x != y); System.out.println("x Tidak Sama Dengan y "+" = "+TF);
    TF = (x < y); System.out.println("x Lebih Kecil dari y "+" = "+TF);
    TF = (x > y); System.out.println("x Lebih Besar dari y "+" = "+TF);
    TF = (x <= y); System.out.println("x Lebih Kecil Sama Dengan y "+" = "+TF);
    TF = (x >= y); System.out.println("x Lebih Besar Sama Dengan y "+" = "+TF);
    }
}
