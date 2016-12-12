/**
 * Created by e165731 on 2016/12/12.
 */
public class report5 {
    public static void main(String[]args){
        try{
            String str=null;
            System.out.println(str.length());
        }
        catch(NullPointerException s){
            System.out.println("NullPointerExceptionが発生しました。");
            s.printStackTrace();
        }
    }
}

