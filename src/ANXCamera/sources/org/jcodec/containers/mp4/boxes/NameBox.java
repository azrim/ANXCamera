package org.jcodec.containers.mp4.boxes;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.nio.ByteBuffer;
import org.jcodec.common.JCodecUtil2;
import org.jcodec.common.io.NIOUtils;

public class NameBox extends Box {
    private String name;

    public NameBox(Header header) {
        super(header);
    }

    public static NameBox createNameBox(String str) {
        NameBox nameBox = new NameBox(new Header(fourcc()));
        nameBox.name = str;
        return nameBox;
    }

    public static String fourcc() {
        return AppMeasurementSdk.ConditionalUserProperty.NAME;
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.put(JCodecUtil2.asciiString(this.name));
        byteBuffer.putInt(0);
    }

    public int estimateSize() {
        return JCodecUtil2.asciiString(this.name).length + 12;
    }

    public String getName() {
        return this.name;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.name = NIOUtils.readNullTermString(byteBuffer);
    }
}
