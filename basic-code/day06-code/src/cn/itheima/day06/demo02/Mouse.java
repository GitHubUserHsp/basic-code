package cn.itheima.day06.demo02;

public class Mouse implements Usb{
    @Override
    public void open() {

        System.out.println("打开鼠标");
    }
    @Override
    public void close(){

        System.out.println("关闭鼠标");
    }

    public  void click(){
        System.out.println("点击鼠标");
    }


}
