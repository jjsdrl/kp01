package day20231101;

public interface Playable {
//    3、创建一个接口Playable，具有抽象方法play()。然后创建两个类Guitar和 Piano，实现Playable接口
//    ，并在每个类中实现play()方法以模拟各自乐器的演奏。在main方法中，创建Guitar和 Piano对象，并调用它们的play()方法。
void play();

}
class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println("吉他发出了声音！！！");
    }
}
class Piano implements Playable{

    @Override
    public void play() {
        System.out.println("钢琴发出了声音！！！");
    }
}

class TestPlayable {
    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.play();
        Guitar guitar = new Guitar();
        guitar.play();
    }
}