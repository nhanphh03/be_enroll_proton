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


import lombok.Data;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "camera")
public class Camera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "camera_id")
    private Long cameraId;

    @Column(name = "camera_name")
    private String cameraName;

    @Column(name = "camera_description")
    private String cameraDescription;

    private String link;

    @Column(name = "created_time")
    private Timestamp createdTime;

    private Byte status;

    private Double positionX;

    private Double positionY;

    @Column(name = "camera_group")
    private String cameraGroup;

    @Column(name = "face_source")
    private String faceSource;

    private String cam3d;
}
