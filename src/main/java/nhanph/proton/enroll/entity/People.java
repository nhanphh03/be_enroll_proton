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
@Table(name = "people")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="people_id")
    private String peopleId;

    @Column(name ="full_name")
    private String fullName;

    @Column(name ="date_of_birth")
    private Timestamp dateOfBirth;

    @Column(name ="Gender")
    private String gender;

    @Column(name ="registered_branch")
    private String registeredBranch;

    @Column(name ="customer_type")
    private Integer customerType;

    @Column(name ="group_id")
    private Integer groupId;

    @Column(name ="Last_checkin_time")
    private Timestamp lastCheckinTime;

    @Column(name ="image_path")
    private String imagePath;

    @Column(name ="status")
    private Byte status;

    @Column(name ="mobile_phone")
    private String mobilePhone;

    @Column(name ="enable_notification")
    private Byte enableNotification;

    @Column(name ="greeting_text")
    private String greetingText;

    @Column(name ="greeting_audio")
    private String greetingAudio;

    @Column(name ="avatar")
    private String avatar;
}
