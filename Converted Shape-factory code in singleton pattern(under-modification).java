public class singleton
private static singleton ins;
 private singleton()
 {
    public static singleton getinstance(){
        if(ins==null)
        ins =new singleton();
    }
    return ins;
 }

 public class singletonpattern(){
    public static void main(string[] args)
    { singleton singleton = singleton.getinstance();

    singleton.Rectangle();
    singleton.Square();

    }
 }
