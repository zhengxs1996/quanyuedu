import com.sjm.springread.login.util.EncryptionUtil;
import org.junit.Test;

/**
 * @program: quanyuedu
 * @description:
 * @author: sjm
 * @create: 2019-09-22 15:16
 **/
public class test {
    @Test
    public void test1(){
        //创建密匙
        String aeskey = EncryptionUtil.createAESKEY();
        System.out.println(aeskey);
        //加密
        String pass = "123";
        String s = EncryptionUtil.AESEnc(aeskey, pass);
        System.out.println(s);
    }
}
