package xmlbean;

import java.security.MessageDigest;

/**
 * Created by liujiajia on 2017/3/8.
 */
public class MD5test {
    public static void main(String[] args) {
        System.out.println(toMD5("jamin1975"));
    }
    /**
     * MD5加密
     *
     * @param plainText
     * @return
     */
    public static String toMD5(String plainText) {
        try {
            byte[] hash;
            //生成实现指定摘要算法的 MessageDigest 对象。
            MessageDigest md = MessageDigest.getInstance("MD5");
            //byte[] bytes=plainText.getBytes("US-ASCII");
            md.update(plainText.toUpperCase().getBytes("ASCII"));
            //使用指定的字节数组更新摘要。
            //md.update(plainText.getBytes());
            //通过执行诸如填充之类的最终操作完成哈希计算。
            hash = md.digest();
            String s1 = new String(hash, "ASCII").replace("�", "?");
            return s1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
