package study.TEST;

class Data3{
    int x;
}

public class ReferenceReturnType {

    public static void main(String[] args) {
        Data3 data3 = new Data3();
        data3.x=10;
        Data3 copy = copy(data3);
        System.out.println("data3.x : " +data3.x);
        System.out.println("copy.x : " +copy.x);
    }
    static Data3 copy(Data3 data3){
        Data3 temp = new Data3();
        temp.x = data3.x;

        return temp;
    }
}
