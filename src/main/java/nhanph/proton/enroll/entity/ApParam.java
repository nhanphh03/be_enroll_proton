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
@Table(name = "ap_param")
public class ApParam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autoid")
    private Long id;

    @Column(nullable = false)
    private String gr;
    private String name;
    private String value;
    private String description;
}
