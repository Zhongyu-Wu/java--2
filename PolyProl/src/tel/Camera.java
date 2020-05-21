package tel;

public class Camera implements IPhoto {
    @Override
    public void photo() {
        System.out.println("手机可以拍照");
    }
}
