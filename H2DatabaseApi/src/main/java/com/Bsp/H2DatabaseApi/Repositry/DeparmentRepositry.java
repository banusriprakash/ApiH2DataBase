package com.Bsp.H2DatabaseApi.Repositry;

import com.Bsp.H2DatabaseApi.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeparmentRepositry extends JpaRepository<Department,Integer> {

}
