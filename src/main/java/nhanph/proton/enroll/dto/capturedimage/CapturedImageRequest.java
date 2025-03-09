package nhanph.proton.enroll.dto.capturedimage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CapturedImageRequest {
    private String pathImage;
    private String keyId;
    private String detectStatus;
    private String capturedTime;
    private String peopleId;
    private String cameraId;
    private String responseRaw;
    private Long responseTime;
}
