package org.mulinlab.varnote.cmdline;

import org.junit.Test;
import org.mulinlab.varnote.cmdline.index.Index;
import org.mulinlab.varnote.utils.VannoUtils;
import org.mulinlab.varnote.utils.format.Format;
import utils.TestUtils;

public final class IndexTest {

    @Test
    public void testIndexVCF() {
        String[] args = new String[]{
                "-I", "src/test/resources/database4.sorted.vcf.gz" };

        TestUtils.initClass(Index.class, args, false);
    }

    @Test
    public void testIndexVCF1() {
        String[] args = new String[]{"-I", "/Users/hdd/Desktop/vanno/random/hg19/1kg.phase3.v5.shapeit2.eur.hg19.all.vcf.gz"};

        TestUtils.initClass(Index.class, args, false);
    }

    @Test
    public void testIndexTAB() {
        String[] args = new String[]{
                "-I", "src/test/resources/database3.sorted.tab.gz" ,
                "-HP", "src/test/resources/database3.sorted.tab.gz.header"};

        TestUtils.initClass(Index.class, args, false);
    }

    @Test
    public void testIndexBED() {
        String[] args = new String[]{
                "-I", "/Users/hdd/Desktop/vanno/VarNoteDB_FP_Roadmap_127Epi.bed.gz",
                "-HP", "/Users/hdd/Desktop/vanno/VarNoteDB_FP_Roadmap_127Epi.bed.gz.header"};

        TestUtils.initClass(Index.class, args, false);
    }

    @Test
    public void testIndexBED1() {
        String[] args = new String[]{
                "-I:bed,ref=4,alt=5", "/Users/hdd/Desktop/vanno/cepip/regbase_part.bed.gz",
                "-HP", "/Users/hdd/Desktop/vanno/cepip/regbase.header"};
        TestUtils.initClass(Index.class, args, false);
    }

    @Test
    public void format() {
        Format format = VannoUtils.checkQueryFormat("tab");

        System.out.println(format);
    }
}
