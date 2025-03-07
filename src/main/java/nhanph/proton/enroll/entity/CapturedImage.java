package nhanph.proton.enroll.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * @Package: nhanph.proton.enroll.entity
 * @author: nhanph
 * @date: 3/6/2025 2025
 * @Copyright: @nhanph
 */
@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "capturedimages")
public class CapturedImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "path_image")
    private String pathImage;

    @Column(name = "object_id")
    private Integer objectId;

    @Column(name = "detected_status")
    private Byte detectedStatus;

    @Column(name = "captured_time")
    private Timestamp capturedTime;

    @Column(name = "people_id")
    private String peopleId;

    @Column(name = "camera_id")
    private Integer cameraId;

    @Column(name = "liveness_status")
    private String livenessStatus;

    @Column(name = "liveness_msg")
    private String livenessMsg;

    @Column(name = "key_id")
    private String keyId;

    @Column(name = "response_raw")
    private String responseRaw;

    @Column(name = "response_time")
    private Integer responseTime;
}
