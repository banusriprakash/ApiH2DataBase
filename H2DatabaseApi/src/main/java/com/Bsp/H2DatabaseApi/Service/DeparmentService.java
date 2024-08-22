package com.Bsp.H2DatabaseApi.Service;

import com.Bsp.H2DatabaseApi.entity.Department;

import java.util.List;

public interface DeparmentService {

   public Department addDep(Department dep);

   public List<Department> getDep();

   public void Delete(int id);

   public void updateDep(int id);
}
