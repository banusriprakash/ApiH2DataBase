package com.Bsp.H2DatabaseApi.Controller;

import com.Bsp.H2DatabaseApi.Repositry.DeparmentRepositry;
import com.Bsp.H2DatabaseApi.Service.DeparmentService;
import com.Bsp.H2DatabaseApi.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Dep")
public class Controller {
  private DeparmentService service;
  @Autowired
  public Controller(DeparmentService service){
    this.service=service;
  }

  @GetMapping("/")
    public List<Department> getDep(){

      return service.getDep();
  }

  @PostMapping("/add")
  public Department addDep(@RequestBody Department dep){
    return service.addDep(dep);
  }

  @PutMapping("/update/{id}")
  public void updateDep(@PathVariable int id){
    service.updateDep(id);
  }

  @DeleteMapping("/delete/{id}")
  public void Delete(@PathVariable int id){
    service.Delete(id);
  }

}
