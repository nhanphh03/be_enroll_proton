package nhanph.proton.enroll.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Package: nhanph.proton.enroll.dto
 * @author: nhanph
 * @date: 3/7/2025 2025
 * @Copyright: @nhanph
 */

@Data
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
    private String camera_group;
}
