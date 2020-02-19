package com.cdyweb.api;

import com.cdyweb.dto.Employee;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Api
@RestController
@RequestMapping("/v1/employees")
public class Controller {
    @GetMapping(value="", produces="application/json")
    public List<Employee> getEmployees() {
        List<Employee> result = new ArrayList<Employee>();
        result.add(new Employee("some-uuid"));
        return result;
    }
}
