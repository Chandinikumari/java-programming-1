import java.lang.*;
class stringException extends Exception{
    public stringException(String s){

        super(s);
    }
}
class Ques8{

    private int value;

    public <T> double twoThird(T a) throws stringException{
        
        if(a.getClass() ==   String.class)
            throw new stringException("string value passed");

        int num = (Integer)a;
        double res = ((num*2)/3);

        return  res;
    }

    public static void main(String[] args) {
        Ques8 ob = new Ques8();
        try{
            System.out.println(ob.twoThird(8));
            System.out.println(ob.twoThird("chandini"));
            
        }
        catch(Exception e){
            System.out.println("Exception occured: " + e );
        }
        
    }
}