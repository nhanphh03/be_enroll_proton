package nhanph.proton.enroll.repository;

import nhanph.proton.enroll.dto.capturedimage.CapturedImageResponse;
import nhanph.proton.enroll.entity.CapturedImage;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * {@code @Package:} nhanph.proton.enroll.mapper
 * {@code @author:} nhanph
 * {@code @date:} 3/8/2025 2025
 * {@code @Copyright:} @nhanph
 */

@Repository
public interface CapturedImageRepository extends JpaRepository<CapturedImage, Long> {

    @Query("SELECT new nhanph.proton.enroll.dto.capturedimage.CapturedImageResponse(ci.id, ci.pathImage) " +
            "FROM CapturedImage ci " +
            "ORDER BY ci.capturedTime DESC")
    List<CapturedImageResponse> findByPeopleId(Pageable pageable);
}