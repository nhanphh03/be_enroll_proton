package nhanph.proton.enroll.repository;

import nhanph.proton.enroll.entity.Camera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Package: nhanph.proton.enroll.repository
 * @author: nhanph
 * @date: 3/7/2025 2025
 * @Copyright: @nhanph
 */
@Repository
public interface CameraRepository extends JpaRepository<Camera, Long> {

}
