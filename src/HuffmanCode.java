public class HuffmanCode{

    //Yasin Akcil 02195076050 2. ogretim
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] alphabetCode = new char[27];
    //en cok tekrar edenden en aza sirali

    int[] alpSayi = new int[27];
    //kac defa kullanildigini gosteren index dizisi

    int tekrarSayisi = 0;
    char[] kodlar = new char[27];
    char[] yedekKodlar = new char[27];

    String metin = "";
    String binary = "";


    {
        for(int l=0;l<alpSayi.length;l++) {
            alpSayi[l] =0;
        }
    }

    public void tekrarBul(){
        for (int y=0;y<alphabetCode.length;y++){

            if(alphabetCode[y] == alphabetCode[y+1] ){
                tekrarSayisi = y;
                return;

            }
        }
    }

    public void sayAlp(String s){
        metin = s;
        for (int i=0;i<alphabet.length;i++){
            for (int j=0;j<s.length();j++){
                if(alphabet[i] == s.charAt(j)){
                    alpSayi[i] = alpSayi[i] +1;
                }
            }
        }
    }
    {

    }




    public void kodDonustur() {

        int max = 0;
        int maxindex = 0;
        for(int m=0;m<27;m++) {
            max = 0;
            maxindex = 0;
            for (int n = 0; n < alpSayi.length; n++) {
                if (max < alpSayi[n]) {
                    max = alpSayi[n];
                    maxindex = n;
                }
            }
            alphabetCode[m] = alphabet[maxindex];
            alpSayi[maxindex] = 0;

        }
        tekrarBul();


        for(int y=0;y<tekrarSayisi;y++){
            kodlar[y] = alphabetCode[y];

        }

    }

    public void yaz(){
        for (int a=0;a<kodlar.length;a++){
        }
    }

    public void kodYap(){ //stringi binary yapar.
        for (int e =0;e<metin.length();e++){

            if(metin.charAt(e)==kodlar[0]){ // 0. elemanda 0 yazar
                System.out.print("0");
                binary = binary + "0";
                continue;
            }else{
            for (int u=0;u<kodlar.length;u++){
                if(kodlar[u] == metin.charAt(e)){


                    for (int g =0;g<u;g++){
                        System.out.print("1");
                        binary = binary + "1";

                    }
                    System.out.print("0");
                    binary = binary + "0";

                }
            }}
        }
    }

    public static void main(String[] args) {
        HuffmanCode huffmanCode = new HuffmanCode();
        String degoisken = "bccdaa";
        huffmanCode.sayAlp(degoisken);
        huffmanCode.kodDonustur();
        huffmanCode.kodYap();
        System.out.println("");
        System.out.println(huffmanCode.binary);






    }


    }

