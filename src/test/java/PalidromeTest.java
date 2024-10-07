import com.javafullstack.practice.PalidromeString;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class PalidromeTest {
    //PalidromeString ps = new PalidromeString();

    @ParameterizedTest
    @ValueSource(strings = {"madam", "liril", "laxman"})
    public void testPolydrome(String str){
        PalidromeString ps = new PalidromeString();
        boolean actualResult = ps.equals(str);
    }

}
