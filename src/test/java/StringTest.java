import org.junit.Test;

/**
 * @author hzq
 * @date 2020/4/8 18:21
 */
public class StringTest {

    @Test
    public void test(){
        String s = "flower";
        String s1 = "fl";
        int i = s.indexOf(s1);
        System.out.println(i);

    }
}
