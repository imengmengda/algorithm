package com.follower.algorithm_4th;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.follower.algorithm_4th.Gcd;
import org.junit.Test;

/**
 * Created by lin on 18-5-24.
 */
public class GcdTest {

    @Test(timeout = 100)
    public void testGcd() {
        assertEquals(5, Gcd.gcd(15, 20));
    }
}
