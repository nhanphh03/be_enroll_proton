package nhanph.proton.enroll.service.impl;

import lombok.RequiredArgsConstructor;
import nhanph.proton.enroll.repository.GroupRepository;
import nhanph.proton.enroll.service.GroupService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;
}
