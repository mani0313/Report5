/**
 * Created by e165731 on 2016/12/12.
 */
public class report5 {
    public static void main(String[]args){
        double value;
        try{
            String str="3．14";
            value = Double.parseDouble(str);
            System.out.println(value);
        }
        catch(NullPointerException s){
            System.out.println("NullPointerExceptionが発生しました。");
            s.printStackTrace();
        }
    }
}

