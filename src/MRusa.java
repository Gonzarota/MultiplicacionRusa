public class MRusa {



    public int multiplicacionRusa(int a,int b){
        int suma=0;
        if(a>0&&b>0) {
            while(a>=1){
                if(a%2!=0){
                    suma=suma+b;
                }
                a=a/2;
                b=b*2;
                }
            }
        return suma;
    }
}

