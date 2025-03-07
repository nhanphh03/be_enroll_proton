package nhanph.proton.enroll.entity;

import jakarta.persistence.Entity;
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
 * @date: 3/7/2025 2025
 * @Copyright: @nhanph
 */
@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
public class Role {
    @Id
    private Long id;

    private String name;
    private Timestamp createdTime;
    private Byte status;
}
