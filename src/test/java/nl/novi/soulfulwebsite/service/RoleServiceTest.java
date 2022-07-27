package nl.novi.soulfulwebsite.service;

import nl.novi.soulfulwebsite.model.Role;
import nl.novi.soulfulwebsite.repository.RoleRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


@SpringBootTest
public class RoleServiceTest {

    @MockBean
    private RoleRepository roleRepository;

    @Autowired
    RoleService roleService;

    @Test
    public void testFindByName() {
        String name = "Admin";
        Role role = new Role();
        Mockito.when(roleRepository.findRoleByName(name)).thenReturn(role);

        Role result = roleRepository.findRoleByName("Admin");

        Assertions.assertEquals("", result);
    }
}