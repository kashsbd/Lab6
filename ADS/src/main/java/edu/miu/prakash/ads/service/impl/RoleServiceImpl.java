package edu.miu.prakash.ads.service.impl;

import edu.miu.prakash.ads.model.Role;
import edu.miu.prakash.ads.repository.RoleRepository;
import edu.miu.prakash.ads.service.RoleService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(Integer roleId) {
        return roleRepository.findById(roleId).orElse(null);
    }

    @Override
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRoleById(Integer roleId) {
        roleRepository.deleteById(roleId);
    }
}
