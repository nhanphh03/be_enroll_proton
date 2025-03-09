package nhanph.proton.enroll.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/groups"})
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentServiceImpl departmentService;
}
