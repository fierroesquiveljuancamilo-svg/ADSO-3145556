package com.sena.app.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.app.Entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}