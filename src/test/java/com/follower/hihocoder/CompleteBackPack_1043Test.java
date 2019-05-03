package com.follower.hihocoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-3.
 */
public class CompleteBackPack_1043Test {

    @Test
    public void maxValue() throws Exception {
        Assert.assertEquals(CompleteBackPack_1043.maxValue(
                1000,
                new int[]{144, 487, 210, 567, 1056},
                new int[]{990, 436, 673, 58, 897}
            ), 5940);
    }

}