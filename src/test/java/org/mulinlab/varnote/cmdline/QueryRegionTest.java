package org.mulinlab.varnote.cmdline;

import org.junit.Test;
import org.mulinlab.varnote.cmdline.tools.QueryRegion;
import utils.TestUtils;

public final class QueryRegionTest {

    @Test
    public void testIndex() {

        String[] args = new String[]{ "-D:db,tag=d1,index=TBI", "/Users/hdd/Downloads/test_data/database1.sorted.bed.gz",
                "-D:db,tag=d2", "/Users/hdd/Downloads/test_data/database2.sorted.tab.gz",
                "-D", "/Users/hdd/Downloads/test_data/database3.sorted.tab.gz",
                "-Q", "chr1:1-100000",
                "--log=false", "-L=true"};

        TestUtils.initClass(QueryRegion.class, args);
    }
}
