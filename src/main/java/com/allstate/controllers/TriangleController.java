package com.allstate.controllers;


import com.allstate.models.Triangle;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TriangleController {
    @RequestMapping(value = "/triangle/area", method = RequestMethod.POST)
    public double area(@RequestBody List<Triangle> triangles){
        return Triangle.area(triangles);
    }
}
