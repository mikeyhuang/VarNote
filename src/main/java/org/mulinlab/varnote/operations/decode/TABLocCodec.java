package org.mulinlab.varnote.operations.decode;

import org.mulinlab.varnote.utils.format.Format;

public final class TABLocCodec extends LocCodec {

    public TABLocCodec(final Format format) {
        super(format, format.getHeaderPart() == null ? -1 : format.getHeaderPart().length);
    }

    @Override
    public void processBeg() {
        if ((format.getFlags() & 0x10000) != 0) ++intv.end;
        else  --intv.beg;
    }

    @Override
    public void processEnd() {
        intv.end = Integer.parseInt(parts[format.endPositionColumn - 1]);
    }

    @Override
    public void processOther() {
        if(format.isPos() && format.refPositionColumn > 1) {
            intv.end = intv.beg + parts[format.refPositionColumn - 1].length();
        }
    }
}