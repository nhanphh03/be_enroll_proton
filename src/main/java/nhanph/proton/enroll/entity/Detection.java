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
 * {@code @author:} nhanph
 * {@code @date:} 3/6/2025 2025
 * {@code @Copyright:} @nhanph
 */
@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "detection")
public class Detection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "captured_image_path")
    private String capturedImagePath;

    @Column(name = "camera_id")
    private Integer cameraId;

    @Column(name = "people_id")
    private String peopleId;

    @Column(name = "response_time")
    private Integer responseTime;

    @Column(name = "recognization_status")
    private String recognizationStatus;

    @Column(name = "response_raw")
    private String responseRaw;

    @Column(name = "created_time")
    private Timestamp createdTime;

    @Column(name = "captured_time")
    private Timestamp capturedTime;

    @Column(name = "day_first_time")
    private Timestamp dayFirstTime;

    @Column(name = "day_noon_time")
    private Timestamp dayNoonTime;

    @Column(name = "liveness_status")
    private String livenessStatus;

    @Column(name = "key_id")
    private String keyId;

    @Column(name = "liveness_quick")
    private String livenessQuick;

    @Column(name = "liveness_quick_count")
    private Integer livenessQuickCount;

    @Column(name = "liveness_quick_rate")
    private Double livenessQuickRate;

    @Column(name = "liveness")
    private String liveness;

    @Column(name = "liveness_count")
    private Integer livenessCount;

    @Column(name = "liveness_rate")
    private Double livenessRate;
}
