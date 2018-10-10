public class main {
public static void main (String[] args){
Shinobi[] m = new Shinobi[3];
m[0] = new Shinobi();
m[0].setNoreg("012606");
m[0].setNama("Uciha Sasuke");
m[0].setPeringkat("Genin");

m[1] = new Shinobi();
m[1].setNoreg("012607");
m[1].setNama("Uzumaki Naruto");
m[1].setPeringkat("Genin");

m[2] = new Shinobi();
m[2].setNoreg("012601");
m[2].setNama("Haruno Sakura");
m[2].setPeringkat("Chunin");

System.out.println( "Data Shinobi  \n");
for (Shinobi x:m){
System.out.println("Nomer Registrasi :"+ x.getNoreg());
System.out.println("Nama :"+ x.getNama());
System.out.println("Peringkat :"+ x.getPeringkat());
System.out.println();
}
}
}
