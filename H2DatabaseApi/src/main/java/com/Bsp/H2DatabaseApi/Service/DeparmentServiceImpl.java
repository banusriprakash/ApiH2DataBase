package com.Bsp.H2DatabaseApi.Service;

import com.Bsp.H2DatabaseApi.Repositry.DeparmentRepositry;
import com.Bsp.H2DatabaseApi.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DeparmentServiceImpl implements DeparmentService{

    private DeparmentRepositry repositry;
    @Autowired
    public DeparmentServiceImpl(DeparmentRepositry repositry){
        this.repositry=repositry;
    }
    @Override
    public Department addDep(Department dep) {
        return repositry.save(dep);
    }

    @Override
    public List<Department> getDep() {
        List<Department> ls=repositry.findAll();
        return ls;
    }

    @Override
    public void Delete(int id) {
       Department dp= repositry.findById(id).get();
        repositry.delete(dp);
    }

    @Override
    public void updateDep(int id) {
        Department dt=repositry.findById(id).get();
        dt.setDeparmentName("Ece");
        dt.setDepartmentCode("1233");
        dt.setDepartmentAddress("Kpr");
        repositry.save(dt);
    }
}
