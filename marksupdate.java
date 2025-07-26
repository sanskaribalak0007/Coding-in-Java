public class marksupdate {

    public static void update(int Marks[]){
        for(int i=0; i < Marks.length; i++){
            Marks[i]=Marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int Marks[] = {97,98,99};
        update(Marks);

        for(int i=0;i<Marks.length;i++){
            System.out.print(Marks[i]+" ");
        }
    }
}
