package nhanph.proton.enroll.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @Package: nhanph.proton.enroll.dto
 * {@code @author:} nhanph
 * {@code @date:} 3/7/2025 2025
 * {@code @Copyright:} @nhanph
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CameraResponse {
    private String name;
    private String rtspURL;
    private String cameraId;
    private String description;
    private double positionX;
    private double positionY;
    private String faceSource;
    private String cam3d;
    @JsonProperty(value = "camera_group")
    private String cameraGroup;

}
