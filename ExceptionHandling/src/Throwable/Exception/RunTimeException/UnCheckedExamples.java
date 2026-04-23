package Throwable.Exception.RunTimeException;

public class UnCheckedExamples {
    public static void main(String[] args){
        //==============================================================================================
        //ArithmeticException
        try{
            int result = 10 / 0;

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        //==============================================================================================
        //ClassCastException
        try{
            Object i = Integer.valueOf("10");
            String s = (String) i; // خطأ: لا يمكن تحويل Integer إلى String

        }catch (ClassCastException e){
            System.out.println("ClassCastException");
        }
        //==============================================================================================
        //NumberFormatException
        try{
            String input = "ABC";
            int number = Integer.parseInt(input);  // خطأ: لا يمكن تحويل String إلى Integer

        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }
        //==============================================================================================
        //NullPointerException
        try{
            String str = null;
            str.length(); // خطأ: str لا تشير إلى أي كائن

        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
        //==============================================================================================
        //ArrayIndexOutOfBoundsException
        try{
            int[] arr = {1, 2, 3};
            int val = arr[5]; // خطأ: المصفوفة تنتهي عند المؤشر 2

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        //==============================================================================================
        //ArrayStoreException
        try{
            Object[] arr = new String[3];
            arr[0] = 10; // خطأ: لا يمكن وضع Integer في مصفوفة من نوع String

        }catch (ArrayStoreException e){
            System.out.println("ArrayStoreException");
        }
        //==============================================================================================
        //IllegalThreadStateException
        try{
            Thread t = new Thread();
            t.start();
            t.start(); // خطأ: لا يمكن تشغيل نفس الخيط مرتين

        }catch (IllegalThreadStateException e){
            System.out.println("IllegalThreadStateException");
        }
        //==============================================================================================
    }
}
