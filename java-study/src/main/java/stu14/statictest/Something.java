package stu14.statictest;

public class Something {
    public static void main(String[] args) {
        Other o = new Other();
        new Something().addOne(o);
    }
    public void addOne(final Other o) {
        o.i++; // 修改的是对象的属性
        //o = null;
    } 
    
    /*
    public int addOne(final int x) { 
        return ++x; 
    } */

}

class Other {
    int i = 1;
}
